import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Task 2
 * - Ask for a sentence
 * - If the words > 5, write to long.txt
 * - Otherwise, write to short.txt
 */
public class Task2 {
  public static void main(String[] args) {
    try {
      FileWriter writer;

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a sentence: ");
      String sentence = scanner.nextLine();

      int numberOfWords = sentence.split(" ").length;
      if (numberOfWords > 5) {
        File file = new File("long.txt");
        file.createNewFile();

        writer = new FileWriter("long.txt");

      } else {
        File file = new File("short.txt");
        file.createNewFile();

        writer = new FileWriter("short.txt");
      }

      writer.write(sentence);
      System.out.println("Successfully wrote to the file.");

      writer.close();
      scanner.close();
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }

  }
}