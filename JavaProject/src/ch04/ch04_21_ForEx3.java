package ch04;

import java.util.Scanner;

public class ch04_21_ForEx3 {
	public static void main(String[] args) {
		//사용자에게 구구단 단수 입력받아 해당 단 출력.
		Scanner sc = new Scanner(System.in);
		//1.변수선언
		int Num;
		int Dan = 0;
		
		//2.출력할 단수입력
		System.out.println("단 수 입력");
		Num = sc.nextInt();
		System.out.println("===============================");
		
		//3.구구단 계산.
		//3-1. 출력할 단의 반복문
		for(int i=Num; i<=Num; i++) {
		//3-2. 1~9까지의 반복문.	
			for(int j=1;j<10;j++) {
			Dan = Num * j;
		//4. 출력문.	
			System.out.println(Num +"x"+ j +" = " + Dan);
			}
		}	
		sc.close();
	}

}