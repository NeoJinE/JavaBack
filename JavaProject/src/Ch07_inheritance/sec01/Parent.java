package Ch07_inheritance.sec01;

public class Parent { //상속해줄 클래스, 기반클래스, 슈퍼클래스, 부모클래스
		
	private int p;
	
	public void setParent() {
		p=10;
	}
	
	public void showParent() {
		System.out.println("부모클래스 p: " + p);
	}
}
