package Ch04_2;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ch04_22_ForEx4 {

	public static void main(String[] args) {
		//시작 값과 마지막 값을 입력 받아서 두 수 사이의 합을 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		//1.변수선언
		int Start = 0;
		int End = 0;
		int Sum = 0;
		
		//2.시작값 & 마지막값 입력받기
		System.out.println("Start 입력");
		Start = sc.nextInt();
		System.out.println("End 입력");
		End = sc.nextInt();
		
		//3.시작값~마지막값까지 반복문작성
		for(int i=Start; i<=End; i++) {
		
		//4.Start~End 사이의 값 합산
			Sum += i;
		}
		//5.출력문
		System.out.println(Start + "~" + End + "의 합: " +Sum);
		sc.close();
	}

}
