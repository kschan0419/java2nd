import java.util.Scanner;

public class question7D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if (N<=24){
			int x=1;
			while(N!=0){
				
				int [][] arr = new int [N][N];
				for (int i=0; i<arr.length; i++){
					for (int j=0; j<arr[0].length; j++){
						arr[i][j] = sc.nextInt();
					}
				}//loads all the elements
				
				System.out.println("Case #"+x+":");
				
				int check = 0;
				
				for (int j=0; j<arr[0].length; j++){
					int count = 0;
					for (int i=0; i<arr.length; i++){
						if(arr[i][j]==1){
							count++;
						}
					}
					if(count==1*N){
						System.out.println("column "+(j+1));
						check ++;
					}
				}
				
				if(check==0){
					System.out.println("none");
				}
				
				N = sc.nextInt();
				x++;
			}
		}
		
		sc.close();
	}

}
