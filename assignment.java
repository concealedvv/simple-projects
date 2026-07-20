import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {

        // 1. Generate two random single-digit integers
        int value1 = (int)(Math.random() * 10);
        int value2 = (int)(Math.random() * 10);

        // 2. If value1 < value2, swap value1 with value2
        if (value1 < value2) {
            int temp = value1;
            value1 = value2;
            value2 = temp;
        }
        
        // 3. Prompt the student to answer "what is _ - _?"
        System.out.println("What is " + value1 + " - " + value2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        //4. Grade the answer and display the result
        if (answer == value1 - value2) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong. " + value1 + " - " + value2 + " should be " + (value1 - value2));
        }
    }
}