import java.util.*;
public class StringSetTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many strings will you enter? ");
		int inputNum = input.nextInt();
		input.nextLine();
		StringSet test = new StringSet();
		int loop = 0;
		while(loop < inputNum) {
			System.out.println("Enter string number " + (loop+1) + ": ");
			String temp = input.nextLine();
			test.add(temp);
			loop++;
		}
		System.out.println("There are " + test.size() + " strings.");
		System.out.println("There are " + test.numChars() + " characters.");
		System.out.println("What would you like to search for ?");
		System.out.println("There were " + test.countStrings(input.nextLine())+ " matches.");
	}
}
