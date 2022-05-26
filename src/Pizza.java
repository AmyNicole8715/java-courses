import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {
    // private instance variables
    private int diameter;
    private int typeNumber;
    private double price;

    // constructor
    public Pizza(int d, int t, double p) {
        diameter = d;
        typeNumber = t;
        price = p;
    }

    // Accessor methods
    public int getDiameter() {
        return diameter;
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public double getPrice() {
        return price;
    }

    // Mutator methods
    public void setDiameter(int d) {
        diameter = d;
    }

    public void setTypeNumber(int t) {
        typeNumber = t;
    }

    public void setPrice(double p) {
        price = p;
    }

    // Main method
    public static void main(String[] args) {

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for diameter
        System.out.println("Would you like a 10-inch pizza or a 14-inch pizza? (1 or 2)");
        int diameter = input.nextInt();

        // Prompt user for type number for toppings
        System.out.println("Enter 1 for Cheese, 2 for Pepperoni, 3 for Sausage & Mushroom: ");
        int typeNumber = input.nextInt();

        // Calculate price
        double price = 0;
        if (diameter == 1) {
            if (typeNumber == 1) {
                price = 10.00;
            } else if (typeNumber == 2) {
                price = 10.50;
            } else if (typeNumber == 3) {
                price = 11.00;
            }
        } else if (diameter == 2) {
            if (typeNumber == 1) {
                price = 14.00;
            } else if (typeNumber == 2) {
                price = 14.50;
            } else if (typeNumber == 3) {
                price = 15.00;
            }
        }

        // Create new Pizza object
        Pizza pizza = new Pizza(diameter, typeNumber, price);
        DecimalFormat df = new DecimalFormat("00.00");
        System.out.println("You chose pizza size: " + pizza.getDiameter());
        System.out.println("With toppings choice: " + pizza.getTypeNumber());
        System.out.println("The price of your pizza is: " + df.format(pizza.getPrice()));
        System.out.println("Press 1 to confirm or 2 to cancel: ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Thank you for ordering! Would you like to order again? (y/n)");
            String answer = input.next();
            if (answer.equals("y")) {
                Pizza.main(args);
            } else {
                System.out.println("Thank you for using this program!");
                input.close();
            }
        } else if (choice == 2) {
            System.out.println("Cancelling order... Would you like to try again? (y/n)");
            String answer = input.next();
            if (answer.equals("y")) {
                Pizza.main(args);
            } else {
                System.out.println("Thank you for using this program!");
                input.close();
            }
        } else {
            System.out.println("Invalid input!");
        }
        input.close();
    }
}
