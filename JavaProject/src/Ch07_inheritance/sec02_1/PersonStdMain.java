package Ch07_inheritance.sec02_1;

public class PersonStdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.클래스 선언(객체 인스턴스 생성)
		Student st = new Student();
		
		//2.Student메서드 호출 & 출력
		st.setStudent("홍길동", "1234-5678", "s1234");
		System.out.println(st);
		
		//st는 Student 클래스와 Person 클래스 모두 갖고 있는 인스턴스
		//st 생성자 함수 호출: 1.Student(), 2.부모 클래스인 Person클래서 생성자 함수도 호출
		//두 클래스 모두 명시적 생성자 함수는 없으므로, 기본 생성자 함수가 호출된다.
		//호출 순서=> 1.Student()호출되지만, 실행하기전에 2.Person()가 호출된다.
		//실행순서=> 1.Person() 실행되고, 2. Student()가 실행된다.
		
		//3.Person메서드 호출 & 출력
		Person ps = new Person();
		
		ps.setPerson("김철수", "6789-0123");
		System.out.println(ps);
		
		
		
		
		
	}

}