package FileHandling;

import java.io.File;
import java.io.IOException;


public class CreateFile {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\sumana.k\\IdeaProjects\\CollectionsPrac\\src";
        String fileName = "newfile.txt";

        String filePath = directoryPath + "\\" + fileName;

        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File '" + fileName + "' created successfully at location: " + directoryPath);
            } else {
                System.out.println("File '" + fileName + "' already exists at location: " + directoryPath);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
