import java.util.Scanner;

/*

Ian McGinnis

6/20/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Chapter 9 Assignment  
The program is designed for exception handling with dividing by zero

*/

public class NewFractionTest {

    public static void main(String[] args) {

    Fraction fraction = new Fraction();

    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Enter in a numerator: ");
        double numerator = scanner.nextDouble();
        //Call a method to fraction to change its num

        System.out.println("Enter in a denominator: ");
        double denominator = scanner.nextDouble();

        fraction.setFraction(numerator, denominator); // this method throws the exception

        String fractionResult = fraction.toString();
        System.out.println(fractionResult);
    }

    catch(DenominatorIsZeroException exception) {
        System.out.println(exception);

        boolean foundNonZero = false;

        while (!foundNonZero) {
            System.out.println("Enter a new number for the denomintor: ");
            double denominator = scanner.nextDouble();
            if (denominator != 0) {
                foundNonZero = true;
                fraction.setDenominator(denominator);
            }
            else {
                 System.out.println("Enter a new number for the denomintor: ");
                 denominator = scanner.nextDouble();
            }

        }

    }

    scanner.close();


}

}