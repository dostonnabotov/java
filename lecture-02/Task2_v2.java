import java.util.Scanner;

/**
 * Task 2 - Without external library
 * Detect weekday by input number for March 2023
 * e.g. input = 6, output = "March 6, 2023 is Monday."
 */
public class Task2_v2 {
  public static void main(String[] args) {
    final String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Read user input
    System.out.print("Enter a date number: ");
    int date = input.nextInt();

    // Detect weekday
    String weekday = weekdays[(date + 2) % 7];

    // Print result
    System.out.println("March " + date + ", 2023 is " + weekday);
  }
}
