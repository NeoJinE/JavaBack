package Ch04_2;

public class Ch04_13_RandomNum1 {

	public static void main(String[] args) {
		// Math.random() 메서드 이용한 난수 발생
		//0 < 난수 < 1 : 실수형태의 난수 발생 => 정수형 난수 필요시 연산해서 정수로 만들어야 한다.
		double num = Math.random();
		System.out.println(num);
		
		//필요한 난수 0~9까지의 난수.
		int num2 = (int)(Math.random() * 10);
		System.out.println(num2);
		
		//필요한 난수 0~10까지의 난수.
		int num3 = (int)(Math.random() * 10) + 1;
		System.out.println(num3);
		
		//필요한 난수 0~100까지의 난수.
		int num4 = (int)(Math.random() * 100) + 1;
		System.out.println(num4);

	}

}
