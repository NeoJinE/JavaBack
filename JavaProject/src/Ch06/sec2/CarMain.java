package Ch06.sec2;

public class CarMain {

	public static void main(String[] args) {
		// 동일 패키지 내 Car class 객체 인스턴스 생성하고 사용.
		//인스턴스는 여러개 생성할 수 있고, 각각 독립적 객체 영역을 할당 받는다.
		Car c1 = new Car(); //객체타입 변수명 = new 클래스생성자함수.
		//양식=> (class명)(변수명) = (new 클래스생성자함수) => 클래스 인스턴스 생성.
		Car c2 = new Car();
		Car c3 = new Car(); //c1, c2, c3 각각 동일한 변수 동일한 메서드를 갖는 각각의 영역을 갖는다.
		
		//인스턴스별 작업(멤버변수의 저장)
		c1.carNo = "11가1234";
		c2.carNo = "22가5678";
		c3.carNo = "33가1111";
		
		//인스턴스별 기능 사용 : Car 클래스의 인스턴스가 사용할 수 있는 기능 =>showCarInfo()만 있다
		c1.showCarInfo();
		c2.showCarInfo();
		c3.showCarInfo();
		
		
		
		
		
		
		
		
		
	}

}
