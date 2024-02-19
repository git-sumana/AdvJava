import java.io.BufferedReader;
package FileHandling;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // Absolute path to the file
        String filePath = "C:\\Users\\sumana.k\\IdeaProjects\\CollectionsPrac\\src\\newfile.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Contents of '" + filePath + "':");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
