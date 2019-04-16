import java.util.Scanner;

public class question8B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N>=1 && N<=50){
			
			for(int i=1; i<=N; i++){
				
				String str = sc.next();
				int [] arr = new int [str.length()];
				for(int j=0; j<str.length(); j++){
					char ch = str.charAt(j);
					arr[j] = ch-48;
				}
				
				int x=0;
				for(int k=0; k<str.length(); k++){
					x += arr[k]*(str.length()+1-k);
				}
				
				int y = 11-(x%11);
				
				//int ans = y%11;
				
				System.out.println("Case #"+i+": "+y);

			}
		}
		
		sc.close();
	}

}
