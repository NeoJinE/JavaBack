package Ch06_2.sec_20;

public class PersonMain {

	public static void main(String[] args) {
		//객체 생성 및 초기화
		//Person객체 생성 및 초기화
		
		//Person 클래스는 매개변수가 있는 생성자 정의
		//인스턴스 생성시 인수를 반드시 전달해야한다.
		Person p1 = new Person("1234-5678", "홍길동");
		Person p2 = new Person("5678-0123", "김철수");
		
		//final static 출력: static 상수 => 클래스명.필드(상수)명
		System.out.println(Person.Nation_To);
		
		//인스턴스 상수 출력: 인스턴스.상수명
		System.out.println(p1.Nation);
		System.out.println(p1.ssn);
		
		//일반 멤버 필드 출력
		System.out.println(p1.Name);
		System.out.println("------------------------------");
		
		//final static 출력: static 상수 => 클래스명.필드(상수)명
		System.out.println(Person.Nation_To);
		
		//인스턴스 상수 출력: 인스턴스.상수명
		System.out.println(p2.Nation);
		System.out.println(p2.ssn);
		
		//일반 멤버 필드 출력
		System.out.println(p2.Name);
		System.out.println("------------------------------");

		//final 필드 저장불가 오류 발생.(변경불가)
		//p1.Nation = "미국";
		
		//생성자 통해서 초기화 한 경우에도 상수로 구성되었으므로 변경 불가능
		//p2.ssn = "1111";
		
	}
}
