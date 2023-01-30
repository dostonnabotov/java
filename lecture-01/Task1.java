import java.util.Scanner;

/**
 * Task 1
 * Print "Hello, IF statement!" if input number from user 
 * is between 7 and 15
 */
public class Task1 {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Read user input
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        // Perform operation
        if (a >= 7 && a <= 15) {
            System.out.println("Hello, IF statement!");
        }
    }
}