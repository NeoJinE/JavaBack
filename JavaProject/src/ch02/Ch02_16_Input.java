package Ch02;
//import 구문은 클래스가 시작되기 전에 코드를 작성해야 한다.
//import를 통해서 사용한다고 한 후, 사용.) => 여기서 선언한다.
import java.util.Scanner;
public class Ch02_16_Input {

	public static void main(String[] args) {
		//예제 프로그램에서 사용하기 위한 Scanner객체 사용 연습.
		//Scanner 객체: 키보드를 통해 입력이 가능하게 하는 클래스 객체.
		//Java의 내장으로 포함된 객체가 아니여서, import를 통해서 사용한다고 한 후, 사용.
		//Scanner객체 참조변수 선언후, 생성해서 사용해야 한다.]
		Scanner sc = new Scanner(System.in); // new를 통해 새로운 객체변수 할당., => System.in을 통해 기본입력장치(키보드)로 선언.
		
		//사용자가 키보드를 통해 입력된 모든 값이 일단 문자로 변환된다.
		System.out.println("첫번쨰 숫자입력: ");
		int num1 = sc.nextInt(); //사용자가 키보드를 통해 입력된 값이 정수로 변환된다.
		
		System.out.println("두번째 숫자입력: ");
		int num2 = sc.nextInt(); //사용자가 키보드를 통해 입력된 값이 정수로 변환된다.
		
		System.out.println();
		System.out.println("두 수의 합: " + (num1+num2));
		
		System.out.println("세번쨰 숫자입력: ");
		double num3 = sc.nextDouble(); //사용자가 키보드를 통해 입력된 값이 정수로 변환된다.
		
		System.out.println("네번째 숫자입력: ");
		double num4 = sc.nextDouble(); //사용자가 키보드를 통해 입력된 값이 정수로 변환된다.
		
		System.out.println();
		System.out.println("두 수의 합: " + (num1+num2));
		
		System.out.println("이름입력: ");
		String strIn = sc.next();
		
		System.out.println();
		System.out.println(strIn);
		
		
		
		
		sc.close(); // new를 통해 할당받은 객체변수는 사용종료후에 닫아줘야한다.
	}

}
