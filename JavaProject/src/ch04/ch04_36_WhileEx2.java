package ch04;

import java.util.Scanner;

public class ch04_36_WhileEx2 {

	public static void main(String[] args) {
		// 7이 아니면 계속 입력, 7 입력하면 종료하는 프로그램
		Scanner sc = new Scanner(System.in);
		//1.변수선언
		int Input;
		//2.숫자 입력 받기
		System.out.println("숫자 입력");
		Input = sc.nextInt();
		//3.입력받은 숫자가 7이 아니면 "다시입력" 반복하기
		while(Input != 7) {
			System.out.println("다시 입력");
			Input = sc.nextInt();
		}	
		//4.입력숫자가 7이면 종료
		System.out.println("7 입력.종료");
		//5.출력문.
		sc.close();
	}

}
