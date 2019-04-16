import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][] arr = new int [N][N];
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		int M = N*((N*N)+1)/2;
		int check = 0;
		for(int i=0; i<N; i++){
			int sum = 0;
			for(int j=0; j<N; j++){
				sum += arr[i][j];
			}
			if(sum == M){
				check ++;
			}
		}
		
		for(int j=0; j<N; j++){
			int sum = 0;
			for(int i=0; i<N; i++){
				sum += arr[i][j];
			}
			if(sum == M){
				check ++;
			}
		}
		
		int sum1 = 0;
		for(int k=0; k<N; k++){
			sum1 += arr[k][k];
			if(sum1 == M){
				check++;
			}
		}
		
		int sum2 = 0;
		for(int k=0; k<N; k++){
			sum2 += arr[k][N-k-1];
			if(sum2 == M){
				check++;
			}
		}
		
		if(check == N*2+2){
			System.out.println(M+" Yes");
		}
		else{
			System.out.println(M+" Not");
		}
		
		sc.close();
	}

}
