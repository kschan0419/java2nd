import java.util.Scanner;
import java.text.*;

public class question7E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = 1;
		while (x!=0 && y!=0){
			
			int length = y-x+1;
			double [][] arr = new double [length][12];
			for(int i=0; i<length; i++){
				for(int j=0; j<12; j++){
					arr[i][j]=sc.nextDouble();
				}
			}
			
			DecimalFormat df = new DecimalFormat("0.00");
			double [] avg = new double [length];
			for(int i=0; i<length; i++){
				double sum = 0;
				for(int j=0; j<12; j++){
					sum += arr[i][j];
				}
				avg[i]= sum/12;
			}
			
			int [] highest = new int [length];
			int [] lowest = new int [length];
			for(int i=0; i<length; i++){
				double max = arr[i][0];
				double min = arr[i][0];
				for(int j=0; j<12; j++){
					if(arr[i][j]>=max){
						max = arr[i][j];
						highest[i]=j+1;
					}
					if(arr[i][j]<=min){
						min = arr[i][j];
						lowest[i]=j+1;
					}
				}
			}
			
			String [] month1 = new String[length];
			String [] month2 = new String[length]; 
			for(int i=0; i<length; i++){
				if(highest[i]==1){
					month1[i]="Jan";
				}
				else if(highest[i]==2){
					month1[i]="Feb";
				}
				else if(highest[i]==3){
					month1[i]="Mar";
				}
				else if(highest[i]==4){
					month1[i]="Apr";
				}
				else if(highest[i]==5){
					month1[i]="May";
				}
				else if(highest[i]==6){
					month1[i]="Jun";
				}
				else if(highest[i]==7){
					month1[i]="Jul";
				}
				else if(highest[i]==8){
					month1[i]="Aug";
				}
				else if(highest[i]==9){
					month1[i]="Sep";
				}
				else if(highest[i]==10){
					month1[i]="Oct";
				}
				else if(highest[i]==11){
					month1[i]="Nov";
				}
				else if(highest[i]==12){
					month1[i]="Dec";
				}
				
				if(lowest[i]==1){
					month2[i]="Jan";
				}
				else if(lowest[i]==2){
					month2[i]="Feb";
				}
				else if(lowest[i]==3){
					month2[i]="Mar";
				}
				else if(lowest[i]==4){
					month2[i]="Apr";
				}
				else if(lowest[i]==5){
					month2[i]="May";
				}
				else if(lowest[i]==6){
					month2[i]="Jun";
				}
				else if(lowest[i]==7){
					month2[i]="Jul";
				}
				else if(lowest[i]==8){
					month2[i]="Aug";
				}
				else if(lowest[i]==9){
					month2[i]="Sep";
				}
				else if(lowest[i]==10){
					month2[i]="Oct";
				}
				else if(lowest[i]==11){
					month2[i]="Nov";
				}
				else if(lowest[i]==12){
					month2[i]="Dec";
				}
			}
			
			System.out.println("Case #"+x1+":");
			
			for(int i=0; i<length; i++){
				System.out.println("Year "+(x+i)+": Avg: "+df.format(avg[i])+" Lo: "+month2[i]+" Hi: "+month1[i]);
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			x1++;
		}
		
		sc.close();
	}

}
