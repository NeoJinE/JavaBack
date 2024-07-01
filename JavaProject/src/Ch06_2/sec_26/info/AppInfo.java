package Ch06_2.sec_26.info;

public class AppInfo {

    // 1. 멤버 변수 선언
    private String appName, appMaker, appContent;

    // 2. 생성자 내에서 초기화(매개변수 없음)
    public AppInfo() {
        this.appName = "★★게임";
        this.appMaker = "홍길동";
        this.appContent = "가위바위보게임/숫자알아맞히기 게임";
    }

    // 3. 앱 정보 출력 메소드
    public void showAppInfo() {
        System.out.println("        애플리케이션 정보       ");
        System.out.println("---------------------------");
        System.out.println("제목 : " + appName);
        System.out.println("제작자 : " + appMaker);
        System.out.println("내용 : " + appContent);
        System.out.println("***********************************");
     
    }
}
