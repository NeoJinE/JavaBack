package Ch03;

public class Ch03_05_ArithmeticOpError {
	public static void main(String[] args) {
		//연산중, 연산 결과값 산출시, 발생하는 overflow를 주의.
		int x = 1000000; //100만 정수 입력.
		int y = 1000000; //100만.
		int z = x * y;	//정수 = 정수 * 정수 => 문법 오류가 아니다. (해석시 문제가 되지 않는다)	
		//10000000000000 => 정수형 처리 범위를 벗어난다. => overflow가 발생.
		System.out.println(z); 
		//-727379968 =>연산한 결과의 모든 bit가 저장될 수 없으므로, 뒤 비트부터 저장가능한 비트만큼 저장.
		//잘못 저장된 비트를 10진수로 변환해서 보여줌 => 부호비트에도 잘못된 비트가 들어가서 음수/양수도 다르게 표현된다.
		
		//정수형 변수에 저장했을때, overflow 발생 => long형 변수에 저장.
		long l = x * y;
		System.out.println(l);
		
		// (/연산) or (%연산) 주의
		//1. 나누기 연산은 0으로 나눌 수 없다.
		int zero =0;
		//System.out.println(10/zero); //나눗셈은 0으로 나눌 수 없습니다.(예외)
		
		//2.실수 0.0으로 나눌 경우
		System.out.println(10/0.0); //Infinity => 무한대값이 출력.
		//무한대값을 반환하는지 연산결과 확인. => Double객체가 .isInfinite();를 이용해, 무한대값인지에대한 여부를 확
		System.out.println(Double.isInfinite(10/0.0));
		
		//3.%연산
		//0으로 나누는 연산을 진행하게 된다 => 예외가 발생해서 실행종료
		//System.out.println(10 % 0);
		
		System.out.println(10 % 0.0); // NaN값이 출력.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
