

/* First created by JCasGen Thu Oct 09 18:07:47 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Oct 09 22:22:08 EDT 2014
 * XML source: /home/freddie/git/hw2-hongfeiz/hw2-hongfeiz/src/main/resources/descriptors/casConsumerDescriptor.xml
 * @generated */
public class RecogGene extends Annotype {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RecogGene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected RecogGene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RecogGene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RecogGene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RecogGene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: geneId

  /** getter for geneId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneId() {
    if (RecogGene_Type.featOkTst && ((RecogGene_Type)jcasType).casFeat_geneId == null)
      jcasType.jcas.throwFeatMissing("geneId", "edu.cmu.deiis.types.RecogGene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RecogGene_Type)jcasType).casFeatCode_geneId);}
    
  /** setter for geneId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneId(String v) {
    if (RecogGene_Type.featOkTst && ((RecogGene_Type)jcasType).casFeat_geneId == null)
      jcasType.jcas.throwFeatMissing("geneId", "edu.cmu.deiis.types.RecogGene");
    jcasType.ll_cas.ll_setStringValue(addr, ((RecogGene_Type)jcasType).casFeatCode_geneId, v);}    
   
    
  //*--------------*
  //* Feature: geneText

  /** getter for geneText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeneText() {
    if (RecogGene_Type.featOkTst && ((RecogGene_Type)jcasType).casFeat_geneText == null)
      jcasType.jcas.throwFeatMissing("geneText", "edu.cmu.deiis.types.RecogGene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RecogGene_Type)jcasType).casFeatCode_geneText);}
    
  /** setter for geneText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeneText(String v) {
    if (RecogGene_Type.featOkTst && ((RecogGene_Type)jcasType).casFeat_geneText == null)
      jcasType.jcas.throwFeatMissing("geneText", "edu.cmu.deiis.types.RecogGene");
    jcasType.ll_cas.ll_setStringValue(addr, ((RecogGene_Type)jcasType).casFeatCode_geneText, v);}    
  }

    