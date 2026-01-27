package task3;
import java.util.Scanner;
public class inputValidation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		if (!scanner.hasNextInt()) {
			System.out.println("Error: Integers only!");
			} else {
				int number = scanner.nextInt();
				System.out.println("Valid input: " + number);
			}
		scanner.close();
	}
}

		