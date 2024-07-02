package Ch06_class_sec26.info;

public class AppInfo {

	//1.멤버변수 선언
	private String appName,appMaker,appContent;
	
	//2.생성자 내에서 초기화(매개변수 없음)
	public AppInfo() {
		this.appName = "★★게임";
		this.appMaker = "홍길동";
		this.appContent = "가위바위보 & 숫자알아맞히기 게임";
	}
	
	//3.앱 정보 출력
	public void showAppInfo() {
		System.out.println("**************************************\n애플리케이션정보");
		System.out.printf("제목:%s\n제작자:%s\n내용:%s\n",appName,appMaker,appContent);															
		System.out.println();
	}
}
