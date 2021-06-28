public class Tester {
	public static void main(String[] args) {
		MyTime t1 = new MyTime();
		MyTime t2 = new MyTime(555550000);
		MyTime t3 = new MyTime(5,23,55);
		int hour, minute, second;
		hour = t1.getHour();
		minute = t1.getMinute();
		second = t1.getSecond();
		System.out.println(hour + ":" + minute + ":" + second);
		hour = t2.getHour();
		minute = t2.getMinute();
		second = t2.getSecond();
		System.out.println(hour + ":" + minute + ":" + second);
		hour = t3.getHour();
		minute = t3.getMinute();
		second = t3.getSecond();
		System.out.println(hour + ":" + minute + ":" + second);
		
	}
}
