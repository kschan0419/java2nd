import java.util.Scanner;

public class testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		int x=1;
		while(!str.equals("#")){
			
			System.out.print("Case #1: ");
			
			String str2 ="";
			
			for(int i=0; i<str.length(); i++){
				char ch = str.charAt(i);
				
				if(ch>=48 && ch<57){
					ch += 1;
				}
				else if(ch==57){
					ch = 48;
				}
				else if(ch>=65 && ch<90){
					ch += 1;
				}
				else if(ch==90){
					ch = 65;
				}
				else if(ch>=97 && ch<122){
					ch += 1;
				}
				else if(ch==122){
					ch = 97;
				}
				
				str2 += ch;
			}
			
			System.out.print(str2);
			System.out.println();
			
			str = sc.nextLine();
			x++;
		}
		
	}

}
