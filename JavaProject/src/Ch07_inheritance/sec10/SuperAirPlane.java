package Ch07_inheritance.sec10;

public class SuperAirPlane extends AirPlane { //부모클래스
	
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) { //자식 클래스에서 재정의된 출력
			System.out.println("초음속 비행입니다");
		}else {//부모클래스 객체의 fly()메서드를 호출한다(super 사용).
			super.fly();
		}
		
	}
}