package annotator;


import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import java.util.regex.*;

import edu.cmu.deiis.types.Input;
import edu.cmu.deiis.types.Output;
import abner.Tagger;

public class AbnerAnnotator extends JCasAnnotator_ImplBase {

  /**
   * ID of input and output type system
   */
  private String sentenceId;
  /**
   * Text of input type system
   */
  private String inText;
  /**
   * Begin offset of a gene tag operated by stanford CoreNLP
   */
  private int inBegin;
  /**
   * End offset of a gene tag operated by stanford CoreNLP
   */
  private int inEnd;
  
  private String outText;
  /**
   * Begin offset of a gene tag
   */
  private int outBegin;
  /**
   * End offset of a gene tag
   */
  private int outEnd;
  
  private Tagger tagger;

  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    super.initialize(aContext);
    tagger = new Tagger();
  }
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(Input.type).iterator();
    Input inSentence = new Input(aJCas);
    while(it.hasNext()){
      inSentence =(Input) it.next();
      sentenceId = inSentence.getInputId();
      inText = inSentence.getInputText();         
      String[][] sentences = tagger.getEntities(inText);
      
      //System.out.println("inText"); 
      for(int i = 0; i< sentences[0].length; i++){
        outText = sentences[0][i];
        inBegin = inText.indexOf(sentences[0][i]);
        if(inBegin == -1)
          continue;
        if(Pattern.matches("[0-9a-zA-z-\\s]+", sentences[0][i])==false)
          continue;
        int len = sentences[0][i].length();
        inEnd = inBegin + len;
        int current = 0;
        int numOfSpace1 = 0;
        int numOfSpace2 = 0;
        for(current = 0; current<inBegin; current++){
          if(inText.charAt(current)==' '){
            numOfSpace1++;
          }
        }
        for(current = 0; current<inEnd; current++){
          if(inText.charAt(current)==' '){
            numOfSpace2++;
          }     
        }
        outBegin = inBegin - numOfSpace1;
        outEnd = inEnd - numOfSpace2 - 1;
        Output out = new Output(aJCas);
        out.setOutputId(sentenceId);
        out.setOutputGene(outText);
        out.setBegin(outBegin);
        out.setEnd(outEnd);            
        out.setCasProcessorId("Abner");
        out.addToIndexes();
      }
    }
    
   
  }

}
