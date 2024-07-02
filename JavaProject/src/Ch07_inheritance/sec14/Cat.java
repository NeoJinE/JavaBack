package Ch07_inheritance.sec14;

public class Cat extends Animal { //자식클래스1
	// 재정의
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("고양이 입니다.");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	//Dog클래스의 인스턴스 메서드
		public void catMethod() {
			System.out.println("catMethod() 입니다");
		}
}
