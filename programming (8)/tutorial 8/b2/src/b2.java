import java.util.Scanner;

public class b2 {
	
	public static double toCelcius(double fahrenheit) {
		double celcius = (fahrenheit-32)*5/9;
		return celcius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double f = sc.nextInt();
		double ans = toCelcius(f);
		System.out.println(ans);
		
		sc.close();
		
	}

}
