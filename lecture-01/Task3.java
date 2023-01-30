import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	  
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    // Read user inputs
    System.out.print("Enter the first number: ");
    double a = input.nextInt();
    System.out.print("Enter the second number: ");
    double b = input.nextInt();
    
    // Perform operations
    a = Math.sqrt(a);
    b = Math.pow(b, 3);
    
    if (b % 2 == 1) {
        System.out.println(Math.pow(a, 2));
    } else {
        System.out.println(a);
    }
	}
}

