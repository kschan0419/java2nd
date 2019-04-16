import java.util.Scanner;
import java.text.DecimalFormat;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
	
		int N = sc.nextInt();
		for(int i=1; i<=N; i++){
			Rectangle r = new Rectangle();
			double width = sc.nextDouble();
			double height = sc.nextDouble();
			r.setWidth(width);
			r.setHeight(height);
			double area = r.getArea();
			double perimeter = r.getPerimeter();
			
			System.out.println("Case #"+i+": "+df.format(width)+" "+df.format(height)+" "+df.format(area)+" "+df.format(perimeter));
		}
		
		sc.close();
	}

}

class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		width = 0;
		height = 0;
	}
	
	void setWidth(double w){
		width = w;
	}
	void setHeight(double h){
		height = h;
	}
	
	double getWidth(){
		return width;
	}
	double getHeight(){
		return height;
	}
	double getArea(){
		return width*height;
	}
	double getPerimeter(){
		return width*2+height*2;
	}
	
}