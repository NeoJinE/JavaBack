package Ch07_inheritance.sec08;

public class PartTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //1.클래스 호출
		 PartTime p = new PartTime("990101-1034567", "홍길동", 10000, 60, 600000);
		 
		//2.출력문
		 System.out.println(p);
		
		 //PartTime 클래스 객체 인스턴스가 문자열이 필요한 함수 내에서 사용
		 //객체 인스턴스는 toString()을 자동 호출
		 
		 //---------------------------------------------------------
		 //다형성: 상속관계인 클래스들 사이에서 서로다른 타입을 참조하는 것
		 //부모참조변수 = 자식인스턴스 : 자식 인스턴스 객체가 부모 객체로 자동 형변환
		 //(자식클래스타입) 부모참조변수 : 강제 형변환 => 상속관계여야 하고, 부모참조변수에 자식 클래스타입이 자동 형변환 된 경우
		 
		 Worker wt =  new p; //Worker 타입 참조변수에 PartTime 인스턴스를 저장, 부모타입으로 pt가 자동형변환이 이루어진다.
		 //wt는 Worker 타입의 참조변수. => 멤버는 Worker 클래스 멤버만 사용 가능하다.
		 wt.CalculatePay(); //
		 wt.workingSet(); //Worker method 인데 상속받은 PartTime에서 재정의 진행했음 => PartTime 메서드 호출.
		 
		 
	}

}
