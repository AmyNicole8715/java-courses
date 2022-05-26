package PrimeSieve;

import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @(#)SieveOfEratosthenesTest.java
 * 
 * This app contains the main method to test the SieveOfEratosthenes class.
 * This test will require user input to determine the size of the array.
 * 
 * @author Amy Check
 * @version 0.1 2020-05-25
 *
 */

 public class SieveOfEratosthenesTest {
     
    // main method to test the SieveOfEratosthenes class
    public static void main(String[] args) {
        // create a new SieveOfEratosthenes object
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();

        // create a new Scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // get the user input
        int num = input.nextInt();
        
        // set the size of the array
        sieve.setSieve(num);
        
        // set the array to all 1s
        for (int i = 0; i < sieve.getSieve().length; i++) {
            sieve.getSieve()[i] = 1;
        }
        
        // mark all multiples of a number as non-prime
        sieve.markNonPrimes();
        
        // count the number of primes and return a new array of the primes without the 0s
        sieve.countPrimes();
        
        // print the array of prime numbers
        System.out.println("The prime numbers leading up to " + num + " are: ");
        System.out.println(sieve.toString());
        
        // ask user if they want to run the program again and if so, run it again if not, exit
        System.out.print("Do you want to run the program again? (y/n): ");
        String answer = input.next();
        if (answer.equals("y")) {
            main(args);
        } else {
            // close the input scanner
            input.close();
            System.exit(0);
        }
    }
 }


