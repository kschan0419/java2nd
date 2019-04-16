
public class PrimeNumbers {

	public static String Prime(int n){
		int a=1; // count no. of prime
		int x=1; //increasing
		String prime ="";
		while (a<=n){
			int b=0;
			for(int i=1; i<=x; i++){
				if(x%i==0){
					b++;
				}
			}
			if(b==2){
				a++;
				prime += x+" ";
			}
			x++;
		}
		return prime;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 50;
		String ans = Prime(N);
		System.out.println(ans);
		
	}

}
