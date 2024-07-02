package Ch07_inheritance.sec14;

public class AnimalMain {

	public static void main(String[] args) {
		// (1) 다형성이 아닌 예
				Animal a = new Animal();
				a.show();
				
				Cat c = new Cat();
				c.show();
				
				Dog d = new Dog();
				d.show();		
				
				System.out.println("------------");
				// (2) 다형성 표현  : 부모 클래스 타입에 여러 자식 객체 대입
				// 하나의 타입에 여러 객체를 대입함으로써 다양한 기능 이용
				Animal ap = null; // 참조변수만 선언
				
				// 부모 Animal 타입 참조 변수에 Cat 타입 객체 대입
				ap = new Cat(); // 자동 타입 변환 발생
				ap.show(); // 오버라이딩 된 show() 호출
				ap.sound();// 오버라이딩 된 sound() 호출
				
				// 부모 Animal 타입 참조 변수에 Dog 타입 객체 대입
				ap = new Dog(); // 자동 타입 변환 발생
				ap.show();      // 오버라이딩 된 show() 호출
				ap.sound();		// 오버라이딩 된 sound() 호출
	
				//ap: Animal 타입에 Dog 타입 객체가 대입되어있는 상태.
				//Animal 타입이라서 , Animal 클래스 메서드만 사용가능하다.
				//Dog객체를 참조하지만, Dog 객체 메서드 사용가능불가
				//Animal 타입으로 자동 형변환되었으므로
				//ap.dogMethod(); // 사용불가.
				
				//ap 참조변수 이용해서 Dog 객체의 일반메서드 사용 방법.?????
				//ap에 대입된 객체가 원래는 Dog 객체지만, 자동 형변환이 발생한 것이므로, 
				
				//이때는 강제형변환이 가능하다. => (객체명)참조변수.
				d = (Dog)ap; //Dog 타입으로 강제변환.
				d.dogMethod(); //Dog 클래스의 멤버 사용 가능.
				
				//ap는 도그 타입의 참조 객체가 자동 형변환 된 상태.
				//자식 클래스라도 Cat 타입으로 강제 형변환하라고 하면 => 불가능.(실행오류가 발생한다)
				/*c = (Cat)ap; //Cat 타입으로 강제변환. => 문법적으로 부모클래스를 자식클래스로 강제변환시 문제는 없지만, 
				c.catMethod(); //Cat 클래스의 멤버 사용 
				*/				
				
				//자동타입 변환하지 않았는데 강제타입변환 할 경우
				Animal aa = new Animal();
				//Dog dd = (Dog)aa; //ClassCastException 오류 발생.
				 
				
				//aa = new Dog();
				aa = new Cat(); //Animal 타입으로 자동 형변환.
				if(aa instanceof Dog) {
					Dog ddDog = (Dog)aa;
					System.out.println("Dog 타입으로 변환 가능.");
				}else {
					System.out.println("Dog 타입으로 변환 불가.");
				}
				
				
				
				
	}

}
