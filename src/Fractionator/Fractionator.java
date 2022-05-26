package Fractionator;

import java.util.Scanner;

/**
 * @(#)Fractionator.java
 *
 * This app will take a user input and convert it to a fraction. 
 * After the user input is converted to a fraction, the app will
 * compare the following user input to the previous user input.
 *
 * @author Amy Check
 * @version 0.1 2022-05-24
 *
 */

public class Fractionator {
    // private static integer variables for the numerator and denominator
    private int num;
    private int den;

    public Fractionator( int num, int den) 
    // Build new fraction n/d from the user input
    {
        setFractionator(num, den);
    }

    // Build new fraction n/d from the user input
    public Fractionator()
    {
        setFractionator(0, 1);
    }

    public void setFractionator(int num, int den) {
        this.num = num;
        this.den = den;
    }

    // set the numerator
    public void setNum(int num) {
        this.num = num;
    }

    // set the denominator
    public void setDen(int den) {
        this.den = den;
    }

    // Return the fractions numerator
    public int getNum() {
        return num;
    }

    // Return the fractions denominator
    public int getDen() {
        return den;
    }

    // method to print the fraction toString and also check for a whole number and if present, print that to string
    public String toString() {
        if (num % den == 0) {
            return num / den + "";
        } else {
            // check if den is negative if so, move negative sign to numerator
            if (den < 0) {
                num = num * -1;
                den = den * -1;
                return num + "/" + den;
            } else {
                return num + "/" + den;
            }
        }
    }

    // equals method to compare two different fractions and return true or false by multiplying the numerator of the first by the denominator of the second and comparing it to the second numerator multiplied by the first denominator
    public boolean equals(Fractionator f) {
        return getNum()*f.getDen() == f.getNum()*getDen();
    }
    
    // reduce the fraction to its lowest terms
    public Fractionator reduce() {
        int gcd = gcd(getNum(), getDen());
        return new Fractionator(getNum() / gcd, getDen() / gcd);
    }

    // inverting a fraction
    public Fractionator invert() {
        return new Fractionator(getDen(), getNum());
    }

    // find GCD with Euclid's algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // find least common multiple of the denominators of two fractions using the GCD method
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // multiply 2 fractions together
    public Fractionator multiply(Fractionator f) {
        return new Fractionator(getNum() * f.getNum(), getDen() * f.getDen());
    }

    // divide 2 fractions using the multiply method and inverting the second fraction
    public Fractionator divide(Fractionator f) {
        return multiply(f.invert());
    }

    // add 2 fractions together
    public Fractionator add(Fractionator f) {
        if (getDen() == f.getDen()) {
            return new Fractionator(getNum() + f.getNum(), getDen());
        } else {
            int lcm = lcm(getDen(), f.getDen());
            return new Fractionator(getNum() * (lcm / getDen()) + f.getNum() * (lcm / f.getDen()), lcm);
        }
    }

    // subtract 2 fractions
    public Fractionator subtract(Fractionator f) {
        // if the denominators are the same, subtract the numerators
        if (getDen() == f.getDen()) {
            return new Fractionator(getNum() - f.getNum(), getDen());
        } else {
            // if the denominators are not the same, find the least common multiple of the denominators and multiply the numerators by the least common multiple
            int lcm = lcm(getDen(), f.getDen());
            return new Fractionator(getNum() * (lcm / getDen()) - f.getNum() * (lcm / f.getDen()), lcm);
        }
    }
}
