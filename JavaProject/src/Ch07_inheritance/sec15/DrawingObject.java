package Ch07_inheritance.sec15;

public abstract class DrawingObject {//추상클래스는 무조건 상속되어져서 자식클래스에서 추상메서드 재정의 해야 함.

	public String pencolor; // public 이므로 상속받은 클래스에서 사용가능
	
	public DrawingObject() {
		pencolor = "white";
	}
	
	//추상메서드 선언: 선언만 되어있고, body{}를 구현하지 않은 메서드
	//상속받은 클래스에서 반드시 재정의 해야 한다.
	public abstract void draw();
	
	
	
	
	
	
	
	
}
