import java.util.Scanner;
public class listoftowns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two towns
    System.out.print("Enter the first town: ");
    String town1 = input.nextLine();
    System.out.print("Enter the second town: ");
    String town2 = input.nextLine();
    
    if (town1.compareTo(town2) < 0) {
        System.out.println("The towns in alphabetical order are: " + town1 + ", " + town2);
    } else {
        System.out.println("The towns in alphabetical order are: " + town2 + ", " + town1);
    }
    input.close();
    }
}
