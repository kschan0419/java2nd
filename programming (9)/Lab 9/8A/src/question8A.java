import java.util.Scanner;

public class question8A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int x = 1;
		while(!str.equals("#")){
			
			char [] ch1 = new char [str.length()];
			
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch>=65&&ch<90){
					ch1[i]=(char)(ch+1);
				}
				else if(ch==90){
					ch1[i]=(char)(65);
				}
				else if(ch>=97&&ch<122){
					ch1[i]=(char)(ch+1);
				}
				else if(ch==122){
					ch1[i]=(char)(97);
				}
				else if(ch>=48&&ch<57){
					ch1[i]=(char)(ch+1);
				}
				else if(ch==57){
					ch1[i]=(char)(48);
				}
				else {
					ch1[i]=(char)(ch);
				}
			}
			
			String str2 = new String(ch1);
			
			System.out.println("Case #"+x+": "+str2);
			str = sc.nextLine();
			x++;
		}
		
	sc.close();	
	}

}