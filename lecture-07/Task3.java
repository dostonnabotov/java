import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Task 3
 * - Read from myfile.txt
 * - Print every second line
 */
public class Task3 {
  public static void main(String[] args) {
    try {
      File file = new File("myfile.txt");
      Scanner reader = new Scanner(file);

      int lineNumber = 0;
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        lineNumber++;

        if (lineNumber % 2 == 0) {
          System.out.println(data);
        }
      }

      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}