package Ch4;

import java.util.Scanner;

public class Ch04_05_NestedIf {

	public static void main(String[] args) {
		// if(조건식){if(조건식){} ~else{if(조건식){} else{}}
		int score; 
		String grade = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력: ");
		score = sc.nextInt(); // 숫자키가 아닌 키를 입력하면 오류
		//if ~else if ~else
		if(score>=90) {
			if(score>=95) {
				grade = "A+";	
		}else grade = "A";
	}
		else if(score>=80)  //점수가 90 미만일때 조건을 검사한다.
			if(score>=85) {
				grade = "B+";	
		}	else grade = "B";
	
		else if(score>=70)	//점수가 80 미만일때 조건을 검사한다.
			if(score>=75) {
				grade = "C+";	
		}	else grade = "C";
	
		else if(score>=60)	//점수가 70 미만일때 조건을 검사한다.
			if(score>=65) {
				grade = "D+";	
		}	else grade = "D";
	
		else grade = "F";
		
		
		System.out.println("성적: " + grade);
		
		sc.close();
		
	}

}
