import java.util.Scanner;
import java.text.DecimalFormat;

public class TestEqTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		EqTriangle x = new EqTriangle();
		
		int N = sc.nextInt();
		for(int i=1; i<=N; i++){
			double side = sc.nextDouble();
			x.setSide(side);
			double area = x.getArea();
			double perimeter = x.getPerimeter();
			System.out.println("Case #"+i+": "+side+" "+df.format(area)+" "+df.format(perimeter));
		
		sc.close();
		}
		
	}

}

class EqTriangle{
	private double side;
	
	public EqTriangle(){
	side = 0;	
	}
	
	void setSide(double s){
		side = s;
	}
	double getSide(){
		return side;
	}
	double getArea(){
		return Math.sqrt(3)*side*side*0.25;
	}
	double getPerimeter(){
		return side*3;
	}
	
}