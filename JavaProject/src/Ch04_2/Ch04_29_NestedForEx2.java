package Ch04_2;

import java.util.Scanner;

public class Ch04_29_NestedForEx2 {

	public static void main(String[] args) {
		// 출력할 라인 수를 입력받아서 * 출력(위에서부터 5,4,3,2,1개로 출력)
		Scanner sc = new Scanner(System.in);
		//1.변수선언
		int num;
		
		//2.숫자 입력받기
		System.out.println("숫자 입력");
		num = sc.nextInt();
		
		//3.행수입력
		for(int i=0; i<num; i++) {
		
		//4.열수입력	
			for(int j=num; j>i; j--) {
	
		//5. * 출력
			System.out.print("*");
			}
		
		//6. 줄바꿈.	
			System.out.println("");
		}
		sc.close();
	}

}

