import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value between 0(scissor), 1(rock) , and 2(paper):");
		int user = Integer.parseInt(input.nextLine());
		int rand = (int)(Math.random() * (2 - 0 + 1) + 0);
		String output;
		output = (user == 0 && rand == 1) ? "lose":
		(user == 1 && rand == 2) ? "lose":
		(user == 2 && rand == 0) ? "lose":
		(rand == 0 && user == 1) ? "win":
		(rand == 1 && user == 2) ? "win":
		(rand == 2 && user == 0) ? "win": "draw";
		System.out.println("You entered: " + user + " the Computer entered: " + rand);
		System.out.println("You " + output);
	}
}
