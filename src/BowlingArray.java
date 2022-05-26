public class BowlingArray {
    // Report every member of the bowling team with a score greater than or equal to 150 points.
    public static void main(String[] args) {
        String[] teammate = { "Alice", "Bruce", "Cheryl", "Don", "Frank" };
        int[] scores = { 160, 130, 190, 200, 145 };

        // List the bowlers that had the score higher than or equal to 150 points.
        System.out.println("The following bowlers had scores higher than or equal to 150 points:");
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 150) {
                System.out.println(teammate[i]);
            }
        }
    }
    
}
