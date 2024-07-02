package Ch07_inheritance.sec13;

public class ChildMain {

	public static void main(String[] args) {
		// 자식클래스 인스턴스
		Child child = new Child();
		
		//부모클래스 타입 참조변수에 자식 클래스 객체 대입
		Parent parent = child; //자식클래스 참조변수가 > 부모 자동 형변환.
		
		//Parent 참조변수는 child 객체를 참조하지만, 
		//Parent 클래스의 멤버만 사용 가능하다. 
		
		
		parent.method1(); //Parent 메서드 사용가능 
		//parent.method3(); //Child 일반 메서드 사용 불가능
		
		parent.method2(); //Parent 클래스 메서드지만
						  //Child에서 재정의 되었다.	
						  //Child에서 재정의된 메서드가 호출된다.
		
		//부모 클래스로 자동 형변환이 일어나면 자식 클래스 객체를 참조해도 
		//부모 클래스 멤버만 사용하는 것이 원칙이다.
		//단, 예외로 자식클래스에서 부모클래스 메서드 재정의한 경우 자식클래스 메서드를 호출해줌.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
