import java.util.Scanner;
import java.text.DecimalFormat;

public class SavvyShopper {
    public static void main(String[] args) {
        // Input from shopper
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of objects purchased: ");
        int amount = input.nextInt();
        System.out.print("Enter the total amount paid: ");
        double total = input.nextDouble();
        input.close();

        // Store the final to be averaged against
        double finalAverage = 5.00;
        // Calculate the average
        double average = total / amount;
        
        boolean savvy = average < finalAverage;
        boolean okay = average >= finalAverage && average < 10;
        boolean poor = average >= 10;
        
        // Formatting the output
        DecimalFormat df = new DecimalFormat("0.00");

        // Display the results
        if (savvy) {
            System.out.println("You are a savvy shopper! You spent on average $" + df.format(average) + " per item. Thank you for shopping with us!");
        } else if (okay) {
            System.out.println("You are an okay shopper! You spent on average $" + df.format(average) + " per item. Thank you for shopping with us!");
        } else if (poor) {
            System.out.println("You spent on average $" + df.format(average) + " per item. Thank you for shopping with us!");
        }


    }

}
