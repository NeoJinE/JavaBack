package Ch07_inheritance.sec01;

public class Child extends Parent {//상속을 받았으므로, 파생클래스,자식클래스
	private int c;
	
	public void setChild() {
		c=20;
	}
	
	public void showChild() {
		showParent(); // 상속받은 부모 클래스 메서드를 바로 사용이 가능하다.
		System.out.println("자식클래스 c: " + c);
	}
	
	
	
	
}
