package Ch04_2;

import java.util.Scanner;

public class Ch04_08_Switch {
	public static void main(String[] args) {
		//switch문 : 모든 value에 break가 있는 경우
		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학년 숫자 입력: ");
		year = sc.nextInt();
		
		switch(year) {
		case 1: System.out.println("1학년");
		break;
		case 2: System.out.println("2학년");
		break;
		case 3: System.out.println("3학년");
		break;
		case 4: System.out.println("4학년");
		break;
		default:
				System.out.println("잘못입력하였습니다.");
		}
		sc.close();
	}
}
