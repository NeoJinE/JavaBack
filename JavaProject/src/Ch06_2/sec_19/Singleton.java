package Ch06_2.sec_19;

public class Singleton {
	
	
	//static 영역
	//클래스 내에서 클래스 자신의 타입으로 객체 인스턴스를 생성. => 단, 공용사용하도록.
	private static Singleton st = new Singleton();
	
	
	//생성자 영역에서 
	//현재 클래스 인스턴스가 여러개 만들어지지 않게(한개는 만들고) (생성자 접근 제한)
	
	//private(접근제한자) 선언으로 인해, 어떤 외부에서도 사용이 불가능하다.
	private Singleton() { }
	
	//외부에서 호출해서 객체를 받아서, 만들어진 객체를 사용만 할 수 있게끔 메서드를 정의.
	//외부에서 객체(instance)만들지 않고, 호출해야 함으로, static 정의.
	//Singleton 클래스 인스턴스를 반환 함으로, 반환형이 Singleton타입이 된다.
	public static Singleton getInstance() {
		return st;
	}
	
	public void show() { //Singleton 클래스 인스턴스로 호출해야되는 메서드.
		System.out.println("싱글톤 클래스: ");
	}
	
	
	
	
}
