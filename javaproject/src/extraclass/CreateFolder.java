package extraclass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder {
    public static void main(String[] args) {
        Path folderPath = Paths.get("C:/rasel");

        // Create the folder
        try {
            if (Files.createDirectories(folderPath) != null) {
                System.out.println("Folder created successfully.");
            }
        } catch (Exception e) {
            System.out.println("Failed to create the folder: " + e.getMessage());
        }
    }
}
