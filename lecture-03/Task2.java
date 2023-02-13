import java.util.Random;
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner input = new Scanner(System.in);
  
    // Generate random numbers in range of 10
    int number1 = random.nextInt(10);
    int number2 = random.nextInt(10);
    int result = number1 * number2;
    
    // Read user input
    System.out.print(number1 + " * " + number2 + " = ");
    int output = input.nextInt();
    
    // Check if user multiplied numbers correctly
    if (output == result) {
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect!");
    }
  }
}
