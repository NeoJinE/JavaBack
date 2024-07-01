package Ch06_2.sec_12;

public class Constructor {
	private int x;
	private int y;
	
	//======================================
	//생성자 메서드: 객체 생성될 때 한번 호출되는 메서드, 생성될 때 제외, 절대 호출이 불가능하다.
	//클래스와 이름이 동일하고, 반환형이 없다.
	//역할: 필드 값 초기화
	
	//개발자가 추가한 명시적 생성자: 개발자가 추가하지 않으면, JVM이 자동으로 추가해준다.(코드 안보임)
	public Constructor () {
		x = 100;
		y = 100;
	}
	
	//생성자 메서드 오버로딩 => 매개변수의 유무로 차이가 있어야 한다(아예 똑같으면 오류발생)
	public Constructor (int tmpY) { //매개변수가 있는 생성자 함수
		x = 100;
	    y= tmpY; //인스턴스 생성시 전달되는 인수를 y필드에 저장.
	}
	
	//생성자 메서드 오버로딩2 => 매개변수의 타입(short tmpX) 
	public Constructor (short tmpX) {
		x = tmpX; //short 타입 이지만, 자동 형변환 발생.
		y = 100;
	}
	
	//생성자 메서드 오버로딩3 => or 갯수(int tmpX,int tmpY)가 달라야 한다.
	public Constructor (int tmpX, int tmpY) {
		x= tmpX;
		y = tmpY;
	}
	
	//생성자 메서드 오버로딩4 =>
	public Constructor(short x, short y) {
		x=x;
		//this.x = x; //매개변수로 전달된 Constructor 메서드 지역변수x의 값을 Constructor 메서드 지역변수x에 저장 
		y=y;
		//this.y = y; //매개변수로 전달된 Constructor 메서드 지역변수y의 값을 Constructor 메서드 지역변수y에 저장
		//클래스의 멤버필드 x,y 가 참조되도록, this를 레퍼런스를 사용할 수 있음
	}
	
	//======================================
	//멤버 메서드
	public void showX() {
		System.out.println("x값: " + x); //x멤버필드 값을 출력하는 메서드
	}
	
	public void showY() {
		System.out.println("y값: " + y); //x멤버필드 값을 출력하는 메서드
	}
	
	//멤버필드에 값을 저장하는 일반 메서드는 없다.
	//x 필드에는 생성자 메서드가 실행되어, x의 초기화가 실행된다.
	
	
}
