public class CandyBar {

    public static void main(String[] args) {
        // total amount of calories per candy bar
        double calories = 75;
        
        // servings of candy bars
        double quantity1 = 0.5;
        double quantity2 = 3;
        double quantity3 = 11;
        
        // calories per serving
        double calories1 = calories * quantity1;
        double calories2 = calories * quantity2;
        double calories3 = calories * quantity3;

        // print out the calories per serving
        System.out.println("If I eat 0.5 candy bars, I will have eaten " + calories1 + " calories.");
        System.out.println("If I eat 3 candy bars, I will have eaten " + calories2 + " calories.");
        System.out.println("If I eat 11 candy bars, I will have eaten " + calories3 + " calories.");
    }
}
