import java.util.Scanner;
public class StudentTester {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		String m1 = sc.nextLine();
		String c1 = sc.nextLine();
		String p1 = sc.nextLine();
		Student s = new Student(n1,m1,c1,p1);
		s.displayInfo();
		
		sc.close();
	}
	
}