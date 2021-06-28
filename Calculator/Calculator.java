import java.util.*;
public class Lab9e {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String num1, math, num2;
		int number1 = 0, number2 = 0;
		double calculated = 0;
		System.out.println("Type a number, a sign( +, -, *, or /), and another number with space between each: ");
		num1 = input.next();
		math = input.next();
		num2 = input.next();
		try {
			number1 = Integer.parseInt(num1);
		}
		catch(Exception e){
			System.out.println("First input is not an integer.");
			System.exit(0);
		}
		try {
			number2 = Integer.parseInt(num2);
		}
		catch(Exception e) {
			System.out.println("Second input is not an integer.");
			System. exit(0);
		}
		switch(math) {
		case "+":
			calculated = number1 + number2;
			System.out.println("Input " + number1 + " + " + number2);
			System.out.println("Output " + calculated);
			break;
		case "-":
			calculated = number1 - number2;
			System.out.println("Input " + number1 + " - " + number2);
			System.out.println("Output " + calculated);
			break;
		case "*":
			calculated = number1 * number2;
			System.out.println("Input " + number1 + " * " + number2);
			System.out.println("Output " + calculated);
			break;
		case "/":
			calculated = Double.parseDouble(num1)/Double.parseDouble(num2);
			System.out.println("Input " + number1 + " / " + number2);
			System.out.println("Output " + calculated);
			break;
			default:
				System.out.println("Second input was incorrect.");
				System.exit(0);
		}
	}
}
