package Ch05_array;

import java.util.Scanner;

public class Ch05_06_ArrayEx3 {

	public static void main(String[] args) {
		// 숫자 5개를 입력 받아서 최대값을 구하여 출력
		Scanner sc = new Scanner(System.in);
		
		//1.변수입력
		int Max=0;
		//2.숫자 5개배열 작성
		int Num[] = new int [5];
		
		//3.숫자 5개 입력받기
		for(int i=0; i<5;i++) {
		System.out.println("num[" + i + "]");
		Num[i] = sc.nextInt();
		
		}
		
		//4.최대값 추출.
		 for (int i = 1; i < 5; i++) {
            if (Num[i] > Max) {
                Max = Num[i];
            }
		 }
		System.out.print("입력된값: ");
		//5.입력된값 & 최대값 출력
		 for(int i=0; i<5;i++) {
			 System.out.print(Num[i] + " ");	 
		 }
		System.out.println("\n최대값: " + Max);
	}

}
