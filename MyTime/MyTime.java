public class MyTime {
	private int hour;
	private int minutes;
	private int seconds;
	private long time;
	
	public MyTime() {
		this.time = System.currentTimeMillis();
		this.hour = (int)((this.time/(1000*60*60))%24);
		this.minutes = (int)((this.time/(1000*60))%60);
		this.seconds = (int)((this.time/(1000))%60);
	}
	
	public MyTime(long time) {
		this.hour = (int)((time/(1000*60*60))%24);
		this.minutes = (int)((time/(1000*60))%60);
		this.seconds = (int)((time/(1000))%60);
	}
	
	public MyTime(int h, int m, int s) {
		this.hour = h;
		this.minutes = m;
		this.seconds = s;
	}
	
	public void setTime(long elapsedTime) {
		this.time = elapsedTime;
	}
	
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minutes;
	}
	public int getSecond() {
		return this.seconds;
	}
	
}
