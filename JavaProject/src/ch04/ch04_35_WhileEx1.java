package ch04;

import java.util.Scanner;

public class ch04_35_WhileEx1 {

	public static void main(String[] args) {
		//1 ~ 100 수 중 짝수의 합을 구하여 그림과 같이 출력하는 프로그램 
			Scanner sc = new Scanner(System.in);
		//1.변수선언
			int Total=0;
			
		//2.1~100사이의 짝수만 출력하기
			int i=0;
			while(i<=100) {
			
			if(i % 2 ==0)
		//3.짝수의 합 구하기	
				Total += i;
				i++;	
		//4.짝수의 합 출력.
			}	
			System.out.print("1~100 짝수의 합: " + Total);
		sc.close();
		}
	}
