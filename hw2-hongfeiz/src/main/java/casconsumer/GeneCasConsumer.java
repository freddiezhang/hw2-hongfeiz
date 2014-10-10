package casconsumer;

import edu.cmu.deiis.types.RecogGene;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

public class GeneCasConsumer extends CasConsumer_ImplBase {

  /**
   * Name of configuration parameter that set the path of Output file.
   */
  public static final String PARAM_OUTPUTDIR = "OutputFile";

  private File mOutputFile;
  
  private File outFile;
  
  /**
   * Called when the CAS Consumer is first created
   */
  public void initialize() throws ResourceInitializationException {
    mOutputFile = new File(((String) getConfigParameterValue(PARAM_OUTPUTDIR)).trim());
    try { 
      if (mOutputFile.exists()) {
        mOutputFile.delete();
      }
      mOutputFile.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
    outFile = new File("hw2-hongfeiz.out");   
    if (outFile.exists()) {
      outFile.delete();
    }
    try {
      outFile.createNewFile();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  /**
   * Obtain gene mention tagging results from Aggregate Analysis Engine and write into output file.
   */
  public void processCas(CAS aCAS) throws ResourceProcessException {
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new ResourceProcessException(e);
    }
    FSIterator<Annotation> it = jcas.getAnnotationIndex(RecogGene.type).iterator();
    RecogGene outputGene = new RecogGene(jcas);
    while (it.hasNext()) {
      outputGene = (RecogGene) it.next();      
      try {
        String id = outputGene.getGeneId();
        String gene = outputGene.getGeneText();
        int begin = outputGene.getBegin();
        int end = outputGene.getEnd();
        
        String outputsentence = id + "|" + begin + " " + end + "|" + gene + "\n";
        FileOutputStream outStream = new FileOutputStream(outFile,true);
        outStream.write(outputsentence.getBytes("UTF-8"));
        outStream.close();
       
      }catch (IOException e) {
        throw new ResourceProcessException(e);
      }
    }
  
  }

}
