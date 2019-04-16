import java.util.Scanner;
import java.text.*;

public class question7A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if (N<=100){
			
			int x = 1;
			while(N!=0){

				String key = sc.next();
				char [] arr = new char [key.length()];
				for(int a = 0; a < key.length(); a++){
					arr[a]= key.charAt(a);
				}
				
				System.out.println("Case #"+x+":");
				
				DecimalFormat df = new DecimalFormat("0.00");
				
				for(int i=0; i<N; i++){
					String ans = sc.next();
					double marks =0;
					for(int j = 0; j < ans.length(); j++) {
						char ch = ans.charAt(j);
						if (ch == arr[j]){
							marks ++;
						}
						else {
							marks -= 0.25;
						}
					}
					System.out.println("Student "+i+": "+df.format(marks));
				}
				
				N = sc.nextInt();
				x++;
			}
				
		}
		
		sc.close();
	}

}
