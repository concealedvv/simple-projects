import java.util.Scanner;

// I am using this class so that the entire code is not inside of the main method

public class SetFileProperties {
    Scanner keyboard = new Scanner(System.in);

    public String setFileName() {
        
        String fileName = String.format("%s", keyboard.nextLine());
        
        return fileName;
    }

    public String validateFileType() {
        
        String userInput = keyboard.nextLine();
        
        if (userInput.equals("b") || userInput.equals("t")) {
            return userInput;
        }
        else {
            boolean correctInput = false;
            while (!correctInput) {
                System.out.println("Choose the correct type of file (b/t): ");
                String newinput = keyboard.nextLine();
                if (newinput.equals("b") || newinput.equals("t")) {
                    correctInput = true;
                   
                    return newinput;
                }
            }
           
            return ""; // should never get to here but I have it here so the compiler does not complain
        }

    }

     public String validateFileAction() {
        String userInput = keyboard.nextLine();

        if (userInput.equals("r") || userInput.equals("w")) {
             
            return userInput;
        }
        else {
            boolean correctInput = false;
            while (!correctInput) {
                System.out.println("Choose the correct type of file (r/w): ");
                String newinput = keyboard.nextLine();
                if (newinput.equals("r") || newinput.equals("w")) {
                    correctInput = true;
                    
                    return newinput;
                }
            }
            return ""; // should never get to here but I have it here so the compiler does not complain
        }
    }
}