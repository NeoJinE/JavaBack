package Ch07_inheritance.sec15;

public class Line extends DrawingObject {
	//생성자함수 생성
	public Line() {
		pencolor = "red"; //부모(추상)클래스 멤버필드 초기화 진행.
	}
	
	//부모클래스 추상메서드 반드시 재정의
	@Override
	public void draw() {
		System.out.println(pencolor + "색상으로 선 그리기");
	}
}
