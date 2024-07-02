package ch08_interface.sec01;

public class SamsungPhone implements ISmartPhone {
	private String name;
	
	public SamsungPhone() {
		this.name = "삼성폰";
	}
	
	
	@Override
	public void sendCall() {
		System.out.println(name+"으로 전화를 겁니다.");
	}
	
	@Override
	public void receiveCall() {
		System.out.println(name+"으로 전화를 받습니다.");
			
	}
	
	@Override
	public void sendSMS() {
		System.out.println(name+"으로 메세지를 보냅니다.");
		
	}
	
	@Override
	public void receiveSMS() {
		System.out.println(name+"으로 메세지를 받습니다.");
		
	}
}
