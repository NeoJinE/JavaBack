package Ch06_2.sec_18;

public class Share {

	//<멤버필드 영역>
	
	//인스턴스 필드 : 인스턴스마다 값이 다르다
	int a; 
	
	//static 필드: 모든 객체가 공유
	static int staticA;
	
	//<메서드 영역>
	
	//인스턴스 메서드1
	public void set(int n) {
		a+=n;
		staticA +=n; //일반 인스턴스 메서드 내에서 static 멤버 사용가능
	}
	
	//인스턴스 메서드2
	public int showA() {
		return a;
	}
	
	//static 메서드1
	public static int showStaticA() {
		return staticA;
	}
	
	
	
	
	
}
