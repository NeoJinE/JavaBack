package Ch06.sec7;

public class Tv {

	//1.멤버변수선언 : 접근제한 default
		String color; //Tv색상
		boolean power; //Tv 인스턴스 전원 on/off/여부
		int channel; //Tv색상 인스턴스의 현재 시청 채널
	
	//2.멤버메서드
		void power () {
		power = !power; //현재 파워의 반대값을 default로 설정.
		}
		void channelUp() {
			++channel;
		}
		void channelDown() {
			--channel;
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
