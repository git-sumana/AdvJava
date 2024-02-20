package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\sumana.k\\IdeaProjects\\JavaRec\\src\\data.csv";

         generateCSV(csvFile, 10_001);
        separateLeapYearNumbers(csvFile);

    }
    public static void generateCSV(String fileName, int numRows) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
                        fileWriter.append("CellNumber,RandomNumber\n");

            Random random = new Random();
            for (int i = 1; i <= numRows; i++) {
                int cellNumber = i; // Generating a random 10-digit cell number
                int randomNumber = random.nextInt(1000); // Generating a random number between 0 and 999
                fileWriter.append(cellNumber + "," + randomNumber + "\n");
            }

            System.out.println("CSV file " + fileName + " generated successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while generating CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void separateLeapYearNumbers(String fileName) {

        String separatedFileName = "C:\\Users\\sumana.k\\IdeaProjects\\JavaRec\\src\\separateddata.csv";
        try (FileWriter separatedFileWriter = new FileWriter(separatedFileName)) {

            separatedFileWriter.append("CellNumber,RandomNumber\n");


            try (java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(fileName))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {

                    if (line.startsWith("CellNumber")) {
                        continue;
                    }

                    String[] parts = line.split(",");
                    int cellNumber = Integer.parseInt(parts[0]);
                    int randomNumber = Integer.parseInt(parts[1]);


                    if (isLeapYear(randomNumber)) {

                        separatedFileWriter.append(cellNumber + "," + randomNumber + "\n");
                    }
                }

                System.out.println("Leap year numbers separated and saved to " + separatedFileName);
            } catch (IOException e) {
                System.out.println("Error occurred while reading original CSV file: " + e.getMessage());
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Error occurred while creating separated CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}