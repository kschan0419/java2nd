import java.util.Scanner;
import java.text.DecimalFormat;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			MyTime time = new MyTime();
			int h = sc.nextInt();
			int m = sc.nextInt();
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			
			time.setTime(h,m);
			time.incrementMinutes(m1);
			time.incrementHour(h1);
			System.out.println("Case #" + i + ": " +time.toString());
			
		}
		
	sc.close();	
	}

}

class MyTime {
	private int hour;
	private int minute;
	
	public MyTime(){
		hour = 0;	
		minute = 0;
	}
	
	public MyTime(int h,int m){
		hour = h;
		minute = m;
	}
	
	void setTime(int h,int m){
		hour = h;
		minute = m;
	}
	
	void setMinute(int m){
		minute = m;
	}
	void setHour(int h){
		hour = h;
	}
	int getHour(){
		return hour;
	}
	int getMinute(){
		return minute;
	}
	
	int incrementMinutes(int min){
		minute += min;
		if(minute>=60){
			minute -=60;
			hour++;
		}
		return minute;
	}
	int incrementHour(int hrs){
		hour += hrs;
		if(hour>=24){
			hour-=24;
		}
		return hour;
	}
	
	DecimalFormat df = new DecimalFormat("00");
	public String toString(){
		 return df.format(hour)+":"+df.format(minute);
	}
	
}
