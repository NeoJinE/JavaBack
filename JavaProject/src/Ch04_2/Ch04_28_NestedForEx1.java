package Ch04_2;

import java.util.Scanner;

public class Ch04_28_NestedForEx1 {

	public static void main(String[] args) {
		//  출력할 라인 수를 입력받아서 * 출력
		Scanner sc = new Scanner(System.in);
		//1.변수입력
		int num;
		//2.숫자입력
		System.out.println("숫자 입력");
		num = sc.nextInt();
		//3.행수입력
		for(int i=0; i<num; i++ ) {
		//4.열수입력
			for(int j=0; j<=i; j++ ) {
		//5.별출력
				System.out.print("*");
			}	
			System.out.println("");
		}
		sc.close();
	}

}

