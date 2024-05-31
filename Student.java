package Encapsulation;

public class Student {
	public String name;
	private int id ;
	private long registerID;
	public String Sname;
	
	Student(String name){
		this .name =name;
		this .Sname = "S.R.K.B.V";
		
	}
	
	public int getId() {
		return id;
	}

	public int setid(int a) {
		this.id = a;
		return a;
	}
	public long getregisterID() {
		return registerID;
		
	}
	public long setregisterID(long a) {
		this.registerID= a;
		return a;
	}

	@Override
	public String toString() {
		return " Name=" + name + "\n Id=" + id + "\n RegisterID=" + registerID + "\n Sname=" + Sname + "";
	}







	public static void main (String[] args) {
		 
		Student s = new Student("SUBIN");
		s.setid(10);
		s.setregisterID(411518104);
		 
		System.out.println(s);
		
		
		
	}
}