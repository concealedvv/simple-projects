/*

Ian McGinnis

6/4/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 5 Assignment  
It is a program for creating an ADT, utilizing a fraction class

*/

import java.util.Scanner;

public class FractionTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        FractionClass FirstFraction = new FractionClass();
        FractionClass SecondFraction = new FractionClass();

        // Enter inputs for first fraction
        System.out.println("Enter the numerator for the first fraction: ");
        double firstNumerator = keyboard.nextDouble();

        System.out.println("Enter the denominator for the first fraction: ");
        double firstDenominator = keyboard.nextDouble();

        // Enter inputs for second fraction

        System.out.println("Enter the numerator for the second fraction: ");
        double secondNumerator = keyboard.nextDouble();

        System.out.println("Enter the denominator for the second fraction: ");
        double secondDenominator = keyboard.nextDouble();

        System.out.println("user put in all of their inputs");
        keyboard.close();

        FirstFraction.SolveFraction(firstNumerator, firstDenominator); 
        SecondFraction.SolveFraction(secondNumerator, secondDenominator);

        String firstfractionResult = FirstFraction.toString();
        System.out.print(firstfractionResult + "\n");

        String secondFractionResult = SecondFraction.toString();
        System.out.print(secondFractionResult + "\n");

        boolean equalStatus = FirstFraction.equals(SecondFraction);

        if (equalStatus == true) {
            System.out.println("The two fractions are equal");
        }

        else {
            System.out.println("The two fractions are not equal");
        }

    }
}