package Ch07_inheritance.sec07;

import java.util.Scanner;

public class Car {
		Scanner sc = new Scanner(System.in);
		//1.멤버변수 선언
	private int carNo,carYear;
	private String carName,carMaker;
	
		//2.생성자 초기화
	public void setCar () {
		System.out.println("차량번호");
		this.carNo=sc.nextInt();
		System.out.println("차종");
		this.carName=sc.next();
		System.out.println("제조사");
		 this.carMaker=sc.next();
		System.out.println("연식");
		this.carYear=sc.nextInt();
	}

	
		//3.toString 출력문
		@Override
		public String toString() {
			return "차량번호: "+ carNo +
				   "\n차종: " + carName +
				   "\n제조사: " + carMaker +
				   "\n연식: " + carYear;
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
