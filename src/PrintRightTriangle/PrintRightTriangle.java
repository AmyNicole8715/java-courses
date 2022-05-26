/*
 * This program prints a right triangle comprised of *s.
 *
 *  Input
 *      nbrOfStars -int - between 3 and 15 inclusive
 *
 *  Procedure/Algorithm:
 *      outer loop that prints a row of stars
 *          inner loop that just prints one star on the current line
 *          hop down to the next line System.out.println()
 */
package PrintRightTriangle;

import java.util.Scanner;

/**
 *
 * @author mkenneweg
 */
public class PrintRightTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Scanner kb = new Scanner(System.in);
        int nbrOfStars;         //this value needs to be between 3 and 15
        
        //get a valid value for the number of stars
        do {
            System.out.print("Enter the number of stars (3-15): ");
            nbrOfStars = kb.nextInt();
        } while ( nbrOfStars < 3 || nbrOfStars > 15 );
        System.out.println(nbrOfStars + " stars");
        
        //let's try printing a rectangle of stars first
        for ( int j = 1; j <= nbrOfStars; j++ ){    //print a line of stars per iteration
            for ( int k = 1; k <= nbrOfStars; k++){ //prints a star per iteration
                System.out.print("*");
            }
            System.out.println();
        }
        
        //now let's print a triangle of stars
        for ( int j = 1; j <= nbrOfStars; j++ ){    //print a line of stars per iteration
            for ( int k = 1; k <= j; k++){          //prints a star per iteration
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lets invert the triangle and print it
        for ( int j = nbrOfStars; j > 0; j-- ){    //print a line of stars per iteration
            for ( int k = 1; k <= j; k++){          //prints a star per iteration
                System.out.print("*");
            }
            System.out.println();
        }

        // Let's put the hypotenuse on the left side
        for (int j = 0; j < nbrOfStars; j++) { //print a line of stars per iteration
            for (int k = 0; k < nbrOfStars; k++) { //prints a star per iteration
                System.out.print((k >= j) ? "*" : " "); //prints a star or space depending on the value of k
            }
            System.out.println();
        }

        // Not quite Equilateral triangle but close
        for (int j = 0; j < nbrOfStars; j++) { //print a line of stars per iteration
            for (int k = 0; k < nbrOfStars; k++) { //prints a star per iteration
                System.out.print((k >= j) ? " *" : " "); //prints a space with star or space without star depending on the value of k
            }
            System.out.println();
        }

    }
    
}
