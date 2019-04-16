import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		String str2 = new String();
		
		System.out.println(str.length()); 
		
		str = str.toUpperCase(); 
		
		int vowel =0;
		int consonant =0;
		int digit =0;
		int space =0;
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
			
				if(ch==65||ch==69||ch==73||ch==79||ch==85){
					vowel ++;
				}
				else if (ch>=65 && ch<=90 && ch!=65 && ch!=69 && ch!=73 && ch!=79 && ch!=85 ){
					consonant ++;
				}
				/*
				else if (ch>=48 && ch<=57){
					digit ++;
				}
				*/
				else if (Character.isDigit(ch)){
					digit ++;
				}
				else if (Character.isSpaceChar(ch)){
					space ++;
				}
				/*
				else if (ch==32){
					space++;
				}
				*/
				
			}
			System.out.println("no. of vowels: "+vowel); 
			System.out.println("no. of consonants: "+consonant);
			System.out.println("no. of digits: "+digit);
			System.out.println("no. of blank spaces: "+space);
			
			str2 = str.replace("A", "*");
			System.out.println(str2);
			
			str2 = str.replaceAll("[AEIOU]","");
			System.out.println(str2);
			
			sc.close();
	}

}
