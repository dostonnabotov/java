import java.util.Scanner;
import java.lang.ArithmeticException;

/**
 * Task 4
 * - Ask for A and B (int)
 * - Calculate A + sqrt(B)
 * - Use try..catch..finally
 */
public class Task4 {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.print("A: ");
      double a = scanner.nextDouble();

      System.out.print("B: ");
      double b = scanner.nextDouble();

      double result = a + Math.sqrt(b);
      System.out.printf("Result: %1$.3f\n", result);

      scanner.close();
    } catch (ArithmeticException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } finally {
      System.out.println("The program has finished.");
    }
  }
}