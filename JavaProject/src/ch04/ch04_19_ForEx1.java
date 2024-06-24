package ch04;

public class ch04_19_ForEx1 {

	public static void main(String[] args) {
		// 1~10사이의 값 중 홀수, 홀수의 합을 출력하는 프로그램.
		//범위의 합을 계산하려면, 누적변수 필요하다.
		//누적변수는 반복 전에 선언하고, 초기화 되어야 한다.
		int Sum = 0;
		//i를 1부터 시작, 홀수가 필요하므로, +=2로 작성(if문 생략가능)
		for(int i=1; i<=10; i+=2) {
		//홀수 출력문 작성.	
			System.out.println(i);
			Sum += i;
		}
		System.out.printf("1~10 까지의 수 중 홀수의 합 : %d", Sum);
	}

}
