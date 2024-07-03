package ch09_generic_collection.sec03;

//제네릭 클래스: 필드의 타입이 결정되지 않았음. => 인스턴스 생성시 결정이 된다.
public class Product<T,M> {
	private T kind;
	private M model;
	
	//멤버필드 Kind에 저장된 값을 반환하는 메서드
	public T getKind() {
		return kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	//멤버필드 model에 저장된 값을 반환
	public M getModel() { 
		return model;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
	
}
