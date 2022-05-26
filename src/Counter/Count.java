package Counter;

/**
 * @(#)Count.java
 * 
 * This will test the counter app and check state of the counters.
 * 
 * @author Amy Check
 * @version 0.1 2022-05-23
 *
 */

public class Count {

    // main method
    public static void main(String[] args) {

        // instantiate the counter objects
        Counter counter1 = new Counter(), counter2 = new Counter();

        // print the current state of the counters
        System.out.println("The initial state of the counters:");
        System.out.println("Counter 1 = " + counter1);
        System.out.println("Counter 2 = " + counter2);

        // increase the counters and loop until it hits 10
        for (int i = 0; i < 10; i++) {
            counter1.increaseCounter();
            counter2.increaseCounter();
        }

        // print the current state of the counters
        System.out.println("The current state of the counters:");
        System.out.println("Counter 1 = " + counter1);
        System.out.println("Counter 2 = " + counter2);
        System.out.println("Counter 1 == Counter 2 is " + counter1.equals(counter2));

        // decrease counter 1 in a loop for 5 iterations
        for (int i = 0; i < 5; i++) {
            counter1.decreaseCounter();
        }

        // decrease counter 2 in a loop for 3 iterations
        for (int i = 0; i < 3; i++) {
            counter2.decreaseCounter();
        }

        // print the current state of the counters
        System.out.println("The current state of the counters:");
        System.out.println("Counter 1 = " + counter1);
        System.out.println("Counter 2 = " + counter2);
        System.out.println("Counter 1 == Counter 2 is " + counter1.equals(counter2));

        // reset the counters
        counter1.resetCounter();
        counter2.resetCounter();

        // print the current state of the counters
        System.out.println("The current state of the counters:");
        System.out.println("Counter 1 = " + counter1);
        System.out.println("Counter 2 = " + counter2);
        System.out.println("Counter 1 == Counter 2 is " + counter1.equals(counter2));
    }
    
}
