package Ch05_array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch05_05_ArrayEx2 {

	public static void main(String[] args) {
		// 학생 5명이 점수를 입력 받아서 총점과 평균을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		//1.변수&배열선언 
		int Score[] = new int[5], Total=0;
		double Aver;
		

		//2.점수입력받기
		System.out.println("점수 입력");
		for(int i=0; i<5;i++) {
			System.out.println("학생"+(i+1));
			Score[i] = sc.nextInt();
			Total += Score[i];
		}
		Aver = (double)Total / 5;
		//3.총점 & 평균(소숫점2자리) 출력
		System.out.println("평균: " + Total);
		System.out.println("평균: " +df.format(Aver));
		
		
		
		
		
		
		
		
		sc.close();
	}

}
