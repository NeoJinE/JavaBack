package Ch03;

import java.util.Scanner;

public class Ch03_08_LogicalOp {
	public static void main(String[] args) {
		//논리연산 정리.
		Scanner sc = new Scanner(System.in);
		char ch = ' '; //스페이스로 초기화.
		
		System.out.print("문자 하나 입력");
		ch = sc.next().charAt(0);//charAt(0) => 반환값이 char 타입.
		
		//입력된 한 문자가 숫자형태(0~9)인지, 확인하는 코드
		//비교연산된 결과로 논리연산을 진행해야 한다.
		
		System.out.println(('0'<= ch) && (ch<='9')); //둘 모두 참이여야 참.
		System.out.println(('0'<= ch) || (ch<='9')); //둘 중 하나만 참이여도 참
		
		//입력된 문자가 영문자 인지 확인하는 코드
		//아스키 코드 대문자 범위(65~90) or 아스키코드 소문자 범위(97~122)
		
		if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z'))
			System.out.println("입력한 문자는 영문자 입니다.");
		else
			System.out.println("입력한 문자는 영문자가 아닙니다.");
	
		sc.close();
	}
}
