package ch00_Practice;
public class Person {
	
	private String name, ssn;
	
	
	public void setPerson(String name, String ssn)
	{  
		this.name = name;
		this.ssn = ssn;
	}
	

	@Override
	public String toString() {
		return name + ", " +ssn; 
	}
}
