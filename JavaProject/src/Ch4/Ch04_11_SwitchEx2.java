package Ch4;

import java.util.Scanner;

public class Ch04_11_SwitchEx2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//변수선언
		int Month;
		//현재월 입력받기
		System.out.println("현재월 입력");
		Month = sc.nextInt();
		//봄
		switch(Month) {
		case 3 : ;
		case 4 : ;
		case 5 : ;
			System.out.println("봄");
			break;
		//여름	
		case 6 : ;
		case 7 : ;
		case 8 : ;
			System.out.println("여름");
			break;
		//가을	
		case 9 : ;
		case 10 : ;
		case 11 : ;
			System.out.println("가을");
			break;
		//겨울	
		case 12 : ;
		case 1 : ;
		case 2 : ;
			System.out.println("겨울");
			break;	
		default:
			System.out.println("잘못된 입력입니다.");
			sc.close();
		}
	}
}

