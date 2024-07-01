package Ch07_inheritance.sec02;

import java.util.Scanner;

public class Manager extends Employ {//매니저도 직원이기에 Employ의 정보를 상속받는다.
	//Employ 클래스의 필드는 그대로 사용
	//매니저라서 추가되는 필드 선언
	
	private String position;
	
	public void setManager() {
		//직원 공통 정보를 저장
		
		//부모 클래스 입력 메서드 먼저 호출 => 부모클래스의 멤버필드에 값을 저장.
		setEmployee();
		System.out.println("직급입력: ");
		this.position = sc.next();
	}
	
	public void showManagerInfo() {
		showEmpInfo();//부모클래스 Employee클래스 호출.
		System.out.println("직위: " + position);
	}
}
