
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
 * Updated by JCasGen Fri Oct 10 18:26:52 EDT 2014
 * @generated */
public class Input_Type extends Annotype_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Input_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Input_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Input(addr, Input_Type.this);
  			   Input_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Input(addr, Input_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Input.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Input");
 
  /** @generated */
  final Feature casFeat_inputId;
  /** @generated */
  final int     casFeatCode_inputId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInputId(int addr) {
        if (featOkTst && casFeat_inputId == null)
      jcas.throwFeatMissing("inputId", "edu.cmu.deiis.types.Input");
    return ll_cas.ll_getStringValue(addr, casFeatCode_inputId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInputId(int addr, String v) {
        if (featOkTst && casFeat_inputId == null)
      jcas.throwFeatMissing("inputId", "edu.cmu.deiis.types.Input");
    ll_cas.ll_setStringValue(addr, casFeatCode_inputId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_inputText;
  /** @generated */
  final int     casFeatCode_inputText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getInputText(int addr) {
        if (featOkTst && casFeat_inputText == null)
      jcas.throwFeatMissing("inputText", "edu.cmu.deiis.types.Input");
    return ll_cas.ll_getStringValue(addr, casFeatCode_inputText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setInputText(int addr, String v) {
        if (featOkTst && casFeat_inputText == null)
      jcas.throwFeatMissing("inputText", "edu.cmu.deiis.types.Input");
    ll_cas.ll_setStringValue(addr, casFeatCode_inputText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Input_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_inputId = jcas.getRequiredFeatureDE(casType, "inputId", "uima.cas.String", featOkTst);
    casFeatCode_inputId  = (null == casFeat_inputId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inputId).getCode();

 
    casFeat_inputText = jcas.getRequiredFeatureDE(casType, "inputText", "uima.cas.String", featOkTst);
    casFeatCode_inputText  = (null == casFeat_inputText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_inputText).getCode();

  }
}



    