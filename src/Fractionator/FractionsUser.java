package Fractionator;

import java.util.Scanner;

/**
 * @(#)FractionsUser.java
 * 
 * This will enable the user to use the fractionator app and recive related math.
 * 
 * @author Amy Check
 * @version 0.1 2022-05-24
 */

public class FractionsUser {

    // testing the Fractionator class with user input
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // create a new Fractionator object
        Fractionator f1 = new Fractionator();
        Fractionator f2 = new Fractionator();

        // Build the first fraction
        System.out.println("Enter the numerator of the first fraction: ");
        f1.setNum(input.nextInt());
        System.out.println("Enter the denominator of the first fraction: ");
        f1.setDen(input.nextInt());

        // Build the second fraction
        System.out.println("Enter the numerator of the second fraction: ");
        f2.setNum(input.nextInt());
        System.out.println("Enter the denominator of the second fraction: ");
        f2.setDen(input.nextInt());

        // print the first fraction
        System.out.println("The first fraction is: " + f1.toString());

        // print the second fraction
        System.out.println("The second fraction is: " + f2.toString());

        // test the equals method between the two fractions
        if (f1.equals(f2)) {
            System.out.println("The two fractions are equal.");
        } else {
            System.out.println("The two fractions are not equal.");
        }

        // test the multiply method between the two fractions
        Fractionator f3 = f1.multiply(f2);
        System.out.println("The product of the two fractions is: " + f3.reduce().toString());

        // test the divide method between the two fractions
        Fractionator f4 = f1.divide(f2);
        System.out.println("The quotient of the two fractions is: " + f4.reduce().toString());

        // test the add method between the two fractions
        Fractionator f5 = f1.add(f2);
        System.out.println("The sum of the two fractions is: " + f5.reduce().toString());

        // test the subtract method between the two fractions
        Fractionator f6 = f1.subtract(f2);
        System.out.println("The difference of the two fractions is: " + f6.reduce().toString());

        // would user like to start over?
        System.out.println("Would you like start over? (y/n)");
        String startOver = input.next();
        if (startOver.equals("y")) {
            main(args);
        } else {
            input.close();
            System.out.println("Goodbye!");
        }
    
    }
}
