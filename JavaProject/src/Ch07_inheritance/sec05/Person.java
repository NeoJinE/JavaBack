package Ch07_inheritance.sec05;
public class Person {
	
	private String name, ssn;
	
	
	public Person(String name, String ssn)
	{  
		this.name = name;
		this.ssn = ssn;
	}
	

	@Override
	public String toString() {
		return name + ", " +ssn; 
	}
}