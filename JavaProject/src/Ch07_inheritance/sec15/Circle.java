package Ch07_inheritance.sec15;

public class Circle extends DrawingObject {
	public Circle() {
		pencolor = "blue";
	}
	
	@Override
	public void draw() {
		System.out.println(pencolor + "색상으로 원 그리기.");
	}
	
	
}
