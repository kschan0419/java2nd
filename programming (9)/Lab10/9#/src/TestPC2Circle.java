import java.util.Scanner;
import java.text.DecimalFormat;

public class TestPC2Circle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			
			PC2Circle myCircle = new PC2Circle(); 
			
			double radius = sc.nextDouble();
			myCircle.setRadius(radius); 
			double area = myCircle.getArea(); 
			double circumference = myCircle.getCircumference(); 
			
			System.out.println("Case #" + i + ": " +
			df.format(myCircle.getRadius()) + " " +
		    df.format(area) + " " + df.format(circumference));
		}
		
	sc.close();	
	}
	
}

class PC2Circle { // NOT a public class
private double radius; // private instance variable

public PC2Circle() { // constructor without parameter
radius = 0.0;
}

void setRadius(double rad) {
radius = rad;
}

double getRadius() {
return radius;
}
double getArea() {
return radius * radius * Math.PI;
}
double getCircumference() {
return 2 * Math.PI * radius;
}

}