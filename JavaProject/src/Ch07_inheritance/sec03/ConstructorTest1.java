package Ch07_inheritance.sec03;
//상속에서의 생성자 호출
//기본 생성자 함수 자동 호출 예제
class A {
	//기본생성자
	public A() {
		System.out.println("기본 생성자 A");//3.기본 생성자가 호출 //4.더이상 상속받지 않았으므로 실행
	}
}

class B extends A{
	//기본 생성자
	public B() { //2. 상속받았으므로, 부모클래스 생성자 호출 : 명시적 호출이 없음. //5.복귀 후 실행
		System.out.println("기본 생성자 B");
	}
}
public class ConstructorTest1 {

	public static void main(String[] args) {
		// 생성자 실행
		
		B b = new B(); //1.기본 생성자 함수 호출 //6. 완성된 인스턴스 주소가 b변수에 저장.
		
		

	}

}
