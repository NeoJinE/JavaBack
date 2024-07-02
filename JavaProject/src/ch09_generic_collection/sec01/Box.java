package ch09_generic_collection.sec01;

public class Box {
	//어떤 타입의 데이터를 저장할건지 결정되지 않은 경우
	//어떤 타입이 들어오더라도 자동형변환이 일어나게 타입을 결정할 수 있다.
	//Java에서 최상위 클래스 타입인 Object 타입으로 멤버필드를 선언
	private Object obj;
	
	//멤버 메서드 : 멤버필드에 값을 저장.
	public void set(Object obj) {
		this.obj = obj;
	}
	
	//멤버필드 값을 반환하는 메서드
	public Object get() {
		return this.obj;
	}
}
