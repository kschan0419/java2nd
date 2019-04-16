import java.util.Scanner;
import java.text.DecimalFormat;

public class TestMyPrintCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		MyPrintCard cash = new MyPrintCard();
		
		int N = sc.nextInt();
		sc.nextLine();
		int x = 1;
		while(N!=0){
			System.out.println("Case #"+x+":");
			
			cash.getBalance();
			
			for (int i=0; i<N; i++){
			char check = sc.next(".").charAt(0);
			if(check == '='){
				System.out.println(cash.toString());
			}
			else if(check == '+'){
				double amt = sc.nextDouble();
				cash.topupCard(amt);
				System.out.println(cash.toString());
			}
			else if(check == '-'){
				double amt = sc.nextDouble();
				if(cash.payService(amt)==true){
					System.out.println(cash.toString());
				}
				else{
					System.out.println("invalid");
				}
			}
			}
			
			N = sc.nextInt();
			x++;
		}
		
		sc.close();
	}

}

class MyPrintCard {
	private double balance;
	
	public MyPrintCard() {
		balance = 10.00;
	}
	
	double getBalance(){
		balance = 10.00;
		return balance;
	}
	double topupCard(double amt){
		balance += amt;
		return balance;
	}
	boolean payService(double amt){
		balance -= amt;
		if(balance<5){
			balance += amt;
		return false;
		}
		else{
			return true;
		}
	}
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	public String toString(){
		return "RM"+df.format(balance);
	}
	
}