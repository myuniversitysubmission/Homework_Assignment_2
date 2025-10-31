package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementDemo {

    public void readFile(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            System.out.println("Handled: File path cannot be null or empty.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line != null) {
                System.out.println("First line: " + line);
            } else {
                System.out.println("File exists but is empty.");
            }
        } catch (IOException e) {
            System.out.println("Handled: Could not read file (" + e.getMessage() + ")");
        }
    }
}
