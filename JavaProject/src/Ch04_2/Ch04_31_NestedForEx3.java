package Ch04_2;

import java.util.Scanner;

public class Ch04_31_NestedForEx3 {

	public static void main(String[] args) {
		// 구구단 전체를 테이블 형식으로 출력
		Scanner sc = new Scanner(System.in);
		//1.변수선언
		int Num, Dan;
		
		//2.1~9까지 곱셈입력
 		for(int j=1; j<=9; j++) {
			Num =j;

		//3.단수입력
		for(int i=2; i<=9; i++) {
			Dan = i;	
		
		//4.출력.
		System.out.print(Dan + "x" + Num + "=" + Dan * Num +"\t");		
			}
		System.out.println();
		}
		sc.close();
	}

}
