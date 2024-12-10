import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("Coverletter.txt"); // Ensure the file path is correct
            Scanner scanner = new Scanner(file);

            // Reading file content
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);  // Print each line of the file
            }
            scanner.close(); // Close the scanner
        } catch (IOException e) {
            System.out.println("File not found or error in reading the file");
        }
    }
}


