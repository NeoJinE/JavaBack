package Ch07_inheritance.sec14;

public class Dog extends Animal {//자식클래스2
	@Override
	public void show() {
		System.out.println("강아지 입니다");
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	//Dog클래스의 인스턴스 메서드
	public void dogMethod() {
		System.out.println("dogMethod() 입니다");
	}
}
