public class Circle {
    public static void main(String[] args) {
        // call calcArea method with the radius of a circle as the argument
        System.out.println("The area of a circle with a radius of 5 is " + calcArea((double) 5));
    }

    
    public static Double calcArea( Double radius ) {

        Double area = Math.PI * radius * radius;
        return area;
    }
    
}
