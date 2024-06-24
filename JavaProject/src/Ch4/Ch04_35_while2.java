package Ch4;

import java.util.Scanner;

public class Ch04_35_while2 {
	public static void main(String[] args) {
	//while을 이용한 무한반복(종료시점 사용자 입력에 따라 결정)
	//사용자에게 입력받은 문자를 출력해주는 프로그램 => 사용자가 x문자열을 입력하면 입력을 종료한다.
		Scanner sc =  new Scanner(System.in);

		while(true) {
			System.out.println("\n값을 입력하세요.");
			String str = sc.next(); //사용자가 입력한 문자열을 변수 str에 저장.
			
			//사용자 입력값이 x인지 확인해서 x이면 종료.
			//if(str =="x") { //문자열 객체참조 변수의 비교.(관계연산) => 문자열은 일반 관계연산을 사용할 수 없다.
			//=> 문자열은 일반 관계연산을 사용할 수 없다. => 문자열 내 비교 메서드를 사용해야 한다.				
				if(str.equals("x")) {//문자열 객체 내 비교는 equals() 메서드를 사용
				System.out.println("종료합니다.");
				break;
			}// 위 if의 조건이 true가 되는 시점은 사용자가 결정하게 된다.
			System.out.printf("입력값은 %s 입니다. 종료하려면 x를 입력하세요", str);
			
		}
		
		
		
		
		
		
		
		
		//sc.close();
	}
}
