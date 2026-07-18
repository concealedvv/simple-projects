/*

Ian McGinnis

5/30/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 2 Assignment  
It is a program for control flow practice and writing an inflation calculator.

*/

public class Counter {
    private int counterClick;

    public Counter() {
        counterClick = 0; // sets the click at 0 at the start of run time (used only for the start)
    }

    public void InitalizeCounterToZero(int Counter) {

        if (counterClick >= 0) {
            counterClick = 0; // resets it to 0 during the program and not at the start of it
            System.out.println("Initalized all counters to 0");
        }

    }

    public void SetCustomCounter(int requestedAmount) { // use if you want to set a custom amount
        if (requestedAmount < 0) {
            return;
        }

        counterClick = requestedAmount;
    }

    public String toString() {
        return "The current number of clicks is " + counterClick;
    }

    public int getClicks() {
        return counterClick;
    }

    public void IncrementCounterUpBy1(String counterName) {
        int counterClickPlaceholder = counterClick;
        counterClick = counterClick + 1;
        CheckValue(counterClick, counterClickPlaceholder);

        System.out.println("Successfully changed " + counterName + " 's value!");
    }

    public void DecrementCounterDownBy1(String counterName) {
        int counterClickPlaceholder = counterClick;
        counterClick = counterClick - 1;
        CheckValue(counterClick, counterClickPlaceholder);

        System.out.println("Successfully changed " + counterName + " 's value!");
    }

    public boolean equals(Counter otherCounter) {

        return this.getClicks() == otherCounter.getClicks();
    }

    public void CheckValue(int SpecificCounter, int counterClickPlaceholder) {

        if (SpecificCounter >= 0) {
            String UpdatedCounterString = toString();
            System.out.println(UpdatedCounterString);
            return; // no issues here
        } else {
            System.out.println("The Counter is not supposed to do this.");
            counterClick = counterClickPlaceholder;
            String UpdatedCounterString = toString();
            System.out.println(UpdatedCounterString);
        }
    }

}
