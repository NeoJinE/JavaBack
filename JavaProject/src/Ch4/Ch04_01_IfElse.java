package Ch4;

import java.util.Scanner;

public class Ch04_01_IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		if(score >= 60)
			System.out.println("Pass 했습니다.");
		else if(score >= 90) 
			System.out.println("grade: A");
		else	
			System.out.println("grade: B");
		System.out.println("세부지표 확인하세요");
		
		sc.close();
	}
}
