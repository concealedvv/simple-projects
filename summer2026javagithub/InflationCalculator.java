/*

Ian McGinnis

5/30/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 3 Assignment  
It is a program for control flow practice and writing an inflation calculator.

*/

/* 
    Declare amount of money, rate, and number of years through Scanner
    
    Create a for loop that returns the inflation value up to the requested number of years (optional as we only need the end result)
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class InflationCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the initial amount of money: ");
        double initialAmount = keyboard.nextDouble();

        System.out.println("Enter the inflation rate as a percentage (don't include the percent sign): ");
        double inflationRate = keyboard.nextDouble() / 100;

        System.out.println("Enter the amount of years: ");
        int numberOfYears = keyboard.nextInt();

        System.out.println("got all of the inputs " + "\n");

        keyboard.close();
        //End of Scanner

        NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();
    
        double TotalAmount = 0; // initializing the total amount to start off

        for (int iteratedNumberOfYears = 0; iteratedNumberOfYears <= numberOfYears; iteratedNumberOfYears++) {                                
        TotalAmount = initialAmount * Math.pow(1 + inflationRate, iteratedNumberOfYears);
       System.out.println(numberFormatter.format(TotalAmount) + " at year " + iteratedNumberOfYears);
       

        if (iteratedNumberOfYears == numberOfYears) {
            
            System.out.println("The total amount of money at " + inflationRate + "% over " + numberOfYears + " years is " + numberFormatter.format(TotalAmount) + " dollars.");
        }
        }
    }
}
