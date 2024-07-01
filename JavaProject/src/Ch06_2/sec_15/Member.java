package Ch06_2.sec_15;

import java.util.Scanner;

public class Member {
	Scanner sc = new Scanner(System.in);
	//1.멤버변수선언
	String Name;
	String Gender;
	int Age;
	int Birth;
	
	//2.매개변수 생성자 초기화
	public Member(String Name,String Gender,int Age,int Birth) {
		this.Name = Name;
		this.Gender = Gender;
		this.Age = Age;
		this.Birth = Birth;
		
	}

	public void infoMember(Scanner sc) {
		
		System.out.println("이름: ");
		this.Name = sc.next();
		System.out.println("성별: ");
		this.Gender = sc.next();
		System.out.println("나이: ");
		this.Age = sc.nextInt();
		System.out.println("생년월일: ");
		this.Birth = sc.nextInt();
	}

	
	//3.메서드 작성(출력문)
	public void showMember() {
		System.out.println("\n****입력정보****");
		System.out.println("이름: " + Name);
		System.out.println("성별: " + Gender);
		System.out.println("나이: " + Age);
		System.out.println("생년월일: " + Birth);
	}
}
