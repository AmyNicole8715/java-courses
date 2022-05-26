import java.util.Scanner;

public class CollatzSeq {
    public static void main(String[] args)
    {
        // Open Scanner here so it can be used in the entire program
        Scanner input = new Scanner(System.in);

        // I start with a try block and use the not equal to operator to check if the user entered a valid number
        try {
            System.out.print("Enter a number: ");

            // !input.hasNextInt() is used to check if the input is a number, if not it will throw an exception and ask for a number again
            while (!input.hasNextInt()) { 
                System.out.println("Invalid input!" + "\nPlease enter a number: ");
                input.next();
            }
        
            // here we initialize the variables for the Collatz sequence method
            int num = input.nextInt();
            int count = 0;
            
            collatz(num, count);
            
        // Finally statement to thank the user for using the application and close the try block.
        } finally {
            System.out.println("\nThank you for using Collatz Sequence!");
            
            // Here we ask the user if they want to run the program again.
            System.out.println("Would you like to try again? (y/n)");
            String answer = input.next();
    
            if (answer.equals("y")) {
    
                // Recursively call the main method to restart the program
                CollatzSeq.main(args);
            } else {
                System.out.println("Thank you for using this program!");
    
                // We close scanner down here because had we closed the stream sooner the user would not be able to use the program again without restarting it in cmd.
                input.close(); 
            }
        }

    }

    // This is the method that will be called by the main method to perform the collatz sequence math.
    private static void collatz(int num, int count) {

        // Collatz while loop
        while (num != 1 && num > 0) {
            if (num <= 0)
                System.out.println("Invalid input!");
            else if (num % 2 == 0) {
                num = num / 2;
                System.out.print(num + ", ");
            } else {
                // we do not need to modulus by 3 because the previous step already checked if num is even.
                num = (num * 3) + 1; 
                System.out.print(num + ", ");
            }
            count++;
            
            
            // After 7 sequence numbers we print a new line to make the output easier to read.
            if (count % 7 == 0) {
                System.out.print("\n");
            }
        }

        // Print how many steps it took to reach 1.
        System.out.println("\nThe number of steps is " + count);     
    }   
}


