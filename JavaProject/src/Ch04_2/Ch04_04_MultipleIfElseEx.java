package Ch04_2;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Ch04_04_MultipleIfElseEx {

	public static void main(String[] args) {
		// 정수 3개를 입력받고 최대값 출력하기
		
		Scanner sc = new Scanner(System.in);
		//변수선언
		int num1, num2, num3, Max;
		
		//정수 3개 입력받기
		System.out.println("숫자1 입력");
		num1 = sc.nextInt();
		System.out.println("숫자2 입력");
		num2 = sc.nextInt();
		System.out.println("숫자3 입력");
		num3 = sc.nextInt();
		
		//최대값 출력문 작성
		Max = (num1>num2) ? num1 : (num2>num3) ? num2 : num3;
		System.out.println("가장 큰 수: " + Max);
		
		
		
		}

}
