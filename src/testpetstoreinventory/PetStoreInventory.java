/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpetstoreinventory;

/**
 *
 * @author mkenneweg
 */
public class PetStoreInventory {

  /**
   * Best INDUSTRY practice for variable names is the more descriptive the variable name, the easier it is to read. 
   * It is best to refrain from single letter variables, as they are hard to read.
   * Also the compilation indentation is off, so the compiled code is hardly readable.
   */
    
  //Declare your instance variables here (there are no class variables for this project)
  private String description;
  private String department;
  private int unitsOnHand;
  private double price;


    // constructor
  public PetStoreInventory(String desc, String dept, int units, double unitPrice) {
    description = desc;
    department = dept;
    unitsOnHand = units;
    price = unitPrice;
  }
    
  public void setDescription( String desc){
    description = desc;
  }
    
  public void setDepartment( String dept){
    department = dept;
  }
  
  public void setUnitsOnHand ( int units){
    unitsOnHand = units;
  }
  
  public void setPrice ( double unitPrice ){
    unitPrice = price;
  }
  
  public String getDescription(){
    return description;	//so it compiles, you must change this
  }
  
  public String getDepartment(){
    return department;  //so it compiles, you must change this
  }
  
  public int getUnitsOnHand(){
    return unitsOnHand;	//so it compiles, you must change this
  }
  
  public double getPrice(){
    return price;	//so it compiles, you must change this
  }
  
  
  public double calcTotalValue(){
    double totalValue = unitsOnHand * price;
    return totalValue;
  }

}
