package Activities;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) {
        try {
            // Create a new text file
            File file = new File("Ishita.txt");
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
            FileUtils.writeStringToFile(file, "This is modified content", "UTF-8");
            File directory = new File("resources");
            boolean directoryCreated = directory.mkdir();
            if (directoryCreated) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Directory already exists.");
            }
            File destination = new File(directory.getPath() + File.separator + file.getName());
            FileUtils.copyFile(file, destination);
            File copiedFile = FileUtils.getFile(destination.getPath());
            String fileContent = FileUtils.readFileToString(copiedFile, "UTF-8");
            System.out.println("Content of the copied file:\n" + fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

