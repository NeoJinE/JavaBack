package Ch04_2;

import java.util.Scanner;

public class Ch04_23_ForEx5 {

	public static void main(String[] args) {
		//숫자(정수) 10개를 입력 받아 양수, 음수, 0의 개수를 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		//1.변수선언.
		int num[]= new int[10]; //길이 10의 배열생성.
		int Pos = 0;
		int Zero = 0;
		int Neg = 0;
		int Count;
		
		//2.숫자1~10까지의 입력받기.
		for(int i=0; i<10; i++) {
			System.out.println("숫자" + (i+1) +"입력: ");
			num[i] = sc.nextInt();
		
		//3.입력받은 숫자의 양수,0,음수의 갯수 구하기
			Count = (num[i]>0) ? Pos++ : (num[i]<0) ? Neg++ : Zero++;
		}
		//4.양수,0,음수의 갯수 출력하기.
		System.out.println("양수의 갯수: " + Pos);
		System.out.println("음수의 갯수: " + Neg);
		System.out.println("0의 갯수: " + Zero);
		sc.close();
	}
}
