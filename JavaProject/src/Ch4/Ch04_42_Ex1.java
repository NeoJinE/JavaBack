package Ch4;

import java.util.Scanner;

public class Ch04_42_Ex1 {

	public static void main(String[] args) {
		// 숫자 알아맞히기 게임 : 생성된 랜덤 숫자 알아맞히기
		Scanner sc = new Scanner(System.in);
		//1.변수선언
		int Input, Random, Answer;
		//2.기본 출력문 작성
		System.out.println("--------------------------------\n어떤 숫자일까요? 알아 맞혀보세요 ^^ (1~10)\n--------------------------------");
		//3..랜덤숫자 생성
		Random = (int)(Math.random() * 10) + 1;
		//4.숫자 입력받기
		System.out.println("숫자 입력\n--------------------------------");
		Input = sc.nextInt();
	
		//5. 일치하지 않을 경우 출력문
			
		do {System.out.println("아닙니다. 다시 맞혀보세요\n--------------------------------");
			System.out.println("숫자 입력\n--------------------------------");
			Input = sc.nextInt();
		}while(Random != Input);
		
		//6.일치 할 경우 출력문
		System.out.println("드디어 맞혔습니다~ 나의 숫자는" + Random + "입니다\n**********************************************");
		
		sc.close();
	}

}
