// Setting up a boolean table that will detect prime numbers as false and composite numbers as true

public class PrimeSieveClass {

    public static void CheckPrimeNumbers(int primeNumberStarter, int numberChosen) {
        boolean [] numbersToCheck = new boolean [numberChosen + 1];
        /* 
        Go through every number and mark it as prime for now 
        */
       
        for (int i = 2; i < numberChosen; i++) {
            numbersToCheck[i] = true;
        }

        for (int primeIndex = primeNumberStarter; primeIndex <= Math.sqrt(numberChosen); primeIndex++) {


             /*
            Check if the index is inside of the numbersToCheck table
            set the multiples of a number from 2 to the square root of the chosenNumber to false
            */
            if (numbersToCheck[primeIndex]) { // will only run if number is prime and evauluates to true
                for (int multipleIndex = primeIndex; primeIndex * multipleIndex <= numberChosen; multipleIndex++ ) {
                    numbersToCheck[primeIndex * multipleIndex] = false; // not a prime number
                }

                for (int i = primeNumberStarter; i <= numberChosen; i++ ) {
                    if (numbersToCheck[i]) {
                        System.out.println(i + " is prime");
                    }
                }

            }

        }
    }
}