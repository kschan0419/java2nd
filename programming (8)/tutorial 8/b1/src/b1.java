import java.util.Scanner;

public class b1 {
	
	public static double calculateArea(double r){
		double area = Math.PI*r*r;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double radius = sc.nextDouble();
		double ans = calculateArea(radius);
		System.out.println(ans);
		
		sc.close();
	}

}
