package ch08_interface.sec03;

public class Audio implements IRemoteControl{
	//멤버필드
	private int volume;
	private boolean mute;
	
	//필수로 재정의 해야하는 추상메서드
	@Override
	public void turnOn(){
		System.out.println("Audio를 켭니다");
	}
		
	@Override
	public void turnOff(){
		System.out.println("Audio를 끕니다");
	}
	
	
	
	@Override
	public void setVolume(int volume){
		//인터페이스 상수필드 활용해서 최대/최소 볼륨 체크 후 설정.
		if(volume> IRemoteControl.MAX_VOLUME) {
			this.volume = IRemoteControl.MAX_VOLUME;
		}else if(volume<IRemoteControl.MIN_VOLUME){
			this.volume = IRemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	//----------------------------------------------
	//디폴트 메서드 재정의(선택)
	//디폴트 메서드 재정의 할 떄 default 키워드 적지않다.
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(this.mute) {
			System.out.println("Audio 무음처리");
		}else {
			System.out.println("Audio 무음해제");
		}
	}
	
	//static final 필드, static 메서드는 재정의 하고는 상관없음. => 컴파일러가 알아서 처리함.
	
}

