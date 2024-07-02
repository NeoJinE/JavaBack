package Ch04_2;

import java.util.Random;

public class Ch04_14_RandomNum2 {
	public static void main(String[] args) {
		// Random 클래스 이용한 난수발생.
		// Random 클래스 객체 참조 변수 r 생성.
		Random r = new Random();
		int num = r.nextInt(10); //0~9범위의 랜덤난수를 생성한다.
		System.out.println(num);

		int num2 = r.nextInt(10) + 1; //0~10범위의 랜덤난수를 생성한다.
		System.out.println(num2);

	}
}
