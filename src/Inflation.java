import java.util.Scanner;
import java.text.DecimalFormat;

public class Inflation {

    /**
     * Inflation Calculator
     * Input to include: amount, rate of inflation, and years
     * Output to include: future value of amount
     * @param args the command line arguments
     * 
     * @author Amy Check
     *
     */
    public static void main(String[] args) {
        // Open scanner and ask for current cost of item
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current cost of the item: ");
        double currentCost = input.nextDouble();
        // Ask for inflation rate
        System.out.println("Enter the rate of inflation without percentage sign: ");
        double inflationRate = input.nextDouble();
        // Ask for number of years
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate future value
        calcFutureValue(currentCost, inflationRate, years);

        // Ask user if they want to run the program again
        System.out.println("Would you like to try again? (y/n)");
        String answer = input.next();
        if (answer.equals("y") || answer.equals("Y")) {
            Inflation.main(args);
        } else {

            // If user does not want to run the program again, close the scanner and thank the user for using the program.
            System.out.println("Thank you for using this program!");
            input.close();
        }

    }
    public static double calcFutureValue(double currentCost, double inflationRatePercent, int years) {
        // Calculate cost adjusted for inflation using a loop
        double futureValue = currentCost;
        double inflationRate = inflationRatePercent / 100;
        for (int i = 0; i < years; i++) {
            futureValue = futureValue * (1 + inflationRate);
        }
        // Format the result to two decimal places and print
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("At " + inflationRatePercent + "% inflation per year, the cost in " + years + " year(s) will be $" + df.format(futureValue));
        return futureValue;
        
    }
}
