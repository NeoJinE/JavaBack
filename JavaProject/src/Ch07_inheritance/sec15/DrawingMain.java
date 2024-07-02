package Ch07_inheritance.sec15;

public class DrawingMain {

	public static void main(String[] args) {
		
		Line line = new Line(); //DrawingObject를 상속 받았으므로 생성자메서드 호출하면, DrawingObject 생성자 호출된다.
		line.draw();			//DrawingObject명시적 생성자가 없으므로 기본 생성자 호출.
		
		
		Circle circle = new Circle();
		circle.draw();
		
		Rect rect = new Rect();
		rect.draw();
		
		//추상클래스인 DrawingObject 객체 인스턴스 생성은 불가능하다.
		//DrawingObject dObject = new DrawingObject();
		

	}

}
