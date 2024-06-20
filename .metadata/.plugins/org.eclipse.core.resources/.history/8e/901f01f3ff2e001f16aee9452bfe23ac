package Ch3;
import java.util.Scanner;
public class Ch03_02_ArithmeticOp {

	public static void main(String[] args) {
		//입력받은 두수를 산술연산 진행 후 결과를 출력.
		Scanner sc = new Scanner(System.in);
		//사용할 변수를 모두 미리 선언해 놓는 것이 좋음.
		int num1, num2;
		System.out.print("정수1입력: ");
		num1 = sc.nextInt();
		System.out.print("정수2입력: ");
		num2 = sc.nextInt();
		
		System.out.println("덧셈: "+ (num1+num2));
		System.out.println("뺄셈: "+ (num1-num2));
		System.out.println("곱셈: "+ (num1*num2));
		System.out.println("나눗셈: "+ (num1/num2)); //정수 / 정수 = 정수로 출력된다.
		System.out.println("나머지: "+ (num1%num2));
		System.out.println("-------------------------");
		
		//나눗셈 연산 주의
		//피연산자에 따라 결과 타입이 달라지게 된다.
		int x =123;
		System.out.println(x / 100); //정수 / 정수. => 동일 타입의 연산. => 결과도 동일 타입으로 출력.
		System.out.println(x / 100.0);//정수 / 실수 => 정수가 실수로 형변환되어 실수/실수 => 실수 값으로 출력. 
		//정수 / 실수. => 다른 타입의 연산 => 결과는 명시적으로 개발자가 형변환하지 않는 한 큰 타입으로 자동 형변환이 발생. 
		
		
		
		sc.close();

		/*
		  Scanner sc = new Scanner(System.in); System.out.print("정수1입력: "); int num1 =
		  sc.nextInt(); System.out.print("정수2입력: "); int num2 = sc.nextInt();
		  
		  int Add = num1 + num2; int Sub = num1 - num2; int Multi = num1 * num2; int
		  Div = num1 / num2; int Mod = num1 % num2;
		  
		  
		  System.out.println("-----------------------"); System.out.println("덧셈: " +
		  Add); System.out.println("뺄셈: " + Sub); System.out.println("곱셈: " + Multi);
		  System.out.println("나눗셈: " + Div); System.out.println("나머지: " + Mod);
		  sc.close();
		 */
		
	}

}
