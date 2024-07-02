package ch08_interface.sec01;
//interface: 객체 생성 불가(생성자메서드 불가), 일반 인스턴스 필드 불가, 일반 인스턴스 멤버 메서드 불가
//추상메서드가 기본으로 추가된다.
public interface ISmartPhone {
	//추상메서드 (구현은 불가, 선언만 존재하는 메서드, body가 없다)
	//구현 클래스에서 반드시 구현해야하는 메서드의 규격(접근제한, 변환데이터타입, 이름, 매개변수)을 설정하는데 목적이 있다.
	public void sendCall();
	public void receiveCall();
	public void sendSMS();
	public void receiveSMS();
}
