import java.util.Scanner;

/**
 * Task 2
 * - Ask user to enter a sentence
 * - Count the number of characters and empty spaces
 * - Ask user if he/she wants to continue
 */
public class Task2 {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner input = new Scanner(System.in);
   
    while(true) {
      // Get sentence
      System.out.print("Enter a sentence: ");
      String sentence = input.nextLine();
        
      // Turn input sentence to array
      char[] array = sentence.toCharArray();
      int count = 0;
      
      // Count the number of empty spaces
      for (int i = 0; i < array.length; i++) {
        char character = array[i];
        int ascii = character;
        if (ascii == 32) count++;
      }
    
      System.out.println("No. of spaces: " + count);
      System.out.println("No. of characters: " + array.length);
      
      // Prompt user
      System.out.print("Do you want to continue (y/n): ");
      String answer = input.nextLine();
      
      if (!answer.equalsIgnoreCase("y")) {
          break;
      }
    }
  }
}