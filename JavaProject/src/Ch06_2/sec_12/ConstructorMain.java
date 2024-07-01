package Ch06_2.sec_12;

public class ConstructorMain {

	public static void main(String[] args) {
		// Constructor 클래스 객체 인스턴스 생성
		//인스턴스 생성 시 생성자 메서드는 호출(보통 명시적 코드로 호출)
		//클래스 생성자 메서드에 의해서, 멤버필드에 값이 저장된다.(코드를 생성해놨음)
		
		//new 연산자를 통해, 생성자메서드를 호출.
		Constructor c = new Constructor(); //필드 x의 초기값을 클래스에서 결정.
		//new 연상 실행과 함께 생성자메서드 호출
		Constructor c1 = new Constructor(30); 		 //생성자 매개변수 타입이 int인 생성자 호출
		Constructor c2 = new Constructor((short)50); //생성자 매개변수 타입이 short인 생성자 호출
		Constructor c3 = new Constructor(10,10);		 //생성자 매개변수가 정수형으로 2개 있는 생성자 호출
		Constructor c4 = new Constructor((short)5,(short)5);
		
		
		
		
		//일반 메서드 호출: showX 호출 => x멤버필드 값을 출력
		/*c.showX(); c.showY();  //클래스에서 결정한 값으로 x,y 멤버필드 초기화.
		c1.showX(); c1.showY(); //y멤버필드를 전달되는 인수로 초기화. => x는 클래스 내부 값으로 초기화
		c2.showX(); c2.showY(); //x멤버필드를 전달되는 인수로 초기화. => y는 클래스 내부 값으로 초기화
		c3.showX(); c3.showY(); //x,y멤버필드를 전달되는 인수로 초기화.
		*/c4.showX(); c4.showY(); // c4 인스턴스 생성하면서, 5,5 두개의 인수를 넘김 => 출력시, x,y에 반영되지 않았음.
		//=>c4 인스턴스가 사용한 생성자메서드가 필드x,y가 아닌 메서드 지역변수 x,y에 저장을 했기 때문에 필드에는 영향이 없었음.
		

	}

}
