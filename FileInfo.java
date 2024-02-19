package FileHandling;
import java.io.File;
import java.util.Date;

public class FileInfo {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\sumana.k\\IdeaProjects\\CollectionsPrac\\src\\newfile.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("File Information for '" + filePath + "':");
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + new Date(file.lastModified()));
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } else {
            System.out.println("The file '" + filePath + "' does not exist.");
        }
    }
}
