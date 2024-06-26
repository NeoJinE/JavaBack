package Ch02;

public class Ch02_13_Promotion {

	public static void main(String[] args) {
		// TODO 자동 타입 형 변환 : 작은 데이터 타입 큰 데이터 타입 변수에 저장될 때 발생.
		
		//1. byte => int
		byte bVal = 10;
		int iVal = bVal; // byte => int로 저장되어, byte가 int로 일시적으로 자동 형변환이 발생한다.
		//bVal 변수에 형변환이 발생되어서, int에 저장되었지만, bVal 변수는 여전히 byte형.
		//변수에 저장되어 있는 값 10의 리터럴타입을 => int로 변경후 저장.
		System.out.println(iVal); //정수 리터럴 10이 출력.
		
		//2.char => int
		char cVal = '가';
		iVal = cVal; //char => int로 자동 형변환, '가' 문자가 정수형 리터럴로 변환	=> 유니코드 값으로 전환.
		//Java에서 한글처리는 유니코드를 사용. 영문은 아스키코드를 사용.
		System.out.println("가의 유니코드: " + iVal);
		
		//3.int => long
		iVal =500;
		long lVal = iVal;
		System.out.println(lVal);
		
		//int => double
		//System 규칙상, 실수가 정수보다 더 큰 공간을 차지하는 수치형태.byte 크기 상관 없음.
		//정수를 실수 변수에 저장한다면, 실수로 자동 형변환이 발생되어 저장.
		iVal =200;
		double dVal = iVal;//변수에 저장된 값 자체가 형변환 되면서 더 큰 변수에 저장되게 됨.
		System.out.println(dVal); //실수형태로 출력.
		
	}

}
