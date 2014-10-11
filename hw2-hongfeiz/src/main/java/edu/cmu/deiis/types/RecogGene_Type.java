
/* First created by JCasGen Thu Oct 09 18:07:47 EDT 2014 */
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

/** 
 * Updated by JCasGen Fri Oct 10 18:26:52 EDT 2014
 * @generated */
public class RecogGene_Type extends Annotype_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (RecogGene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = RecogGene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new RecogGene(addr, RecogGene_Type.this);
  			   RecogGene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new RecogGene(addr, RecogGene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RecogGene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.RecogGene");
 
  /** @generated */
  final Feature casFeat_geneId;
  /** @generated */
  final int     casFeatCode_geneId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneId(int addr) {
        if (featOkTst && casFeat_geneId == null)
      jcas.throwFeatMissing("geneId", "edu.cmu.deiis.types.RecogGene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneId(int addr, String v) {
        if (featOkTst && casFeat_geneId == null)
      jcas.throwFeatMissing("geneId", "edu.cmu.deiis.types.RecogGene");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geneText;
  /** @generated */
  final int     casFeatCode_geneText;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeneText(int addr) {
        if (featOkTst && casFeat_geneText == null)
      jcas.throwFeatMissing("geneText", "edu.cmu.deiis.types.RecogGene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geneText);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeneText(int addr, String v) {
        if (featOkTst && casFeat_geneText == null)
      jcas.throwFeatMissing("geneText", "edu.cmu.deiis.types.RecogGene");
    ll_cas.ll_setStringValue(addr, casFeatCode_geneText, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RecogGene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_geneId = jcas.getRequiredFeatureDE(casType, "geneId", "uima.cas.String", featOkTst);
    casFeatCode_geneId  = (null == casFeat_geneId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneId).getCode();

 
    casFeat_geneText = jcas.getRequiredFeatureDE(casType, "geneText", "uima.cas.String", featOkTst);
    casFeatCode_geneText  = (null == casFeat_geneText) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geneText).getCode();

  }
}



    