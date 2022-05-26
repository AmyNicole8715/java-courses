import java.util.Scanner;

/**
 *
 * @author AmyNicole8715
 *
 * The following program will find the factorial of a user input number of objects and user input number of things along with the 
 * permutations and combinations of things taken from objects.
 */

public class FindFactPermComb {

    /**
     * In the main method, the user will be prompted to enter the number of objects and the number of things. It will call methods to 
     * find the factorial, permutations, and combinations of the objects and things. If the number is incorrect it will prompt the 
     * user to re-enter the number after the error message has been displayed and the 2 initial user prompts have ended. Would like 
     * to find way to check validation of input and re-prompt if it is incorrect immediately instead of waiting for the second prompt  
     * to receive input without it looking sloppy.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of objects between 0 and 12: ");
        int objects = input.nextInt();

        // Validate input
        int valObjects = getValidInput(objects);

        System.out.println("Enter a number of things between 0 and 12: ");
        int things = input.nextInt();
        
        // Validate input
        int valThings = getValidInput(things);

        // If receipt of validated input matches initial input, call methods to find factorial, permutations, and combinations
        if (valObjects == objects && valThings == things) {
            System.out.println("The factorial of " + objects + " objects is " + calcFactorial(objects));
            System.out.println("The factorial of " + things + " things is " + calcFactorial(things));
            System.out.println("The permutation of " + things + " things taken from " + objects + " objects is: " + calcPermutation(objects, things));
            System.out.println("The combination of " + things + " things taken from " + objects + " objects is: " + calcCombination(objects, things));         
        } else {
            System.out.println("You entered an invalid number of objects or things.");
            
            // Restart the program because of invalid input
            FindFactPermComb.main(args);
        }
        
        // Ask user if they want to run the program again
        System.out.println("Would you like to try again? (y/n)");
        String answer = input.next();
        if (answer.equals("y") || answer.equals("Y")) {
            FindFactPermComb.main(args);
        } else {

            // If user does not want to run the program again, close the scanner and thank the user for using the program.
            System.out.println("Thank you for using this program!");
            input.close();
        }
    }

    /**
     * The getValidInput method will check to see if the number of objects or things is between 0 and 12. If it is not, it will 
     * prompt the user to re-enter the number after the error message has been displayed and the initial prompt has ended.
     * @param highVal
     * @return value of the number of objects or things, if incorrect it will return that number plus 100 along with an error message.
     *
     */
    public static int getValidInput( int highVal ){
        if (highVal < 12 && highVal > 0){
            return highVal;
        } else {

            // Input does not match the range of 0 to 12 so return the number plus 100 to indicate an error to the system.
            System.out.println("Error #" + (highVal + 100));
            return highVal + 100;
        }

    }

    /**
     * The calcFactorial method will find the factorial of the number of objects or things. A factorial is the product of all
     * numbers from 1 to the number of objects or things.
     * @param n
     * @return factorial of the number of objects or things
     */
    public static int calcFactorial( int n ){
        if (n == 0){
            return 1;
        } else {
            return n * calcFactorial(n-1);
        }
    }

    /**
     * The calcPermutation method will find the permutation of the number of things taken from the number of objects. A permutation
     * is the number of ways to arrange the things taken from the objects where order doesn't matter. It uses the formula: n! / (n-r)!
     * @param n
     * @param r
     * @return permutation of the number of things taken from the number of objects
     */
    public static int calcPermutation( int n, int r ){
        return calcFactorial(n) / calcFactorial(n-r);
    }

    /**
     * The calcCombination method will find the combination of the number of things taken from the number of objects. A combination
     * is the number of ways to arrange the things taken from the objects where order matters. It uses the formula: n! / (r! * (n-r)!)
     * @param n
     * @param r
     * @return combination of the number of things taken from the number of objects
     */
    public static int calcCombination( int n, int r ){
        return calcFactorial(n) / (calcFactorial(r) * calcFactorial(n-r));
    }
}
