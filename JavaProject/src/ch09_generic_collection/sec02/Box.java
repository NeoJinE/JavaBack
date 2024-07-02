package ch09_generic_collection.sec02;

public class Box<T,E> { //제네릭 클래스로 생성, 타입결정을 뒤로 미룰 경우에는 타입자리에 T라고 써준다)
	//Object도 타입이기 때문에 형변환이 발생되므로타입을 결정하지 않는 Generic 사용
	//<T or E> 타입결정을 뒤로 (객체 인스턴스 생성시점)으로 미룬다.
	
	//1.멤버필드 타입 결정은 인스턴스 생성시에 결정이 된다.
	private T genT; 
	private E genE;
	
	public void setGenT(T genT) {
		this.genT = genT;
	}

	public T getGenT() {
		return this.genT;
	}

	






}
