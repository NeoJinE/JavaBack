package Ch4;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ch04_19_ForEx1 {

	public static void main(String[] args) {
		// 1 ~ 10 사이의 값 중 홀수, 홀수의 합을 출력하는 프로그램

		Scanner sc = new Scanner(System.in);
		//변수선언
		int Num; 
		int Sum = 0;
		
		
		for(int i=1; i<=10; i++) {
			Num = i;
		if(Num % 2 ==1 ) {
			Sum += i;
			System.out.println(i);
			
		}
	}
		System.out.println("1~10 홀수의 합" + Sum);
		
	}
}