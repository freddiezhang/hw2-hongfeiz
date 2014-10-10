

/* First created by JCasGen Wed Oct 08 02:34:21 EDT 2014 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Oct 09 22:22:08 EDT 2014
 * XML source: /home/freddie/git/hw2-hongfeiz/hw2-hongfeiz/src/main/resources/descriptors/casConsumerDescriptor.xml
 * @generated */
public class Output extends Annotype {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Output.class);
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
  protected Output() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Output(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Output(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Output(JCas jcas, int begin, int end) {
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
  //* Feature: outputId

  /** getter for outputId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOutputId() {
    if (Output_Type.featOkTst && ((Output_Type)jcasType).casFeat_outputId == null)
      jcasType.jcas.throwFeatMissing("outputId", "edu.cmu.deiis.types.Output");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Type)jcasType).casFeatCode_outputId);}
    
  /** setter for outputId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutputId(String v) {
    if (Output_Type.featOkTst && ((Output_Type)jcasType).casFeat_outputId == null)
      jcasType.jcas.throwFeatMissing("outputId", "edu.cmu.deiis.types.Output");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Type)jcasType).casFeatCode_outputId, v);}    
   
    
  //*--------------*
  //* Feature: outputGene

  /** getter for outputGene - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOutputGene() {
    if (Output_Type.featOkTst && ((Output_Type)jcasType).casFeat_outputGene == null)
      jcasType.jcas.throwFeatMissing("outputGene", "edu.cmu.deiis.types.Output");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Output_Type)jcasType).casFeatCode_outputGene);}
    
  /** setter for outputGene - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOutputGene(String v) {
    if (Output_Type.featOkTst && ((Output_Type)jcasType).casFeat_outputGene == null)
      jcasType.jcas.throwFeatMissing("outputGene", "edu.cmu.deiis.types.Output");
    jcasType.ll_cas.ll_setStringValue(addr, ((Output_Type)jcasType).casFeatCode_outputGene, v);}    
  }

    