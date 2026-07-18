/*

Ian McGinnis

6/5/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 6 Assignment  
The program is for implementing the Sieve of Eratosthenes (also called prime sieve) algorithm.

*/

/*
    Add a scanner that returns a number (must be 2 or greater)
    Create a table that will hold the prime numbers

    Go from 2 to square of the selected number

    Use a enhanced for loop to get access to every valid number 
    Loop inside the enhanced loop to see if there are any points where it's not divisble


    If that number is not divisible by 2, it's a prime number

    Add that number to the table
 */

import java.util.Scanner;

public class PrimeSieveTest {
    public static void main(String[] args) {
        // Setting up Scanner

        int primeNumberStarter = 2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a integer greater than 2: ");
        int numberChosen = keyboard.nextInt();
        keyboard.close();

        //Start to loop through the numbers from 2 to the user's chosen number
        PrimeSieveClass.CheckPrimeNumbers(primeNumberStarter, numberChosen);
        
    }
}
