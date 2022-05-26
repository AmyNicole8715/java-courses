import java.util.Scanner;
public class Trick {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last years sales: ");
        double lastYearsSales = input.nextDouble();
        if (lastYearsSales > 1000000) {
            double bonus = 20000;
            System.out.println("here is your bonus: " + bonus);
        } else if (lastYearsSales > 500000) {
            System.out.println("You are a decent sales person!");
        } else if (lastYearsSales > 100000) {
            System.out.println("You are a poor sales person!");
        } else {
            System.out.println("You are a terrible sales person!");
        }
        input.close();
    }
    
}
