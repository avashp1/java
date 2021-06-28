public class AverageCalculatorMain {
	public static void main(String[] args) {
		AverageCalculator avg1 = new AverageCalculator();
		avg1.add(5);
		System.out.println("Sum: " + avg1.getSum() + " | Count: " + avg1.getCount() + " | Average: " + avg1.getAverage());
		avg1.add(3);
		avg1.add(2);
		avg1.add(1);
		System.out.println("Sum: " + avg1.getSum() + " | Count: " + avg1.getCount() + " | Average: " + avg1.getAverage());
	}
}