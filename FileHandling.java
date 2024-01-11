import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String filePath = "nonexistentfile.txt";

        try {
            // Attempt to open the file
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Read from the file or perform other operations

            // Close the scanner when done
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the exception when the file is not found
            System.out.println("File not found: " + filePath);
            e.printStackTrace(); // This line is optional; it prints the stack trace for debugging purposes
        }
    }
}
