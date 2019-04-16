import java.util.Scanner;

public class RotateTheSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[3][3];
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int j=0; j<arr[0].length; j++){
			for(int i=arr.length-1; i>=0; i--){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
