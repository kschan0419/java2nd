import java.util.Scanner;

public class b5 {

	public static int calculateSum(int [] data) {
		int Sum=0;
		for (int i=0; i<data.length; i++){
			Sum += data[i];
		}
		return Sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int [] arr = new int [n];
		for (int i=0; i<n; i++){
			arr [i] = sc.nextInt();
		}
		int ans = calculateSum(arr);
		System.out.println(ans);
		
		sc.close();
	}

}
