public class AverageCalculator {
	
	int sum;
	int count;
	
	public AverageCalculator() {
		sum = 0;
		count = 0;
	}
	public void add(int newNum) {
		this.sum += newNum;
		count++;
	}
	public int getSum() {
		return this.sum;
	}
	public int getCount() {
		return this.count;
	}
	public double getAverage() {
		if(count == 0) {
			return 0;
		}
		else {
			return this.sum/this.count;
		}
	}
}