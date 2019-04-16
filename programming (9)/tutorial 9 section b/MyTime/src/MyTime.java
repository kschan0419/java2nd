
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s){
		if(h>=0 && h<24){
			hour = h;
		}
		if(m>=0 && m<60){
			minute = m;
		}
		if(s>=0 && s<60){
			second = s;
		}
	}
	
	public void setHour(int h) {
		hour = h;
	}
	public void setMinute(int m) {
		minute = m;
	}
	public void setSecond(int s) {
		second = s;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	int nextSecond(){
		if(second>=0 && second<59){
			second ++;
		}
		else if(second==59){
			second = 0;
			minute ++;
		}
		return second;
	}
	int nextMinute(){
		if(minute>=0 && minute<59){
			minute ++;
		}
		else if(minute==60){
			minute = 0;
			hour ++;
		}
		return minute;
	}
	int nextHour(){
		if(hour>=0 && hour<23){
			hour ++;
		}
		else if(hour==24){
			hour = 0;
		}
		return hour;
	}
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	
}