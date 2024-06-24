package Ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch04_24_ForEx6 {
	public static void main(String[] args) {
		//입력한 학생 수 만큼 점수를 입력 받아 평균을 구하여 출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		DecimalFormat df2 = new DecimalFormat("0.00");
		//1.변수선언
		int StuNum; 
		double TotalScore = 0;
		double Average;
		
	    //2.학생수 입력받기.
		System.out.println("학생 수 입력");
		StuNum = sc.nextInt();
		
		//3.입력받은 학생수에 따른 배열생성.
		int StuScore[] = new int [StuNum];
		
		//4.입력받은 학생수에 따른 점수입력받기
		for(int i=0; i<StuNum; i++) {
			System.out.println("학생" + (i+1) + "점수 입력: ");
			StuScore[i] = sc.nextInt();
		
		//5.총점구하기.	
			TotalScore += StuScore[i];
		}

		//6.평균구하기
		Average = TotalScore / StuNum;
		System.out.println("평균: " +df2.format(Average));
		
		
		
		
		
		sc.close();
	}
}
