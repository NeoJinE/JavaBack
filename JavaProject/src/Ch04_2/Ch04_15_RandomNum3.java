package Ch04_2;

import java.util.Random;
import java.util.Scanner;

public class Ch04_15_RandomNum3 {

	public static void main(String[] args) {
		// Random 클래스를 이용한 가위 바위 보 프로그램 만들기.
		// 사용자에게 1~3의 정수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		int User, Com;
		Random r = new Random();
		
		//User에게 숫자를 입력받는다. 
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");
		User = sc.nextInt(); 
		
		//Com 숫자입력받기.
		Com = r.nextInt(3)+1; //1~3 사이의 난수를 발생.
		
		//User가 이기는 모든 경우의 수
		if((User == 1 && Com == 3) || 
		  (User == 2 && Com == 1) || 
		  (User == 3 && Com == 2))
			System.out.println("당신이 이겼습니다.");
		else if(User == Com)
			System.out.println("비겼습니다.");
		else
			System.out.println("컴이 이겼습니다.");
		
		
		System.out.println("당신은" + User + "입니다");
		System.out.println("컴은 " + Com + "입니다.");
		System.out.println();
		
		
		
		
		sc.close();
	}

}
