
/*
Ian McGinnis

6/21/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Assignment 5

It is a program for reading and writing from text and binary files
*/

//Prompt the user to enter the name of a file
//Ask whether they want to read or write from the file
//Ask whether they want to pick a binary or text file
//Ask if they want another line (if not then end the program)

//Create a ValidateInput class that ensures the user enters the correct inputs
//After receiving all inputs, I will create a file via a method (SetFileProperties class)
//From there, I will check whether the file is meant to be read 

//Create two methods called writingInFile() and readingInFile()
//These methods will prompt the user if they want to read or write in the file

// (while true) user will continue reading or writing until they select that they do not want to anymore

import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class FileTest {

    public static void main(String[] args) throws IOException {
    Scanner keyboard = new Scanner(System.in);

    // Constructors
    SetFileProperties fileProperties = new SetFileProperties();
    GetFileInfo getFile = new GetFileInfo();

    boolean userActive = true;

    while (userActive) {
        System.out.println("Enter the file name: ");
        String fileName = fileProperties.setFileName();
        System.out.println(fileName + " is the file name");

        System.out.println("Choose binary or text file (b/t): ");
        String typeOfFile = fileProperties.validateFileType();
        System.out.println(typeOfFile + " is the type of file");

        System.out.println("Enter the type of action (r/w): ");

        String action = fileProperties.validateFileAction();
        System.out.println(action + " is the type of action");

        // Create file here
        File file = FileHandler.CreateFile(fileName, typeOfFile, action);
        getFile.determineFileAction(file, action, typeOfFile);
        System.out.println("Continue? (y/n)");
        
        // Reused similar code to getFileInfo.validateWritingInput because it accomplished the same thing

        String userResult = getFile.validateWritingInput(keyboard.nextLine());

        if (userResult.equals("n")) {
            userActive = false;
            System.out.println("Finished"); // printed here just in case they say no in their input
            keyboard.close(); // check this line if it causes any issues
            return;
        }
    }
}


}