package Ch07_inheritance.sec04;

public class Employee {

	//1.멤버변수 선언
	private String empNo;
	private String empName;
	private String empPart;


	//2.매개변수 3개있는 생성자
	//상속되어지면(부모클래스명) 자식 클래스의 생성자로부터 매개변수 전달받아 초기화.
	public Employee(String empNo, String empName, String empPart) {
		this.empNo = empNo;
		this.empName = empName;
		this.empPart = empPart;
	}








	//3.toString
	@Override
	public String toString() {
		return "사번 : " + empNo + 
				"\n성명 : " + empName +
				"\n부서 : " + empPart;
	}



}
