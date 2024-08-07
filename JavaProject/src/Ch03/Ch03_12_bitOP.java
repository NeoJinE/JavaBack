package Ch03;

public class Ch03_12_bitOP {
	public static void main(String[] args) {
		// bit: 논리 연산자
		// &, |, ^ : boolean 타입에 대한 연산인 경우 일반 논린 연산자와 동일하게 적용
		System.out.println(true & true);
		System.out.println(true | true);
		System.out.println(true ^ true); // X or => 양쪽 논리값이 서로 다르면 true, 같으면 false
		//System.out.println(~true);
		
		//수치를 활용한 비트 논리 연산자
		System.out.println(1 & 1); //두 비트가 모두 1일 경우에만 1, 나머지는 0을 반환한다.
		System.out.println(1 & 0);
		System.out.println(45 & 25); //9 출력
		//45를 이진수로 변환하고, 25를 이진수로 변환. => 같은 위치의 bit끼리 & 연산을 진행한다.
		System.out.println(45 | 25); //9 출력
		//45를 이진수로 변환하고, 25를 이진수로 변환. => 같은 위치의 bit끼리 | 연산을 진행한다.
		System.out.println(~1); // ~bit 연산을 사용하면, 부호가 변경된다.
		
		//shift 연산 : 정해진 수 만큼 bit를 왼쪽 or 오른쪽으로 이동하는 연산
		//빈 bit 가 생김. => << shitf : 오른쪽 빈 비트를 0으로 채움, 왼쪽 밀려나는 비트는 버린다.
		System.out.println(1 << 3); //숫자1을 2진 비트로 변환후, 왼쪽으로 3bit 이동 => 8이 출력된다. 0001 << 3 =>1000
		
		//빈 bit 가 생김. => >> shitf : 왼쪽 빈 비트를 0으로 채움, 오른쪽 밀려나는 비트는 버린다.
		//부호비트 : 음수 1, 양수 0
		System.out.println(8 >> 3); //숫자8을 2진 비트로 변환후, 오른쪽으로 3bit 이동 => 8이 출력된다. 1000<< 3 => 0001
		
		//shift의 의미 << = 곱하기와 같은의미
		System.out.println(1 << 1); //2  (2^1)
		System.out.println(1 << 2); //4  (2^2) 
		System.out.println(1 << 3); //8  (2^3) 
		System.out.println(1 << 4); //16 (2^4)
		System.out.println(1 << 5); //32 (2^5)
		
		//shift의 의미 >> = 나누기와 같은의미
		System.out.println(32 >> 1);
		System.out.println(32 >> 2);
		System.out.println(32 >> 3);
		System.out.println(32 >> 4);
		System.out.println(32 >> 5);
		
	}
}
