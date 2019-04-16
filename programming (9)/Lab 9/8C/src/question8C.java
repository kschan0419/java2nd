import java.util.Scanner;

public class question8C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>=1 && N<=50){
			
			for(int i=1; i<=N; i++){
				
				String str = sc.next();
				String str2 = new String();
				
				if (str.length() < 50){
					
					str = str.toLowerCase();
					
					for(int j=str.length()-1; j>=0; j--){
						str2 += str.charAt(j);
					}
					
					if (str2.equals(str)){
						System.out.println("Case #"+i+": Yes");
					}
					else{
						System.out.println("Case #"+i+": No");
					}
					
				}
			
			}
		}
		
		sc.close();
	}

}
