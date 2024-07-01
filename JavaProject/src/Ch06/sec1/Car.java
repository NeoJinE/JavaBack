package Ch06.sec1;

public class Car {//main 메서드가 없다 => 프로그램이 실행되 않는 클래스.
	//- Car 클래스
	/*	- Car에 대한 정보를 저장하고, (**멤버변수**)
		- 차량번호, 차종, 제조사, 연식, 배기량: 변수.
		- Car의 정보를 출력하는 기능(**멤버 메서드**) 클래스 생성.*/
	
	//멤버 변수 선언
	//멤버 변수는 클래스 내부에서 만들어지는 변수이기 때문에,
	//=> 접근권한이라는 개념이 있다.
	// public => 누구나 해당 클래스를 이용해서 참조변수 생성시 사용가능하다. 
	// private => 현재 클래스 내부영역에서만{} 사용 가능. => CarMain클래스의 main()에서 사용불가능.
	//
	
	
	/*public String carNo; //차량번호
	public String carName;//차종
	public String carMaker;//제조회사
	public int carYear;//연식
	public int carCC;//배기량
	*/
	
	private String carNo; //차량번호
	private String carName;//차종
	private String carMaker;//제조회사
	private int carYear;//연식
	private int carCC;//배기량
	
	//멤버 메서드: 작업/일/기능.
	//멤버 메서드 역시 접근권한이 필요하다.(public & private)
	//private 변수에 데이터를 저장하는 메서드.: 값이 저장되는 시점 메서드를 호출했을시, 값이 저장되도록
	//멤버 메서드 : 반환되는값의 타입 메서드명 (){}

	//1.메서드 호출시 정해진 데이터가 private 멤버변수에 저장되는 메서드, void(저장만 하는 메서드=>반환값x)
	public void setCarInfo(){ 
		carNo = "11가1234";
		carName = "아반떼";
		carMaker = "현대";
		carYear = 2022;
		carCC = 1600;
	}
	

	//2.private 멤버 변수의 값을 출력하는 메서드, 출력하고 종료되므로, 반환값이 없음.(void),main 메서드에서 호출 가능해야 한다.
	
	public void showCarInfo(){
		System.out.println("차량번호: " + carNo);
		System.out.println("차종: " + carName);
		System.out.println("제조회사: " + carMaker);
		System.out.println("연식: " + carYear);
		System.out.println("배기량: " + carCC);
		
		
		
		
		
	}
}