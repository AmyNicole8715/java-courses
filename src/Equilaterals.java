import java.text.DecimalFormat;
import java.util.Scanner;
public class Equilaterals {
    
    public static void main(String[] args) {
        
        // Area of an equilateral triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of a side from your equilateral triangle: ");
        double side = input.nextDouble();
        input.close();
        double length = side;

        // Calculate the area
        double area = (Math.sqrt(3) / 4) * Math.pow(side, 2);
        double perimeter = 3 * side;
        
        // Formatting the output
        DecimalFormat df = new DecimalFormat("0.0000");

        // Display the results
        System.out.println("The length of your side is " + df.format(length) + ", area of your triangle is " + df.format(area) + ", and the perimeter is " + df.format(perimeter));
    }
}
