import java.util.Scanner;

public class soda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int [][] arr = new int [4][10];
		double [] average = new double [4];
		
		double highestvote = average[0];
		int a =0;
		for (int i=0; i<arr.length; i++){
			double SumOfRow = 0;
			for(int j=0; j<arr[0].length; j++){
				arr[i][j]= sc.nextInt();
				SumOfRow += arr[i][j];
			}
			average[i] = SumOfRow/10.0;
			System.out.println("average responses of soda "+i+" is "+average[i]);
		
			if(average[i] >= highestvote){
				highestvote = average[i];
				a = i;
			}
		}
		System.out.println();
		System.out.println("highest vote is soda "+a);
		System.out.println();
		
		
		for (int j=0; j<arr[0].length; j++){
			double SumOfCol = 0;
			for(int i=0; i<arr.length; i++){		
				SumOfCol += arr[i][j];
			}
			double average2 = SumOfCol/4;
			System.out.println("average responses of respondent "+j+" is "+average2);
		}
	
		sc.close();
		
		/*
		 3 4 5 2 1 4 3 2 4 4 
		 2 4 3 4 3 3 2 1 2 2
		 3 5 4 5 5 3 2 5 5 5
		 1 1 1 1 3 2 1 3 2 3 
		 */
	}
	
}

