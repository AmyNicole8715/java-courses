import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tipper 
{
    public static void main(String args[])
    {
        double amount;
        //double tip;   //tip is not needed
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of the bill: ");
        amount = input.nextDouble();
        input.close();
        df.setRoundingMode(RoundingMode.UP);
        double tip = amount * 0.2;
        System.out.println("The tip is $" + df.format(tip));
        double total = amount + tip;
        System.out.println("The total is $" + df.format(total));
        
    }   
}
