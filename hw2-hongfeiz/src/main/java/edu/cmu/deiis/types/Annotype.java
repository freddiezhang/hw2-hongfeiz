

/* First created by JCasGen Wed Oct 08 02:34:21 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Oct 10 18:26:52 EDT 2014
 * XML source: /home/freddie/git/hw2-hongfeiz/hw2-hongfeiz/src/main/resources/descriptors/casConsumerDescriptor.xml
 * @generated */
public class Annotype extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Annotype.class);
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
  protected Annotype() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Annotype(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Annotype(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Annotype(JCas jcas, int begin, int end) {
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
  //* Feature: casProcessorId

  /** getter for casProcessorId - gets The unique identifier of the CAS processor that added this annotation to the CAS
   * @generated
   * @return value of the feature 
   */
  public String getCasProcessorId() {
    if (Annotype_Type.featOkTst && ((Annotype_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.Annotype");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Annotype_Type)jcasType).casFeatCode_casProcessorId);}
    
  /** setter for casProcessorId - sets The unique identifier of the CAS processor that added this annotation to the CAS 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCasProcessorId(String v) {
    if (Annotype_Type.featOkTst && ((Annotype_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.Annotype");
    jcasType.ll_cas.ll_setStringValue(addr, ((Annotype_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets The confidence level assigned to the Annotation by the CAS processor that created it.
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (Annotype_Type.featOkTst && ((Annotype_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.Annotype");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Annotype_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets The confidence level assigned to the Annotation by the CAS processor that created it. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (Annotype_Type.featOkTst && ((Annotype_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.Annotype");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Annotype_Type)jcasType).casFeatCode_confidence, v);}    
  }

    