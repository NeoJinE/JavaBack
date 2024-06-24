package ch04;
import java.util.Random;
import java.util.Scanner;
public class ch04_16_RandomNumEx2 {

	public static void main(String[] args) {
		// 가위바위보 게임 switch 문 사용
		Scanner sc = new Scanner(System.in);
		int Com, User;
		String Rsp = " ";
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나 입력하세요 : ");
		//사용자 선택 저장 변수 User (정수 1,2,3 중 하나 입력)
		User = sc.nextInt(); 
		
		//Com 숫자 생성(1~3까지 출력)
		
		//방법1.
		//Com = (int)(Math.random() * 3) + 1; 
		
		//방법2.
		Random r = new Random();
		Com = r.nextInt(3)+1; 
		
		
		//게임결과 확인.
		if((Com == 1 && User == 2) || 
		   (Com == 2 && User == 3) ||
		   (Com == 3 && User == 1))
			Rsp = "Win";
		else if((Com == 1 && User == 3) ||
				(Com == 2 && User == 1) ||
				(Com == 3 && User == 2))
			Rsp = "Lose";
		else
			Rsp = "Draw";
		
		//String으로 표현했을시
		switch (Rsp) {
		case "Win":
			System.out.println("당신이 이겼습니다.");
			break;
		case "Lose":
			System.out.println("당신이 졌습니다.");	
			break;
		default:
			System.out.println("무승부입니다.");
			break;
		}
				
		System.out.println("컴은 " + Com + "입니다.");
		System.out.println("당신은 " + User + "입니다.");
		
		
		
		
		
		sc.close();
	}

}
