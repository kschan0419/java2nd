import java.util.Scanner;

public class testing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String [] arr = new String[N];
		for(int i=0; i<N; i++){
			arr[i] = sc.next();
		}
		
		for(int i=0; i<N; i++){
			String str = "";
			for(int j=arr[i].length()-1; j>=0; j--){
				str += arr[i].charAt(j);
			}
			
			
			if(str.toLowerCase().equals(arr[i].toLowerCase())){
				System.out.println("Case #"+(i+1)+": Yes");
			}
			else { 
				System.out.println("Case #"+(i+1)+": No");
			}
		}
		
		sc.close();
	}

}
