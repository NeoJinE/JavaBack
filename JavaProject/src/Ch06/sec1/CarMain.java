package Ch06.sec1;

public class CarMain {
	//프로그램의 시작(main이 있으므로 실행되는 파일)
	public static void main(String[]args){
		//사용자정의 클래스 Car 참조변수 생성하고 관련 기능 사용
		//사용할 클래스 Car는 현재 파일과 동일 폴더에 있다(import하지 않아도 된다)
		
		Car mycar; //mycar라는 car클래스의 객체참조변수 선언
		mycar = new Car(); //그리고 생성
		
		//mycar의 권한에 따라 Car클래스 복사영역의 멤버 변수 사용.
		//
		//mycar.carNo = "111거1111"; //carNo는 public이므로 직접 접근 저장
		//System.out.println(mycar.carNo); //public 이므로 직접 접근 출력
		
		//Car 클래스의 메서드 setCarInfo()호출해서 정해진 값이 멤버변수에 저장되도록 코드
		mycar.setCarInfo();
		
		//Car 클래스의 메서드 showCarInfo()를 호출해서 저장된 private변수에 저장된 값을 확인 및 출력.
		mycar.showCarInfo();
	}	
}
