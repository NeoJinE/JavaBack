package Ch07_inheritance.sec11;

public class Dog extends Animal { //자식클래스
	
	@Override
	public void show() {
		System.out.println("강아지입니다.");
	}	
	public void sound() {
		System.out.println("멍멍");
	}
	
}
