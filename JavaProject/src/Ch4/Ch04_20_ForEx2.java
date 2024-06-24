package Ch4;

import java.util.Scanner;

public class Ch04_20_ForEx2 {

	public static void main(String[] args) {
		// 1 ~ i 사이의 값 중 홀수, 홀수의 합을 출력하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		//변수선언.
		int num;
		int Sum = 0;
		
		//정수입력받기
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();
		System.out.println("============================= ");
		
		// 1 ~ 입력받은 정수까지의 숫자 배열
		for(int i=1; i<=num; i++) {
			
		// 숫자 배열사이 홀수를 출력, 출력된 홀수를 모두 더한값을 변수에 저장.	
			if(i % 2 ==1) {
				Sum += i;
				System.out.println(i);
			}
		}
		//홀수의 합 출력.
		System.out.println("1~ " + num + "홀수의 합: " + Sum);
		sc.close();
	}

}
