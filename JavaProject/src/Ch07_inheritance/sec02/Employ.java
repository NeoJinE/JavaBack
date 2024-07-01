package Ch07_inheritance.sec02;

import java.util.Scanner;

public class Employ { //직원정보를 저장하고 출력하는 클래스.
	//sc는 default 멤버필드 => 동일패키지 클래스가 상속받으면 상속이 이루어진다.
	Scanner sc = new Scanner(System.in);
	//1.모든 직원에 해당되는 일반정보를 담을 멤버변수 선언
	//private으로 생성 => 상속을 받지 않는다.
	private String empNo;
	private String empName;
	private String empPart;
	
	//2.직원정보에 대한 생성자 선언
	public void setEmployee() {
		
		System.out.println("사번 입력: ");
		this.empNo = sc.next();
		System.out.println("성명 입력: ");
		this.empName = sc.next();
		System.out.println("부서 입력: ");
		this.empPart = sc.next();
		
	}
	//3.직원정보 출력메서드 선언
	public void showEmpInfo() {
		System.out.println("---------------------------");
		System.out.println("사번: " + empNo);
		System.out.println("이름: " + empName);
		System.out.println("부서: " + empPart);
		
	}
}
