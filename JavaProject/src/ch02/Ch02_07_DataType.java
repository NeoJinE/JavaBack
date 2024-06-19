package ch02;

public class Ch02_07_DataType {
	public static void main(String[] args) {
		//문자형: 2byte, 문자타입/정수타입
		//문자형 변수 선언 및 초기화
		char a = 'A';
		char b = '\u0041';//유니코드 문자 A 
		char c = 65;
		
		System.out.println("--서로 다른 형태의 값을 저장한 char 변수 출력--");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("--변수 타입이 char 이므로 모두 문자로 값을 출력");
		System.out.println();
		
		//위에서 선언한 문자형 변수를 정수형으로 변환해서 출력 => int(정수가 아닌 다른 type 변수) : 정수형 값으로 반환. 
		System.out.println((int)a); //a 변수에 저장된 값의 타입을 int로 형변환.
		System.out.println((int)b);
		System.out.println((int)c);
		System.out.println();
		
		//문자 리터럴의 형변환
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'Z');
		//65~90: 영문 대문자 아스키 코드
		System.out.println();
		System.out.println((int)'a');
		System.out.println((int)'z');
		//97~122: 영문 소문자 아스키 코드
		System.out.println();
		System.out.println((int)'0');
		System.out.println((int)'9');
		//48~57: 숫자 (0~9) 아스키 코드
	}
}
