/*
Ian McGinnis

6/21/26

26SU Obj-Orient Prog 1/Java (CIT-130-Z01)

Assignment 5

This class creates a file for the main method to use 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {

    public static File CreateFile(String Name, String type, String action) throws FileNotFoundException {
        final String fileName;
        final String fileType;
        final String fileAction;
        // Determine the type of file based on its type
        File file = null;

        //Use an exception to protect code
        try {
            fileName = Name;
            fileType = type;
            fileAction = action;

            String formattedName;

            if (type.equals("t")) {
                formattedName = String.format("%s.txt", Name);
            }
            else if (type.equals("b")) {
                formattedName = String.format("%s.bin", Name);
            }
            else {
                formattedName = "";
                System.err.println("user did not enter a valid file type and this should not happen");
            }

            file = new File(formattedName);

            if (file.createNewFile()) {
                System.out.println("File successfully created");
            }

            else {
                throw new IOException();
            }
            
            System.out.println("Created file");
            file.setReadable(true);
            file.setWritable(true);
            if (fileName.equals(null) || fileType.equals(null) || fileAction.equals(null)) {
                 throw new FileNotFoundException("One of the file parameters are null");
            }
        }


        catch (FileNotFoundException e) {
            System.out.println(e);
        }

         catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("returned file");
        return file;
    }

}
