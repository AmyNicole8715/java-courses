/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgrade;

/**
 *
 * @author melissa
 */
public class TestGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grade Tom = new Grade();
        Grade Sue = new Grade();
        
        System.out.println("Tom object: " + Tom.toString());
        System.out.println("Sue object: " + Sue.toString());
        
        Tom.setMidtermTest(75);
        Tom.setFinalTest(82);
        
        Sue.setMidtermTest(79);
        Sue.setFinalTest(97);
        
        System.out.println("Tom object: " + Tom.toString());
        System.out.println("Sue object: " + Sue.toString());
        
        
        // TODO code application logic here
    }
    
}