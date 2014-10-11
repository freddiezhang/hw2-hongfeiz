package annotator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;

import com.aliasi.chunk.Chunk;

import edu.cmu.deiis.types.Input;
import edu.cmu.deiis.types.Output;
import edu.cmu.deiis.types.RecogGene;

public class MyGeneAnnotator extends JCasAnnotator_ImplBase {

  /**
   * ID of Output and RecogGene type system.
   */
  private String sentenceId;
  /**
   * Text of Output type system.
   */
  private String Text;
  /**
   * Begin offset of a gene tag operated by Abner or Lingpipe.
   */
  private int Begin;
  /**
   * End offset of a gene tag operated by Abner or Lingpipe.
   */
  private int End;
  /**
   * Id of NER annotator.
   */
  private String processorId;
  /**
   * Confidence of result of a NER annotator.
   */
  private double conf;
  /**
   * Aggregate processing results of Abner and Lingpipe, and output the final gene tags.
   */
  public void process(JCas aJCas){
    FSIterator<Annotation> it = aJCas.getAnnotationIndex(Output.type).iterator();
    Output inSentence = new Output(aJCas);
    Map<Integer, Integer> begin2end = new HashMap<Integer, Integer>();
    while(it.hasNext()){
      inSentence = (Output)it.next();
      sentenceId = inSentence.getOutputId();
      Text = inSentence.getOutputGene();
      Begin = inSentence.getBegin();
      End = inSentence.getEnd();
      processorId = inSentence.getCasProcessorId();
      conf = inSentence.getConfidence();
      RecogGene gene = new RecogGene(aJCas);
      if("Abner".equals(processorId)){
        begin2end.put(Begin, End);
      }
      else if ("Lingpipe".equals(processorId)){    
        if(conf>0.7){
          gene.setGeneId(sentenceId);
          gene.setGeneText(Text);
          gene.setBegin(Begin);
          gene.setEnd(End);
          gene.addToIndexes();
        }
        else if(conf<=0.7 && conf>0.35){
          if(begin2end.containsKey(Begin)){
            if(begin2end.get(Begin)==End){
              gene.setGeneId(sentenceId);
              gene.setGeneText(Text);
              gene.setBegin(Begin);
              gene.setEnd(End);
              gene.addToIndexes();
            }
          }
        }
      }      
    }
  }
}
