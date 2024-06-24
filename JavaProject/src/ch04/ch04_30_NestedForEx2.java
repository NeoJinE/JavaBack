package ch04;

import java.util.Scanner;

public class ch04_30_NestedForEx2 {

	public static void main(String[] args) {
		// 입력된 수에 따른 * 찍기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			
				
			for(int j=num; j>=i; j--) {
				//i의 현재 값이 종료조건으로 사용이 된다. => 많이 찍고 점점 적게 찍는다.(별의 최대갯수는 num이 갖고있다. num=>초기값.
	
			System.out.print("*");
			}
		
		
			System.out.println("");
		}
		sc.close();
	}

}