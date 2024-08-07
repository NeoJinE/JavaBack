package Ch04_2;

public class Ch04_18_For2 {
	public static void main(String[] args) {
		//반복문을 통해서 누적값을 계산하고자 할때 누적변수  for문 전에 선언하고 초기화
		//1~10까지의 합
		int Sum = 0; // 누적변수는 for문전에 선언 반드시 초기화 한다. 
		
		for(int i=1; i<=10; i++) {
			System.out.printf("i가 %d일때 : %d", i, Sum); //더하기 전 Sum값
			Sum+= i;
			System.out.printf(" + %d = %d\n", i, Sum); //더한 후 Sum값
		}
		System.out.println("최종 합: " + Sum);
	}
}