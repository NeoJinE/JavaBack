package Ch07_inheritance.sec09;

public class Calculator {//부모클래스

	
	
		//메서드 작성(default 접근제한)
	 double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return r * r * 3.14159;
	}
}
