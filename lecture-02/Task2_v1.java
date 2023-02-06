import java.util.Scanner;
import java.util.Calendar;

/**
 * Task 2 - With external library
 * Detect weekday by input number for March 2023
 * e.g. input = 6, output = "March 6, 2023 is Monday."
 */
public class Task2_v1 {
  public static void main(String[] args) {

    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Read user input
    System.out.print("Enter a date number: ");
    int date = input.nextInt();

    // Create a Calendar object
    Calendar cal = Calendar.getInstance();
    cal.set(2023, 2, date);

    // Get weekday number
    int day = cal.get(Calendar.DAY_OF_WEEK);
    String weekday = "";

    // Detect weekday
    switch (day) {
      case 1:
        weekday = "Sunday";
        break;
      case 2:
        weekday = "Monday";
        break;
      case 3:
        weekday = "Tuesday";
        break;
      case 4:
        weekday = "Wednesday";
        break;
      case 5:
        weekday = "Thursday";
        break;
      case 6:
        weekday = "Friday";
        break;
      case 7:
        weekday = "Saturday";
        break;
    }

    System.out.println("March " + date + ", 2023 is " + weekday);
  }
}
