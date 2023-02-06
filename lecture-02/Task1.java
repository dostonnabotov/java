import java.util.Scanner;

/**
 * Task 1
 * Find the sum of 5 numbers
 */
public class Task1 {
  public static void main(String[] args) {
    int sum = 0;
    int count = 0;

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Calculate the sum
    while (count < 5) {
      // Read user input
      System.out.print("Enter a number: ");
      int n = input.nextInt();
      sum += n;
      count++;
    }

    // Print the sum
    System.out.println(sum);
  }
}
