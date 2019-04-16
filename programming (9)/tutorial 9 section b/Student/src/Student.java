
public class Student {
	private String Name;
	private String Matric;
	private String College;
	private String PhoneNum;
	
	public Student (String n, String m, String c, String p){
		Name = n;
		Matric = m;
		College = c;
		PhoneNum = p;
	}
	
	public void setName(String n) {
		Name = n;
	}
	public void setMatric(String m) {
		Matric = m;
	}
	public void setCollege(String c) {
		College = c;
	}
	public void setPhoneNum(String p) {
		PhoneNum = p;
	}
	
	public String getName() {
		return Name;
	}
	public String getMatric() {
		return Matric;
	}
	public String getCollege() {
		return College;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	
	public String toString(){
		String a = Name+" "+Matric+" "+College+" "+PhoneNum;
		return a;
	}
	
	public void displayInfo() {
		System.out.println(toString());
	}
	
}
