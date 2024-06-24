package ch04;

import java.util.Scanner;

public class ch04_24_ForEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count, score;
		double sum=0; //Sum변수 이용해서 바로 평균 계산 : 평균 결과는 실수로 출력.
		System.out.print("학생 수 입력 : "); // 학생수 반복문 이전에 입력.
		count = sc.nextInt();
		
		//학생 점수는 사용자가 입력받은 학생수 만큼 입력: 반복문 내에서 작성.
		for(int i=0; i<=count; i++) {
			System.out.println("학생" + i + "점수입력: ");
			score = sc.nextInt();
			sum += score;
		}
		
		System.out.println("평균 : " + String.format("%.2f", (sum/count)));
		//(sum/count)의 연산 결과가 실수형 이어야 한다. => 소수점 이하 둘째자리까지 표현.
		
		sc.close();
	}

}
