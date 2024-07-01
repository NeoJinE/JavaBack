package Ch06_2.sec_18;

public class ShareMain {

	public static void main(String[] args) {
		// static 멤버 이용.
		
		//기본생성자 자동 생성되면서 호출. => 생성자 코드는 보이지 않는다.
		Share s1 = new Share();
		Share s2 = new Share();
		
		//share의 set 인스턴스메서드는 인스턴스멤버 a 값도 증가, static멤버 staticA 값도 증가.
		s1.set(5);
		System.out.println("s1의 a: " + s1.showA()); //5
		System.out.println("staticA: " + Share.showStaticA());//5
		
		s2.set(100);
		System.out.println("s2의 a: " + s2.showA());//100
		System.out.println("staticA: " + Share.showStaticA());//105(5+100)
		
		//인스턴스 멤버 메서드 내에서 static필드값을 변경 시키고 있으므로, 
		//인스턴스마다 따로 계산되지 않고, 누적연산이 된다. 
		
		
		
		
		
		

	}

}
