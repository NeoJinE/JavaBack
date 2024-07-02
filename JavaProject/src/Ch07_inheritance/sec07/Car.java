package Ch07_inheritance.sec07;

public class Car {
	
		//1.멤버변수 선언
	private int carYear;
	private String carNo,carName,carMaker;
	
		//2.생성자 초기화
	public Car (String carNo,String carName, String carMaker, int carYear) {
		this.carNo = carNo;
		this.carName = carName;
		 this.carMaker = carMaker;
		this.carYear = carYear;
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
