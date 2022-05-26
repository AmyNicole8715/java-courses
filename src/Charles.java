import java.util.Scanner;
import java.text.DecimalFormat;

public class Charles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original volume of your container in liters: ");
        double volume = input.nextDouble();
        System.out.print("Enter the original temperature in degrees Kelvin: ");
        double temperature = input.nextDouble();
        System.out.print("Enter 1 to enter desired destination temperature in degrees Kelvin or 2 to enter desired destination volume in liters: ");
        int choice = input.nextInt();

        // Ask for final variables and calculate
        if (choice == 1) {
            System.out.print("Enter the destination temperature in degrees Kelvin: ");
            double destinationTemp = input.nextDouble();
            double result = (volume / temperature) * destinationTemp;
            DecimalFormat df = new DecimalFormat("0.0000");
            System.out.println("According to Charles' Law the new volume is " + df.format(result));
        } else if (choice == 2) {
            System.out.print("Enter the destination volume in liters: ");
            double destinationVol = input.nextDouble();
            double result = (temperature / volume) * destinationVol;
            DecimalFormat df = new DecimalFormat("0.0000");
            System.out.println("According to Charles' Law the new temperature is " + df.format(result) + " degrees Kelvin");
        } else {
            System.out.println("Invalid input!");
        }
        input.close();
    }
}
