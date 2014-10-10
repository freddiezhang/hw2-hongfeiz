package annotator;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.*;
import org.apache.uima.jcas.tcas.Annotation;


import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;

import edu.cmu.deiis.types.Input;
import edu.cmu.deiis.types.Output;


public class LingPipeAnnotator extends JCasAnnotator_ImplBase {

  /**
   * ID of Input and Output type system
   */
  private String sentenceId;
  /**
   * Text of input type system
   */
  private String inText;
  /**
   * Begin offset of a gene tag operated by Lingpipe.
   */
  private int inBegin;
  /**
   * End offset of a gene tag operated by Lingpipe.
   */
  private int inEnd;
  /**
   * Text of a gene tag
   */
  private String outText;
  /**
   * Begin offset of a gene tag
   */
  private int outBegin;
  /**
   * End offset of a gene tag
   */
  private int outEnd;
  /**
   * Name of configuration parameter that set the path of Lingpipe dictionary.
   */
  public static final String PARAM_DICDIR = "dicDir";
  /**
   * A ConfidenceChunker object used in Lingpipe
   */ 
  private ConfidenceChunker chunker;
  /**
   * Initialize the chunker.
   */
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    super.initialize(aContext);
    String file = ((String) aContext.getConfigParameterValue(PARAM_DICDIR)).trim();
    // Get config. parameter value
    try {
      chunker = (ConfidenceChunker) AbstractExternalizable.readResourceObject(LingPipeAnnotator.class, file);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  /**
   * Use Lingpipe to recognize aJCas and put results into Output type.
   */
  public void process(JCas aJCas) {    
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(Input.type).iterator();
    Input inSentence = new Input(aJCas);
    while(it.hasNext()){
      inSentence =(Input) it.next();
      sentenceId = inSentence.getInputId();
      inText = inSentence.getInputText();    
      char[] cs = inText.toCharArray();
      Iterator<Chunk> iter = chunker.nBestChunks(cs,0,cs.length,40);
      //System.out.println("Conf      Span     Phrase");
      while(iter.hasNext()){
          Chunk chunk = iter.next();
          double conf = Math.pow(2.0,chunk.score());
          inBegin = chunk.start();
          inEnd = chunk.end();
          outText = inText.substring(inBegin,inEnd);
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
          out.setCasProcessorId("Lingpipe");
          out.setConfidence(conf);
          out.addToIndexes();
          //System.out.println(conf + "     " + "(" + outBegin + ", " + outEnd + ")  " + outText);
       }
    }
    
    
  }

}
