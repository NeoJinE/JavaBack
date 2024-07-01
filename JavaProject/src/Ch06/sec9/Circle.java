package Ch06.sec9;

public class Circle {

	//1. 멤버필드=> 반지름 저장.
	private int Radius;
	
	//2. 멤버메서드 (필드에 값을 저장)
	public void setCircle(int r) { // 매개변수 정수형 인수 r을 선언.
		Radius = r; // private 설정이 되어있어, 직접저장이 불가, 메서드 통해 간접저장
	}
	
	//3. 멤버메서등(필드의 값을 추출해서 원의 넓이를 계산하는 연산)
	public float getArea() {
		return Radius * Radius * 3.14f;
	}	
}

