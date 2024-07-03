package ch09_generic_collection.sec02;

public class GenericMain {

	public static void main(String[] args) {
		//제네릭 클래스는 인스턴스 생성시 구체적 타입을 지정한다.
		Box <String,Integer>box1 = new Box<String,Integer>();//미루어둔 T 타입이 String으로 결정이 된다.
		box1.setGenT("hello"); //문자열 hello가 문자열 멤버필드 genT에 저장이 된다.
		String str = box1.getGenT(); //강제 형변환 필요없다.
		System.out.println(str);
		
		Box <Integer,Integer> box2 = new Box<Integer,Integer>();
		box2.setGenT(7);
		int value = box2.getGenT();
		System.out.println(value);	
	}
}
