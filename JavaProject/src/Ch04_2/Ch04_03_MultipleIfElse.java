package Ch04_2;

import java.util.Scanner;

public class Ch04_03_MultipleIfElse {

	public static void main(String[] args) {
		// 점수 입력 받고 성적 출력하는 예제.
		int score; 
		char grade = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력: ");
		score = sc.nextInt(); // 숫자키가 아닌 키를 입력하면 오류
		//if ~else if ~else
		if(score>=90)
			grade = 'A';
		else if(score>=80)  //점수가 90 미만일때 조건을 검사한다.
			grade = 'B';	
		else if(score>=70)	//점수가 80 미만일때 조건을 검사한다.
			grade = 'C';	
		else if(score>=60)	//점수가 70 미만일때 조건을 검사한다.
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("성적: " + grade);
		
		sc.close();
	}

}
