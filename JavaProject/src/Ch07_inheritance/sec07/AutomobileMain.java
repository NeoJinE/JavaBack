package Ch07_inheritance.sec07;

public class AutomobileMain {

	public static void main(String[] args) {
	

		//1.클래스 호출(자식클래스) (St,St,St,In,St)
		Automobile au = new Automobile("01가1234", "아반떼", "현대", 2023, "자동");
		
		//2.메서드 호출
		System.out.println(au);		
	}

}
