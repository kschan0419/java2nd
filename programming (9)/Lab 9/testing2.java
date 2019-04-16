import java.util.Scanner;

public class testing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n;i++){
			String str = sc.next();
			
			int s=0;
			for(int j=0; j<str.length(); j++){
				char ch = str.charAt(j);
				s += (ch-48)*(str.length()+1-j);
			}
			int a = s%11;
			int ans = 11-a;
			
			System.out.println("Case #"+i+": "+ans);
		}
	
		sc.close();
	}

}
