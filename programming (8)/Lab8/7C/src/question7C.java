import java.util.Scanner;
import java.text.*;

public class question7C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		if (N<=100){
		
			int x=1;
			while(N!=0){
				System.out.print("Case #"+x+": ");
				
				int [][] arr = new int [N][7];
				for (int i=0; i<arr.length; i++){
					for (int j=0; j<arr[0].length; j++){
						arr[i][j] = sc.nextInt();
					}
				}
				
				DecimalFormat df = new DecimalFormat("0.00");
				int count = 0;
				double percentage;
				for (int i=0; i<arr.length; i++){
					int sum = 0;
					for (int j=0; j<arr[0].length; j++){
						sum += arr[i][j];
					}
					if (sum>25){
						count++;
					}
				}
				percentage = count*100/N;
				System.out.print(df.format(percentage)+"%");
				System.out.println();
				
				for (int i=0; i<arr.length; i++){
					int total = 0;
					for (int j=0; j<arr[0].length; j++){
						total += arr[i][j];
					}
					System.out.println("Student "+i+": "+total);
				}
				
				N = sc.nextInt();
				x++;
			}
			
		}
		
		sc.close();
		
	}

}
