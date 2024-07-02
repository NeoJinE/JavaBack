package ch08_interface.sec03;

public interface IRemoteControl {
	
	//1. 상수 필드 선언: public static final 이 컴파일과정에서 자동으로 붙음.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//2. 3개의 추상메서드
	//반환 데이터타입 & 메서드명 & 매개변수 => 필수선언. (컴파일 과정에서 자동으로 public abstract붙음)
	//반드시 하위클래스에서 오버라이딩 해야한다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메서드 선언
	//디폴트 메서드: 실행블록{}이 있는 메서드
	//default 붙여야한다. (접근제한자가 아닌, 메서드의 유형)
	//기본적으로 public 접근 제한.
	//오버라이딩은 구현하는 하위클래스에서 선택.
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	//static(정적메서드) : 반드시 body{} 구현해야한다.
	//실행 블럭이 있는 메서드
	//인터페이스명으로 접근 가능, 공용 메서드
	public static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
	
}
