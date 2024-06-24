package ch04;

import java.util.Scanner;

public class ch04_23_ForEx5 {

	public static void main(String[] args) {
		// 10개의 정수 입력받아, 양수 음수 0의 갯수 출력
		int num, pos=0,neg=0,zero=0;
		
		Scanner sc = new Scanner(System.in);
		
		//10개의 정수입력. 반복문은 10번 반복해야한다.
		for(int i =1; i<=10; i++) {
			System.out.printf("숫자%d입력 ", i);
			num = sc.nextInt(); //키보드 0~9 아닌 나머지는 오류발생.
			if(num>0)
				pos++;
			else if(num<0)
				neg++;
			else
				zero++;
			
		}
		
		
		System.out.printf("양수 개수 : %d\n", pos);
		System.out.printf("음수 개수 : %d\n", neg);
		System.out.printf("0의 개수 : %d\n", zero);
		
		sc.close();		

	}

}
