package ch09_generic_collection.sec01;

public class NonGenericMain {

	public static void main(String[] args) {
		//제네릭을 사용하지 않은 Box 클래스 객체 생성 및 사용
		Box box = new Box();
		//멤버필드 obj에 값을 저장.(문자열 저장)
		box.set("홍길동");//자동 형변환 : String => Object.
		//box 인스턴스 필드에 저장된 값을 반환 받아서 문자열 변수에 저장.
		//String name = box.get(); // Object => String은 자동 형변환이 불가.
		String name = (String)box.get(); //강제형변환을 통해 큰타입 Object가 작은 String으로 형변환
		System.out.println(name);
		
		Box box2 = new Box();
		box2.set(7); //자동형변환: int => Integer객체로 자동 형변환(바인딩이 발생) =>Object
		int no = (int)box2.get(); //강제 타입변환: Object => Integer (언바인딩) => int로 형변환
		System.out.println(no);
	
	}
	//제네릭을 사용하면 형변환을 신경쓰지 않아도 된다.
}
