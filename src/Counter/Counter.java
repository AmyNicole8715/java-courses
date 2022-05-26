package Counter;


/**
 * @(#)Counter.java
 * This counter app will count up to a given number but go no lower than 0.
 * 
 * 
 * @author Amy Check
 * @version 0.1 2022-05-23
 * 
 */

public class Counter {
    
    // Instance variables
    private int currentCount;
    
    
    // Default Constructor
    public Counter() {
        // Initialize the instance variables
        currentCount = 0;
    }

    // increment the counter
    public void increaseCounter() {
        currentCount++;
    }

    // decrement the counter
    public void decreaseCounter() {
        if (currentCount > 0) {
            currentCount--;
        }
    }


    // reset the counter
    public void resetCounter() {
        currentCount = 0;
    }

    // get the value of the counter
    public int getCounter() {
        return currentCount;
    }
    

    // set the value of the counter
    public void setCounter(int newCount) {
        currentCount = newCount;
    }

    // toString method
    public String toString() {
        return "The counter is at " + currentCount;
    }

    // equals method
    public boolean equals(Counter otherCounter) {
        return this.getCounter() == otherCounter.getCounter();
    }
}
