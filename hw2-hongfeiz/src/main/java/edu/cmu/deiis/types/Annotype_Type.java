
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
public class Annotype_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Annotype_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Annotype_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Annotype(addr, Annotype_Type.this);
  			   Annotype_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Annotype(addr, Annotype_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Annotype.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Annotype");
 
  /** @generated */
  final Feature casFeat_casProcessorId;
  /** @generated */
  final int     casFeatCode_casProcessorId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCasProcessorId(int addr) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.Annotype");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessorId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCasProcessorId(int addr, String v) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.Annotype");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidence;
  /** @generated */
  final int     casFeatCode_confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.Annotype");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_confidence == null)
      jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.Annotype");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Annotype_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_casProcessorId = jcas.getRequiredFeatureDE(casType, "casProcessorId", "uima.cas.String", featOkTst);
    casFeatCode_casProcessorId  = (null == casFeat_casProcessorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_casProcessorId).getCode();

 
    casFeat_confidence = jcas.getRequiredFeatureDE(casType, "confidence", "uima.cas.Double", featOkTst);
    casFeatCode_confidence  = (null == casFeat_confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidence).getCode();

  }
}



    