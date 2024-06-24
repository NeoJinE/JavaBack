package Ch4;

import java.util.Scanner;

public class Ch04_02_IfElseEx {

	public static void main(String[] args) {
		// 숫자를 입력받고 "홀수" or "짝수" 결과를 출력하는 프로그램작성
		Scanner sc = new Scanner(System.in);
		
		//변수선언
		int num;
		
		System.out.println("정수 입력");
		num = sc.nextInt();
		System.out.println((num % 2 == 0) ? "짝수" : "홀수");
		
			
	}

}
