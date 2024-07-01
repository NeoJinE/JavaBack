package Ch06_2.sec_17;

public class Calculator {
	//static 필드 선언 및 초기화
	static double pi = 3.141592;
	
	//인스턴스 멤버 필드
	int a ;
	
	//static 메서드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	static void show() { //static메서드에서는 static필드만 사용가능.
		//a = 10;	//a는 일반 멤버필드이기때문에 사용시 에러(a는 사용불가)
		//sum() 		//메서드 static메서드만 호출가능.
	}
	//인스턴스 메서드
	public void sum() {
		System.out.println(plus(10, 20)); //인스턴스 메서드 내에서 static메서드 호출 가능.
	}
	
	//결론=> static 내에서는    			멤버변수&일반메서드 불가능
		//=>일반(인스턴스) 메서드내에서는	static메서드 호출 가능
	
	
	
	
	
	
	
	
	
	
	
	
}
