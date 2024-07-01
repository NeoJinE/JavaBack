package Ch6_class_sec26.game;

import java.util.Random;
import java.util.Scanner;

public class GaBaBo {
	public void play() {
		//가위바위보 게임
		
		//1. 변수선언
		int User,Com;
		
		//2. 컴퓨터(난수생성) & 사용자 숫자 입력받기.
		Random r = new Random();
		Com = r.nextInt(3)+1;
		Scanner sc = new Scanner(System.in);
		

		
		
		//3.가위바위보 조건생성 & y를 누르면 재시작.
		//시작 or 종료변수
		char Input;
		
		do {
			System.out.println(
				"\t가뷔바위보 게임"+
				"\n가위 바위 보 게임: 1.가위 2.바위 3.보"+	
				"\n============================");
			System.out.println("숫자입력");
			User = sc.nextInt();
			
			if((Com==1 &&User ==2)||
			   (Com==2 &&User ==3)||
			   (Com==3 &&User ==1)){
				System.out.println("당신이 이겼습니다."+
								   "\n컴: "+Com +"사용자: "+User);
			}else if(Com==User) {
				System.out.println("비겼습니다.");
			}else {
				System.out.println("당신이 졌습니다"+
								   "\n컴: "+Com +"사용자: "+User);
			}
			System.out.println("재시작 하시겠습니까?"+
								" (y:재시작 / n:종료)");
			Input = sc.next().charAt(0);
		}while(Input != 'n');
		System.out.println("종료합니다.");
	}
}

