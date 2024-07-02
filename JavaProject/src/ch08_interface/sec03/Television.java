package ch08_interface.sec03;

public class Television implements IRemoteControl {

	private int volume;
	
	//필수로 재정의 해야하는 추상메서드
		@Override
		public void turnOn(){
			System.out.println("TV를 켭니다");
		}
			
		@Override
		public void turnOff(){
			System.out.println("TV를 끕니다");
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
			System.out.println("현재 TV 볼륨: " + this.volume);
		}
		
}
