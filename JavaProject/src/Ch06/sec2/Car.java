package Ch06.sec2;

public class Car {
	//동일 패키지내에서 접근 간으한 멤버필드 or 멤버변수를 생성 및 선언.
	//동일 패키지 접근 가능: default => 접근제한자를 생략
	 String carNo; //차량번호
	 String carName;//차종
	 String carMaker;//제조회사
	 int carYear;//연식
	 int carCC;//배기량
	
	//멤버 메서드: 메서드도 접근 제한자 생략하면, default의 의미임(동일 패키지내 class에서 사용 가능)
	//차량 번호만 출력
	 
	 public void showCarInfo() {
		 System.out.println("차량번호: " + carNo);
	 }
	
}
