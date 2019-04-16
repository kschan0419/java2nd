import java.util.Scanner;

public class b6 {

	public static int getHighest(int [] data) {
		int highest = data[0];
		for (int i=0; i<data.length; i++){
		if (data[i]>highest){
			highest = data[i];
		}
		}
		return highest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int ans = getHighest(arr);
		System.out.println(ans);
		
		sc.close();
	}

}
