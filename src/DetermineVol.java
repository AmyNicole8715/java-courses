import java.util.Scanner;
public class DetermineVol {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        sphericalVol(radius);
        System.out.println("Would you like to try again? (y/n)");
        String answer = input.next();
        if (answer.equals("y")) {
            DetermineVol.main(args);
        } else {
            System.out.println("Thank you for using this program!");
            input.close();
        }
    }

    public static Double sphericalVol(double r) {
        r = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("The volume of the sphere is: " + r);
        return r;
    }
}
