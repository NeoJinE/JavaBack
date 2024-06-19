package ch02;

public class Ch02_04_Final {

	public static void main(String[] args) {
		//상수 선언 및 사용
		//상수 선언:final 예약어 사용. final 데이터타입 상수명
		final double PI = 3.14;
		double radius = 10; //double형 변수 radius 선언 및 초기화.
		double circleArea = 0; //변수 선언.
		
		circleArea = PI * radius * radius;
		System.out.println("원의면적: " + circleArea);
		
		//값을 변경
		//PI = PI * 10;	상수값 변경 코드 => 상수는 초기화 코드 이외에서는 대입연산자를 사용불가.(값을 변경하지 말 것)
		//The final local variable PI cannot be assigned.
		radius = radius + 10;	//변수값 변경 코드 => 변수는 값 변경 가능.
	}

}
