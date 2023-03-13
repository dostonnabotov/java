import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Task 1
 * - Ask for a name
 * - Write the name to a file
 */
public class Task1 {
	public static void main(String[] args) {
		try {
			File file = new File("myfile.txt");
			FileWriter writer = new FileWriter("myfile.txt");
			Scanner scanner = new Scanner(System.in);
			
			// Create
			file.createNewFile();

			// Read
			System.out.print("Enter your name: ");
			String name = scanner.nextLine();

			// Write
			writer.write(name);
			System.out.println("Successfully wrote to the file.");
		  
			// Close
			writer.close();
			scanner.close();
		} catch(IOException e) {
		    System.out.println("An error occured.");
		    e.printStackTrace();
		}
	}
}
