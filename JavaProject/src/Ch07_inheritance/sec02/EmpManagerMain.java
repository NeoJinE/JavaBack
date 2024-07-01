package Ch07_inheritance.sec02;

public class EmpManagerMain {

	public static void main(String[] args) {
		// 홍길동 매니저에 대한 정보를 입력하고 출력확인
		
		//Manager 클래스 객체 생성
		Manager mgEmp = new Manager();//자식 클래스 Manager 생성자 함수 호출하면
										//자동으로 부모클래스 Employ 생성자 함수도 호출된다.
		
		//Manager에 대한 정보입력
		mgEmp.setManager();
		mgEmp.showManagerInfo();
		
		//김철수 사원에 대한 정보를 입력하고 출력확인
		//Employ 클래스 객체 생성
		Employ emp = new Employ();
		//김철수 사원 정보입력
		emp.setEmployee();
		//김철수 사원 정보출력
		emp.showEmpInfo();
		
	}

}
