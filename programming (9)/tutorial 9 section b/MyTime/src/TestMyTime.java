import java.util.Scanner;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MyTime time = new MyTime(0,0,0);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		time.setHour(hour);
		//time.setTime(hour, minute, second);
		time.nextHour();
		time.nextMinute();
		time.nextSecond();
	    
	    
		System.out.println(time.toString());
		
	}

}
