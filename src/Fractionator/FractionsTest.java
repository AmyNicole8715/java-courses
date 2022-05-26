package Fractionator;

/**
 * @(#)FractionsTest.java
 * 
 * This will test the fractionator app 
 * 
 * @author Amy Check
 * @version 0.1 2022-05-24
 */

public class FractionsTest {

    // testing the Fractionator class with set input
    public static void main(String[] args) {

        // create a new Fractionator object
        Fractionator f1 = new Fractionator();
        Fractionator f2 = new Fractionator();
        Fractionator f3 = new Fractionator(5, 8);
        Fractionator f4 = new Fractionator(30, 48);

        // Build the first fraction
        System.out.println("Enter the numerator of the first fraction: ");
        f1.setNum(2);
        System.out.println("Enter the denominator of the first fraction: ");
        f1.setDen(4);

        // Build the second fraction
        System.out.println("Enter the numerator of the second fraction: ");
        f2.setNum(6);
        System.out.println("Enter the denominator of the second fraction: ");
        f2.setDen(3);

        // print the first fraction
        System.out.println("The first fraction is: " + f1.toString());

        // print the second fraction
        System.out.println("The second fraction is: " + f2.toString());

        // test the equals method between the two fractions
        if (f1.equals(f2)) {
            System.out.println("The first two fractions are equal.");
        } else {
            System.out.println("The first two fractions are not equal.");
        }

        // test the multiply method between the two fractions
        Fractionator f5 = f1.multiply(f2);
        System.out.println("The product of the first two fractions is: " + f5.reduce().toString());

        // test the divide method between the two fractions
        Fractionator f6 = f1.divide(f2);
        System.out.println("The quotient of the first two fractions is: " + f6.reduce().toString());

        // test the add method between the two fractions
        Fractionator f7 = f1.add(f2);
        System.out.println("The sum of the first two fractions is: " + f7.reduce().toString());

        // test the subtract method between the two fractions
        Fractionator f8 = f1.subtract(f2);
        System.out.println("The difference of the first two fractions is: " + f8.reduce().toString());

        

        // Print the third fraction
        System.out.println("The third fraction is: " + f3.toString());

        // Print the fourth fraction
        System.out.println("The fourth fraction is: " + f4.toString());

        // test the equals method between the two fractions
        if (f3.equals(f4)) {
            System.out.println("The last two fractions are equal.");
        } else {
            System.out.println("The last two fractions are not equal.");
        }

        // test the multiply method between the two fractions
        Fractionator f9 = f3.multiply(f4);
        System.out.println("The product of the last two fractions is: " + f9.reduce().toString());

        // test the divide method between the two fractions
        Fractionator f10 = f3.divide(f4);
        System.out.println("The quotient of the last two fractions is: " + f10.reduce().toString());

        // test the add method between the two fractions
        Fractionator f11 = f3.add(f4);
        System.out.println("The sum of the last two fractions is: " + f11.reduce().toString());

        // test the subtract method between the two fractions
        Fractionator f12 = f3.subtract(f4);
        System.out.println("The difference of the last two fractions is: " + f12.reduce().toString());
    }
}
