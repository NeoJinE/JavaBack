package Ch02;

public class ch02_01_Variable01 {

	public static void main(String[] args) {
		// 정수형 변수 value를 선언 후 10으로 초기화.
		int value = 10;
		//int value;
		//정수형 변수 result 선언.
		//변수 value에서 값을 참조해서 (값을 읽어와서) 그 값의 10을 더하는 연산을 진행
		//이후 연산된 결과를 result변수에 저장.
		int result = value + 10;
		
		//변수 result의 값을 참조해서 읽고, 그 값을 콘솔에 출력.
		System.out.println(result);
	}

}
