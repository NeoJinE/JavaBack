package Ch07_inheritance.sec10;

public class AirPlaneMain {
	public static void main(String[] args) {
		//객체 생성
		SuperAirPlane air = new SuperAirPlane();
		
		air.takeoff(); //부모 클래스 메서드 호출
		air.fly(); //fly메서드가 재정의 되었으므로 자식 클래스 메서드 호출, 단 flyMode 변수값이 NORMAL이므로
				   //결국 super.fly() 호출=> 최종적으로 부모클래스 fly() 호출
		air.flyMode = SuperAirPlane.SUPERSONIC;
		air.fly(); //재정의된 fly() if문 코드가 실행된다.
		
		air.flyMode = SuperAirPlane.NORMAL;//fly메서드가 재정의 되었으므로 자식 클래스 메서드 호출, 단 flyMode 변수값이 NORMAL이므로
		air.fly();//결국 fly() 호출=> 최종적으로 부모클래스 fly() 호출
		
		air.land();
		
		//메서드 재정의 후에 부모 메서드 사용하려고 하면 super 레퍼런스 사용
		
		
		
		
		
	}
}
