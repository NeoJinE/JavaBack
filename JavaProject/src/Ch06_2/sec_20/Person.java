package Ch06_2.sec_20;

public class Person {
	//클래스 레벨에서의 상수 => static final
	static final int Nation_To = 82; //고정값을 통해 초기화. 프로그램 시작시, 상수로 고정.

	//인스턴스 레벨에서의 상수: final
	final String Nation = "대한민국"; // 인스턴스가 new연산자에 의해 생성되는 시점에 상수로 고정.
	
	//객체 인스턴스 생성할 때 생성자 함수 통해서 전달된 값으로 초기화.
	final String ssn;
	
	//선언과 동시에 초기화 하지 않으면, 일단 오류가 발생, 생성자 함수 통해 초기화 할 예정
	//명시적 생성자 함수에서 ssn을 다루지 않으면, 오류 발생.
	String Name;
	
	//매개변수가 있는 생성자 구성.
	public Person(String ssn,String Name) {
		//ssn 인스턴스 상수필드는 생성자 호출되서, 왼쪽 코드가 실행되는 순간, 상수로 고정되고, 인스턴스마다 다른값으로 고정된다.
		this.ssn = ssn; 
		this.Name = Name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
