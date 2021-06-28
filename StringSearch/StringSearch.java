import java.util.*;
public class Lab5a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Boolean loop = true;
		String output = "'w' or 't' are at locations ";
		while(loop) {
			System.out.println("Enter a phrase: ");
			String nextLine = input.nextLine();
			if(nextLine.matches("-1")) {
				loop = false;
				System.out.println("bye");
				break;
			}
			else {
				for(int i=0; i < nextLine.length(); i++) {
					if(nextLine.charAt(i) == 'w' || nextLine.charAt(i) == 't') {
						output += i + ", ";
					}
				}
				output = output.substring(0, output.length()-2);
				System.out.println(output);
				output = "'w' or 't' are at locations ";
			}
		}
	}

}
