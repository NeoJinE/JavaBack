package Ch07_inheritance.sec03;
class A_2 {
	//기본생성자
	public A_2() {
		System.out.println("기본 생성자 A");
	}
	
	public A_2(int x) {//3.매개변수가 1개고, 변수타입이 int인 생성자 호출
						//4.호출된 생성자 실행
		System.out.println("매개변수 생성자 A: " + x);
	}

}

class B_2 extends A_2{
	//기본 생성자
	public B_2() { 
		System.out.println("기본 생성자 B");
	}
	public B_2(int x) { //2.상속 받았으므로, 부모클래스 생성자 호출, 명시적 부모클래스 생성자 호출하므로, 조건에 맞는 생성자 호출
					//5.복귀해서 실행	
		super(x); //부모클래스 생성자 명시적 호출(매개변수가 1개 있고 타입이 int이거나 자동형변환 가능한 생성자 호출)
		System.out.println("매개변수 생성자 B: " + x);
	}
		
}
public class ConstructorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B_2 b = new B_2(5);//1.B_2클래스의 매개변수 1개 있는 생성자 호출 6.생성자 실행 완료 후 인스턴스 주소 반환 & 저장
	}

}
