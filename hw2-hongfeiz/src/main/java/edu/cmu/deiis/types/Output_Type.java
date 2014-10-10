
/* First created by JCasGen Wed Oct 08 02:34:21 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Oct 09 22:22:08 EDT 2014
 * @generated */
public class Output_Type extends Annotype_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Output_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Output_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Output(addr, Output_Type.this);
  			   Output_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Output(addr, Output_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Output.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Output");
 
  /** @generated */
  final Feature casFeat_outputId;
  /** @generated */
  final int     casFeatCode_outputId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOutputId(int addr) {
        if (featOkTst && casFeat_outputId == null)
      jcas.throwFeatMissing("outputId", "edu.cmu.deiis.types.Output");
    return ll_cas.ll_getStringValue(addr, casFeatCode_outputId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOutputId(int addr, String v) {
        if (featOkTst && casFeat_outputId == null)
      jcas.throwFeatMissing("outputId", "edu.cmu.deiis.types.Output");
    ll_cas.ll_setStringValue(addr, casFeatCode_outputId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_outputGene;
  /** @generated */
  final int     casFeatCode_outputGene;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOutputGene(int addr) {
        if (featOkTst && casFeat_outputGene == null)
      jcas.throwFeatMissing("outputGene", "edu.cmu.deiis.types.Output");
    return ll_cas.ll_getStringValue(addr, casFeatCode_outputGene);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOutputGene(int addr, String v) {
        if (featOkTst && casFeat_outputGene == null)
      jcas.throwFeatMissing("outputGene", "edu.cmu.deiis.types.Output");
    ll_cas.ll_setStringValue(addr, casFeatCode_outputGene, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Output_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_outputId = jcas.getRequiredFeatureDE(casType, "outputId", "uima.cas.String", featOkTst);
    casFeatCode_outputId  = (null == casFeat_outputId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_outputId).getCode();

 
    casFeat_outputGene = jcas.getRequiredFeatureDE(casType, "outputGene", "uima.cas.String", featOkTst);
    casFeatCode_outputGene  = (null == casFeat_outputGene) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_outputGene).getCode();

  }
}



    