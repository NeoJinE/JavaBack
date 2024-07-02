package Ch04_2;

import java.util.Scanner;

public class Ch04_10_SwitchEx1 {

	public static void main(String[] args) {
		// TODO Switch문을 통한 학점 출력하기
		Scanner sc = new Scanner(System.in);
		
		//변수선언
		int Score;
		
		//점수입력
		System.out.println("점수입력(0~100)");
		Score = sc.nextInt();
		
		//점수에 따른 등급 입력.
		switch (Score/10) {
		case 10:
		System.out.println("학점: A");
		break;
		case 9:
		System.out.println("학점: A");
		break;
		case 8:
		System.out.println("학점: B");
		break;
		case 7:
		System.out.println("학점: C");
		break;
		case 6:
		System.out.println("학점: D");
		break;
		default:
			System.out.println("학점: F");
			break;
		}
		sc.close();
	}
}
