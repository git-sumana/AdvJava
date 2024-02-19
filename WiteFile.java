package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class WiteFile {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\sumana.k\\IdeaProjects\\CollectionsPrac\\src\\newfile.txt";
        String data = "This is data that will be written to the file.";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data);
            System.out.println("Data written to '" + filePath + "' successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
