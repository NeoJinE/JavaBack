package Ch02;

public class ch02_03_Varialbe2 {
	public static void main(String[] args) {
		//두 변수의 값을 교환하는 프로그램
		//num변수에 num2의 값을, num2에 num변수의 값을 저장.
		int num = 10;
		int num2 = 20;
		int tmp = 0;
		//교환전 값을 출력.
		System.out.println("num: " + num  + "num2: " + num2);
		
		//두 변수 값 교환=>교환되지 않는다
		/*num = num2; // num값과 num2의 값이 같아짐(두 변수 모두 20)
		num2 = num; // num값을 num2에 주면, num2도 20을 갖는다.
		*/		
		
		//두 변수 값 교환=> 임시변수를 사용해서, 기본값을 보관.
		tmp = num; //기본 변수값 저장
		num = num2;
		num2 = tmp;//보관된 값 새 변수에 저장.
		
		System.out.println("num: " + num  + "num2: " + num2);
		
	}
}
