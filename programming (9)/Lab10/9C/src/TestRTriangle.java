import java.util.Scanner;
import java.text.DecimalFormat;

public class TestRTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double width, height, area, perimeter;
		
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
		RTriangle myTriangle = new RTriangle(); 
		width = sc.nextDouble();
		height = sc.nextDouble();
		myTriangle.setWidth(width); 
		myTriangle.setHeight(height); 
		
		area = myTriangle.getArea(); 
		perimeter = myTriangle.getPerimeter(); 
		System.out.println("Case #" + i + ": " + df.format(myTriangle.getWidth()) + " " + df.format(myTriangle.getHeight()) + " " + df.format(area) + " " + df.format(perimeter));
		}
		
		sc.close();
	}

}

class RTriangle {
	private double width;
	private double height;
	
	public RTriangle(){
		width = 0.0;
		height = 0.0;
	}
	
	void setWidth(double w) {
		width = w;
	}
	void setHeight(double h) {
		height = h;
	}

	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	
	double getArea() {
		return width*height*0.5;
	}
	
	double getPerimeter() {
		return width+height+(Math.sqrt(Math.pow(width, 2)+Math.pow(height, 2)));
	}
	
}
