package Ch07_inheritance.sec04;

public class EmpManagerMain {
	public static void main(String[] args) {
		//자식 클래스 객체 생성
		//자식 클래스 생성자에게 필요한 모든 데이터 전달
		//부모 클래스에 필요한 것도 자식클래스 생성자에 전달
		Manager mg = new Manager("1234", " 홍길동", "마케팅", "대리");
	
		//자식객체 정보 출력
		System.out.println(mg);
	
	
	
	
	
	
	
	}
}
