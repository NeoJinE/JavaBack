package Ch07_inheritance.sec02_1;

import java.util.Scanner;

//상속 => 코드의 재사용이 효율적이다.
//학생은 사람이다 => 사람이 갖고있는 정보가 학생에게 상속이 되어, 학생도 사람의 정보를 갖게한다.
//사람이 갖는 이름과 주민번호를 학생도 갖고 있어야 한다.
//학생은 학번을 갖고 있어야 한다.
public class Person {
	//일반적인 필드: 이름과 주민번호를 갖고있다.
	//데이터는 private를 선언하는것이 일반적이다.
	
	Scanner sc = new Scanner(System.in);
	//1.멤버변수선언
	private String Name,Ssn;
	 
	//2.(멤버메서드)생성자 선언
	//멈베필드에 data를 저장하는 역할
	public void setPerson(String name, String Ssn) {
		System.out.println("이름: ");
		this.Name = sc.next();
		System.out.println("주민번호: ");
		this.Ssn = sc.next();
	}

	//3.toString 작성
	@Override
	public String toString() {
		return "이름"+Name+
			   "\n주민번호"+ Ssn;
	}
}