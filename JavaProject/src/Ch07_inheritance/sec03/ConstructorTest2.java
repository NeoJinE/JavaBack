package Ch07_inheritance.sec03;
class A_1 {
	//기본생성자
	public A_1() {
		System.out.println("기본 생성자 A");
	}
	
	public A_1(int x) {
		System.out.println("매개변수 생성자 A: " + x);
	}

}

class B_1 extends A_1{
	//기본 생성자
	public B_1() { 
		System.out.println("기본 생성자 B");
	}
	public B_1(int x) { //2.상속 받았으므로, 부모클래스 생성자 호출, 부모클래스 생성자 호출이 없으므로, 기본 생성자 호출
					//5.복귀해서 실행	
		System.out.println("매개변수 생성자 B: " + x);
	}
		
}
public class ConstructorTest2 {

	public static void main(String[] args) {
		//
		B_1 b = new B_1(5); //1. B클래스의 매개변수 1개 있는 생성자 호출
					//6.생성자 실행 완료후, 인스턴스 주소 반환, 저장.	
		
	}
	
}
