import java.util.Scanner;

public class WhatsTheGrade {
    public static void main(String args[]) {
        
        // Input from student and/or teacher
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the test score: ");
        double testScore = userInput.nextDouble();

        // Ask the user what form of school they are in
        System.out.print("Enter 1 for Lower Secondary School, 2 for Upper Secondary School: ");
        int school = userInput.nextInt();
        
        // Calculate the grade and output the letter grade to user
        // Lower Secondary School
        if (school == 1) {
            if (testScore >= 80) {
                System.out.println("You got an A+! Exceptional!");
            } else if (testScore >= 70 && testScore < 80) {
                System.out.println("You got a A! Excellent!");
            } else if (testScore >= 60 && testScore < 70) {
                System.out.println("You got a B! Very Good!");
            } else if (testScore >= 50 && testScore < 60) {
                System.out.println("You got a C! Good!");
            } else if (testScore >= 40 && testScore < 50) {
                System.out.println("You got a D! Fair!");
            } else if (testScore >= 33 && testScore < 40) {
                System.out.println("You got an E! Satisfactory!");
            } else if (testScore >= 0 && testScore < 33) {
                System.out.println("You got an F! You Fail!");
            } else {
                System.out.println("Invalid test score!");
            }
            // Upper Secondary School
        } else if (school == 2) {
            if (testScore >= 60) {
                System.out.println("You got an A!");
            } else if (testScore >= 36 && testScore < 60) {
                System.out.println("You got a B!");
            } else if (testScore >= 33 && testScore < 36) {
                System.out.println("You got a C!");
            } else if (testScore >= 0 && testScore < 33) {
                System.out.println("You got a F!");
            } else {
                System.out.println("Invalid test score!");
            }
        } else {
            System.out.println("Invalid input!");
        }

        // Ask user if they would like to go again
        System.out.print("Would you like to go again? (y/n): ");
        String answer = userInput.next();
        if (answer.equals("y")) {
            WhatsTheGrade.main(args);
        } else {
            System.out.println("Thank you for using this program!");
        }
        userInput.close();
    }
    
}
