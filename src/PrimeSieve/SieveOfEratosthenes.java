package PrimeSieve;

/**
 * @(#)SieveOfEratosthenes.java
 *
 * This app will print all the prime numbers between 1 and the user input.
 *
 * @author Amy Check
 * @version 0.1 2020-05-25
 *
 */

public class SieveOfEratosthenes {

    // initiate state variables
    private int num;
    private int[] sieve;
    private int[] primes;

    /**
     * Constructor for objects of class SieveOfEratosthenes
     */
    public SieveOfEratosthenes() {
        // initialise instance variables
        num = 0;
        sieve = new int[num];
    }

    // create array of size num + 1
    public void setSieve(int num) {
        this.num = num;
        sieve = new int[num + 1];
    }

    // return the size of the array
    public int getNum() {
        return num;
    }

    // return the array
    public int[] getSieve() {
        return sieve;
    }

    // method to mark all multiples of a number as non-prime
    public void markNonPrimes() {
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i] == 1) {
                for (int j = i * 2; j < sieve.length; j += i) {
                    sieve[j] = 0;
                }
            }
        }
    }

    // method to count number of primes and return a new array of the primes without the 0s
    public int[] countPrimes() {
        int count = 0;
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] == 1) {
                count++;
            }
        }
        primes = new int[count];
        int j = 0;
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i] == 1) {
                primes[j] = i;
                j++;
            }
        }
        return primes;
    }

    // set the array of prime numbers from the sieve
    public void setPrimes(int[] primes) {
        this.primes = primes;
    }

    // return the array of prime numbers
    public int[] getPrimes() {
        return primes;
    }

    // method toString to print the array of prime numbers starting with 2 and ending with the last prime number
    public String toString() {
        String result = "";
        for (int i = 2; i < primes.length; i++) {
            result += primes[i] + " ";
        }
        return result;
    }
}
