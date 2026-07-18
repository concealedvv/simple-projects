import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.nio.file.Path;

public class GetFileInfo {
    Scanner keyboard = new Scanner(System.in);

    public void determineFileAction(File file, String fileAction, String fileType) throws FileNotFoundException, EOFException, IOException {

        // Writing objects
        PrintWriter writingTextObject = null;
        DataOutputStream writingBinaryObject = null;

        Scanner readingWritingObject = null;
        DataInputStream readingBinaryObject = null;


        try {

            // I don't like making many if statements. Is there any way to reduce them with
            // a better method?

            // writing in text file
            if (fileAction.equals("w") & fileType.equals("t")) {
                System.out.println("The file should write for text file");
                writingTextObject = new PrintWriter(new FileOutputStream(file));
                writingInTextFile(writingTextObject);
            }

            // writing in binary file
            else if (fileAction.equals("w") & fileType.equals("b")) {
                System.out.println("The file should write for binary file");
                writingBinaryObject = new DataOutputStream(new FileOutputStream(file));
                writingInBinaryFile(writingBinaryObject);
            }

            // reading in text file
            else if (fileAction.equals("r") & fileType.equals("t")) {
                System.out.println("The file should read for text file");
                
                 readingWritingObject = new Scanner(file);

                readingInTextFile(readingWritingObject);
            }

            // reading in binary file
            else if (fileAction.equals("r") & fileType.equals("b")) {
                System.out.println("The file should read for binary file");

                readingBinaryObject = new DataInputStream(new FileInputStream(file));

                readingInBinaryFile(readingBinaryObject);
            }

        }

        catch (FileNotFoundException e) {
            System.out.println(e);
            Path path = Path.of(file.toURI());
            System.out.println("This is the file path right here: " + path);
        }
        catch (EOFException e) {
            System.out.println("Nothing for the file to read");
        }

        catch (IOException i) {
            System.out.println(i);
        }

    }

    public void writingInTextFile(PrintWriter writingFile) throws IOException {
        boolean userStoppedWritingLines = false;

        try {

            while (!userStoppedWritingLines) {
                System.out.println("Enter a line of information to write to the file");
                String informationText = keyboard.nextLine();
                writingFile.println(informationText);
                System.out.println("Added to file");
                System.out.println("Do you want to write another line? (y/n) ");
                String userResponse = validateWritingInput(keyboard.nextLine());
                if (userResponse instanceof String == false) {
                    throw new IOException("This is supposed to be a string value");
                }
                if (userResponse.equals("n")) {
                    writingFile.close();
                    userStoppedWritingLines = true;
                    return;
                }
            }
        } catch (IOException i) {
            System.out.println(i);
        }

    }

    public void writingInBinaryFile(DataOutputStream writingFile) throws IOException {
        boolean userStoppedWritingLines = false;
        try {

            while (!userStoppedWritingLines) {
                System.out.println("Enter a line of information to write to the file");
                String informationText = keyboard.nextLine();
                writingFile.writeUTF(informationText);
                System.out.println("Added to file");
                System.out.println("Do you want to write another line? (y/n) ");
                String userResponse = validateWritingInput(keyboard.nextLine());
                if (userResponse instanceof String == false) {
                    throw new IOException("This is supposed to be a string value");
                }
                if (userResponse.equals("n")) {
                    writingFile.close();
                    userStoppedWritingLines = true;
                    return;
                }
                // It is in fact in binary and the text editor can't really interpret it
            }

        } catch (IOException i) {
            System.out.println(i);
        }

    }

    public void readingInTextFile(Scanner readingFile) throws IOException, NoSuchElementException {
        boolean userStoppedWritingLines = false;

        try {

            while (!userStoppedWritingLines || readingFile.hasNextLine())  {
                String informationText = readingFile.nextLine();
                System.out.println(informationText + "\n");
                System.out.println("Read from file");
                System.out.println("Do you want to read another line? (y/n) ");
                String userResponse = validateWritingInput(keyboard.nextLine());

                if (userResponse instanceof String == false) {
                    throw new IOException("This is supposed to be a string value");
                }
                if (userResponse.equals("n")) {
                    readingFile.close();
                    userStoppedWritingLines = true;
                    return;
                }
            }
        } catch (IOException i) {
            System.out.println(i);
        }

        catch (NoSuchElementException n) {
            System.out.println("There's nothing for the file to read!");
            return;
        }

    }

    public void readingInBinaryFile(DataInputStream readingFile) throws EOFException {
        
        
        // This method allows users to read by char instead of by lines because the readLine() method is deprecated
        try {
            boolean userReadingFile = true; 

            while ((userReadingFile)) {

                String binaryInfo = readingFile.readUTF();
                System.out.println("Read " + binaryInfo + " from file \n");

                System.out.println("Do you want to read another char? (y/n) ");
                String userResponse = validateWritingInput(keyboard.nextLine());

                if (userResponse instanceof String == false) {
                    throw new IOException("This is supposed to be a string value");
                }
                if (userResponse.equals("n")) {
                    userReadingFile = false;
                    readingFile.close();
                    return;
                }
            }
        }

        catch (EOFException e) {
            System.out.println("There is nothing for the file to read");
        }
        catch (IOException i) {
            System.out.println(i); // mainly here to please compiler
        }

    }

    public String validateWritingInput(String userInput) {
        if (userInput.equals("y") || userInput.equals("n")) {
            return userInput;
        } else {
            boolean correctInput = false;
            while (!correctInput) {
                System.out.println("Enter the correct user input (y/n) ");
                String yesOrNoString = keyboard.nextLine();
                if (yesOrNoString.equals("y") || yesOrNoString.equals("n")) {
                    correctInput = true;
                    return yesOrNoString;
                }

            }
            return "";
        }

    }

}
