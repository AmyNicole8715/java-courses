/*
 * This program can be used to store and calculate grades for a class. In this
 * class there are two tests only. Each are worth half of the final grade in
 * the class. Complete the code below. The grades are whole numbers between 0
 * and 100.
 */
package testgrade;

/**
 *
 * @author melissa
 */
public class Grade {
    
    // Declare instance variables
    private int midtermTest;
    private int finalTest;
    
    //no argument constructor
    public Grade(){
        midtermTest = 0;
        finalTest = 0;
    }
    
    //accessor methods
    public int getMidtermTest(){
        return midtermTest;
    }
    
    public int getFinalTest(){
        return finalTest;
    }
    
    //mutator methods
    public void setMidtermTest( int newGrade ){
        midtermTest = newGrade;
    }
    
    public void setFinalTest( int newGrade ){
        finalTest = newGrade;
    }
    
    //finish this method that returns the grade which is the average
    //of the two test grades. Hint: Don't forget about integer division!
    public Double calcGrade(){
        //convert the midterm and final test grades to a double value so that they can be divided by 2 with decimal places 
        double mid = (double) midtermTest;
        double fin = (double) finalTest;
        double grade = (mid + fin) / 2;
        return grade;
    }
    
    @Override
    public String toString(){
        return "Midterm Test Grade: " + midtermTest + " Final Test Grade: " +
                finalTest + " Grade: " + calcGrade();
    }
}