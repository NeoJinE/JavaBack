package Ch02;

public class Ch02_09_DataType03 {

	public static void main(String[] args) {
		//실수형 변수의 저장은 부동소수점 방식을 사용: 부호 + 가수부 + 지수부
		//실수형 변수 선언 및 초기화.
		double doubleVal = 0.1234567890123456789;//8byte 자바 실수의 기본타입.  
		//float floatVal = 0.1234567890123456789; //Type mismatch double to float
		float floatVal = 0.1234567890123456789f;
		System.out.println("double: " + doubleVal);
		System.out.println("float: " + floatVal);
		System.out.println("-------------------------");
		
		//지수 표현 e 사용하기
		int iVal = 3000000;	 //0이 6개
		//지수표현은 실수의 표현. 
		float fVal = 3e6f; 	 //0이 6개.
		double dVal = 3e6; 	 //0이 6개.
		double dVal2 = 2e-3; //-3 : 소수점 이하 3자리
		
		System.out.println("iVal: " + iVal);
		System.out.println("fVal: " + fVal);
		System.out.println("dVal: " + dVal);
		System.out.println("2e-3: " + dVal2);
		System.out.println();
		
		//////////////////////////////////////////
		//논리형 변수 선언 및 초기화
		//논리형 타입: 1byte
		
		boolean bVal = true;
		
		System.out.println("boolean: " + bVal);
		System.out.println(1==1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
