package ch08_interface.sec01;

public class PhoneMain {

	public static void main(String[] args) {
		// 인터페이스 참조변수 = new 클래스()
		// 인터페이스 참조변수 = 클래스 인스턴스객체 

		ISmartPhone isp = new SamsungPhone(); // isp 참조변수는 SamsungPhone 클래스 메서드 사용
		isp.sendCall();
		isp.receiveCall();
		
		isp = new iPhone();
		isp.sendCall();
		isp.receiveCall();
		
		//인터페이스 참조변수 통한 iPhone 일반 메서드 호출
		//인터페이스 참조변수로 접근할 수 있는 메서드는 인터페이스에 선언된 추상메서드를 재구현해 놓은것만 접근할 수 있다.
		//isp.testiphone();
		
		//인터페이스 인스턴스포함 모든 객체 생성 불가
		//구현 클래스에서 상속개념이 아니므로, 인터페이스 생성자 호출이 없다.
		//ISmartPhone itp = new ISmartPhone();
			
		//인터페이스를 구현한 클래스 자체 인스턴스 생성해서 메서드 사용할 수 있다.
		SamsungPhone spt = new SamsungPhone();
		spt.sendCall();
		spt.receiveCall();
		
		iPhone ipt = new iPhone();
		ipt.sendSMS();
		ipt.receiveSMS();
		ipt.testiphone();
	}
		//단 프로젝트를 진행한다고 하면, 인터페이스를 사요하면 스마트폰이 갖고 있어야 하는 기본 기능을 전달해서
		//이 기능은 각 폰이 갖고 있어야 하는 기능이라는 것을 알릴 수 있음
		//
	
	
	
	
	
	
	
}