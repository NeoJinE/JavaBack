package Ch02;

public class Ch02_02_initialValue {

	public static void main(String[] args) {
		//1.논리값 초기화.
		boolean isGood = false;
		System.out.println(isGood);
		System.out.println("-------------");
		
		//2.문자값 초기화
		char ch1 = '\u0000';	//유니코드(문자를 나타내는 코드)의 공백문자를 의미
		//invalid character constant 에러 => 초기화시 스페이스 없는 문자를 저장했다는 에러.
		char ch2 = ' ';			//공백(' ')을 주로 사용한다.
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("-------------");
		
		//3.정수값 초기화
		byte b =0;
		short s = 0;
		int i = 0;
		//정수중에서 long형은 실제값도 long형으로 처리 후 저장.
		long l1 =0L; //대문자L
		long l2 =0l; //소문자l
		long l3 =0;	 //자동 형변환 발생
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("-------------");
		
		//4.실수값 초기화
		//Java에서 실수 0.0은 형태 자체가 double형이다. => 실수의 기본 타입은 double.
		//cannot convert from double to float
		//float f1 = 0.0;  => float의 크기가 double보다 작다.
		float f1 = 0.0F;
		float f2 = 0.0f; //0.0이 float형 리터럴(실제값)으로 생성된다.
		float f3 = 0;	//정수 0이 float변수에 저장 불가. => 자동으로 형변환.(float형 형변환을 진행.) => 0.0f
		double d1 = 0;
		double d2 = 0; //정수 0을 double형 변수에 저장하기 위해서 형변환.(double형 형변환 발생.)
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("-------------");
		
		//5.문자열 초기화 =>Java는 문자열이 객체타입(참조형)
		String s1 =null; //null은 객체 참조형 변수에만 사용가능. 기본타입에는 사용불가.
		String s2 = "";	 //빈문자열 표시.
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
	}

}
