import java.util.Scanner;

public class ValidationLoop {
    public static void main(String[] args) {
        // Open Scanner here so it can be used in the entire program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 3 and 9: ");
        int num = input.nextInt();
        while (num < 3 || num > 9) {
            System.out.println("Invalid input! Enter a number between 3 and 9: ");
            num = input.nextInt();
        }
        System.out.println("Thank you for using this program!");
        input.close();
    }
}
