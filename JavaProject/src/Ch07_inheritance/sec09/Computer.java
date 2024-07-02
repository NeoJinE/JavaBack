package Ch07_inheritance.sec09;
//Computer는 계산기에 포함된다.
public class Computer extends Calculator { 
	
	//부모클래스 메서드 areaCircle을 재정의(오버라이딩)
	//@Override //부모클래스인 Calculator의 areaCircle 메서드의 선언부를 체크해줌.
	//부모클래스 메서드와 선언부가 완전 동일한지.
	//public double areaCircle(double r){
	//} return을 구성하지 않아서 오류
	//@Override
	/*public int areaCircle(double r) {//@Override 어노테이션에 의해 부모클래스 메서드의 선언부분이 일치하는지 검서, 반환타입이 달라서 오류발생
		
	}
	*/
	
	/*// 일반 멤버 변수
	public int areaCircle(double r) {//@Override 어노테이션에 의해 부모클래스 메서드의 선언부분이 일치하는지 검서, 반환타입이 달라서 오류발생
		
	}*/
	
	@Override//(재정의시, public으로 재정의: default 이기에,=> 재정의시(default,public)
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
		//정밀한 계산을 위해 Math.PI 상수사용
	}
}
