package Ch06_2.sec_19;

public class SingletonMain {

	public static void main(String[] args) {
		//싱글톤 패턴: 특정 클래스 인스턴스가 결론적으로 하나만 만들어지도록 프로그램하는 방법(패턴)
		//Singleton st2 = new Singleton(); //private 명시로 인해 사용불가
		
		//static으로 만들어놓은 메서드 getInstance() 호출해서 Singleton 인스턴스를 얻어온다
		Singleton ob1 = Singleton.getInstance(); //Singleton 객체 인스턴스를 반환.
		ob1.show();
		
		//두번째 객체 ob2를 선언하고, 값을 반환받아 저장.
		//ob1과 ob2 객체 참조 변수에 같은 주소가 저장되므로 두 참조변수는 같은 객체 인스턴스를 가리키게 된다.
		Singleton ob2 = Singleton.getInstance(); //Singleton 객체 인스턴스를 반환.
		ob2.show();
		
		//ob1과 ob2가 같은 인스턴스를 참조하는지 확인
		if(ob1==ob2) {
			System.out.println("같은 Singleton 객체: ");
		}else {
			System.out.println("다른 Singleton 객체: ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
