package ch02;

public class Ch02_08_DataType02 {

	public static void main(String[] args) {
		//정수형 데이터 타입의 기본 타입: int(4byte)
		//정수형은 (byte, short, int, long)
		byte byteVal = 10; // 1byte 정수
		short shortVal = 1000; //2byte 정수
		int intVal = 2100000000; //4byte 정수.
		//long longVal = 100010001000100 ; //100010001000100 int형 리터럴 => int로는 표현이 불가능.
		//The literal 100010001000100 of type int is out of range 
		long longVal = 100010001000100l; //long형 변수에 저장하므로, long(L,l)리터럴로 변경 => 8byte 정수에 해당.
		
		System.out.println("byte: "+ byteVal);
		System.out.println("short: "+ shortVal);
		System.out.println("int: "+ intVal);
		System.out.println("long: "+ longVal);
		System.out.println();//줄바꿈 효과. println() 메서드 => ()내용 출력후, 자동 줄바꿈.
		
		//각 정수 data type에 대한 최대/최소 값 확인. => 객체 사용.
		//byte type에 대한 최대 최소값.
		System.out.println(Byte.MIN_VALUE); //byte 타입의 최소값 확인(MIN_VALUE) -128
		System.out.println(Byte.MAX_VALUE); //byte 타입의 최대값 확인(MAX_VALUE) +127
		
		//int타입에 대한 최대값을 확인
		System.out.println(Integer.MAX_VALUE); // int 타입의 최대값 +2147483647
		
		//숫자 리터럴은 단위 구분을 위해서 중간에 구분자 사용이 가능하다. : '_'
		int ival = 1_000_000_000; //10억 정수 저장 가능.
		System.out.println(ival);
	}

}
