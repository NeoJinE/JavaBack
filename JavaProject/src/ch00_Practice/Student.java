package ch00_Practice;

public class Student extends Person{ 
	
	private String stdNo;
	
	public Student(String name, String ssn, String stdNo) {
		super(name, ssn);
		this.stdNo = stdNo;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + stdNo;
	}

}