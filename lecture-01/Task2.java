import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
	    
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    Scanner response = new Scanner(System.in);
    
    // Constast values
    int INITIAL = 3;
    int FINAL = 13;
    
    while (true) {
      // Read user input
      System.out.print("Enter a number: ");
      int num = input.nextInt();
      
      for (int i = INITIAL; i <= FINAL; i++) {
          System.out.println(num * i);
      }
      
      // Prompt user to continue or not
      System.out.print("Do you want to continue (y/n): ");
      String answer = response.nextLine();

      // Stop execution if answer is anything but "y"
      if (!answer.equalsIgnoreCase("y")) {
        break;
      }
    }
	}
}

