package Ch07_inheritance.sec11;

public class Cat extends Animal {	//Animal Class 상속
	//재정의
	@Override 
	public void show() {
		System.out.println("고양이입니다.");
		
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	
}
