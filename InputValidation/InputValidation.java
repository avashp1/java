import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your SSN, Phone #, or Credit Card #: ");
		String userInput = input.nextLine();
		if(userInput.length() == 9) {
			System.out.println("SSN: " + userInput.substring(0,3) + "-" + userInput.substring(3,5) + "-" + userInput.substring(5));
			
		} else if (userInput.length() == 10) {
			System.out.println("Phone #: (" + userInput.substring(0,3) + ")" + userInput.substring(3,6) + "-" + userInput.substring(6));
			
		} else if (userInput.length() == 16) {
			System.out.println("Credit Card #: " + userInput.substring(0,4) + " " + userInput.substring(4,8) + " " + userInput.substring(8,12) + " " + userInput.substring(12));
			
		}else {
			System.out.println("Error: Invalid Input.");
		}
	}
}
