package Ch06_2.sec_26.start;

import java.util.Scanner;

import Ch06_2.sec_26.game.Guess;
import Ch06_2.sec_26.game.GaBaBo;
import Ch06_2.sec_26.info.AppInfo;



public class AppStart {

	public static void main(String[] args) {
			// 프로그램 시작 인사말 출력
		  System.out.println("***********************************");
	      System.out.println("   **게임에 오신 것을 환영합니다^^");
	      System.out.println("***********************************");

	      //메뉴를 입력받아 저장 사용할 변수
	      int Num;
	      //입력위한 스캐너 참조변수  
	      Scanner sc = new Scanner(System.in);
	    
	      //메뉴: 정보출력, 가위바위보게임, 숫자맞추기, 종료
	      //메뉴 번호를 입력받아 번호에 따라 동작(switch문)
	      do {
	    	  System.out.println("            메뉴            ");
	    	  System.out.println("---------------------------");
	    	              System.out.println("1.애플리케이션 정보 \n2.가위바위보 게임 "
	    	                      + "\n3.숫자 알아맞히기 게임 \n4.종료");
	    	  System.out.println("---------------------------");
	    	  System.out.print("메뉴 번호 입력 : ");
	    	  Num = sc.nextInt();
	    	

	    	  switch (Num) {
			case 1:
				AppInfo a = new AppInfo();
				a.showAppInfo();
				break;
			case 2 :
				GaBaBo gbb = new GaBaBo();
				gbb.play();
				break;
			case 3 :
				Guess gu = new Guess();
				gu.play();
				break;
			case 4 :
				System.out.println("종료합니다!");
				System.out.println("****************************************");
			default:
				break;
			}
	      }while(Num != 4);
	      sc.close();
	}
}
