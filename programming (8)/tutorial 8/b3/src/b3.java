import java.util.Scanner;

public class b3 {

	public static int toSecond(int hour, int min, int sec) {
		int TimeInSecond = hour*60*60 + min*60 + sec;
		return TimeInSecond;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int hr = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		int ans = toSecond(hr,minute,second);
		System.out.println(ans);
		
		sc.close();
	}

}
