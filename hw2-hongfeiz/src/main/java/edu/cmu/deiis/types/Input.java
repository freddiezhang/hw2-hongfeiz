

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
public class Input extends Annotype {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Input.class);
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
  protected Input() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Input(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Input(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Input(JCas jcas, int begin, int end) {
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
  //* Feature: inputId

  /** getter for inputId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getInputId() {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_inputId == null)
      jcasType.jcas.throwFeatMissing("inputId", "edu.cmu.deiis.types.Input");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Input_Type)jcasType).casFeatCode_inputId);}
    
  /** setter for inputId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputId(String v) {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_inputId == null)
      jcasType.jcas.throwFeatMissing("inputId", "edu.cmu.deiis.types.Input");
    jcasType.ll_cas.ll_setStringValue(addr, ((Input_Type)jcasType).casFeatCode_inputId, v);}    
   
    
  //*--------------*
  //* Feature: inputText

  /** getter for inputText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getInputText() {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_inputText == null)
      jcasType.jcas.throwFeatMissing("inputText", "edu.cmu.deiis.types.Input");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Input_Type)jcasType).casFeatCode_inputText);}
    
  /** setter for inputText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputText(String v) {
    if (Input_Type.featOkTst && ((Input_Type)jcasType).casFeat_inputText == null)
      jcasType.jcas.throwFeatMissing("inputText", "edu.cmu.deiis.types.Input");
    jcasType.ll_cas.ll_setStringValue(addr, ((Input_Type)jcasType).casFeatCode_inputText, v);}    
  }

    