package Ch07_inheritance.sec15;

public class Rect extends DrawingObject{

	public Rect() {
		pencolor = "green";
	}
	
	@Override
	public void draw() {
		System.out.println(pencolor+ "색으로 사각형 그리기");
	}
	
}
