package Ch04_2;

import java.util.Scanner;

public class Ch04_37_DoWhileEx {

	public static void main(String[] args) {
		// 과정 안내 프로그램 작성
		Scanner sc = new Scanner(System.in);
		//1.제목작성.
		System.out.println("과정 안내 프로그램");
		//2.변수선언
		int Input;
		String Opt="";
		
		//3.반복문작성.
		do{	
		
		//4.번호입력받기
		System.out.println("1~4번호입력");
		Input = sc.nextInt();
		
		//5.1번~4번까지는 데이터값 설정
		switch(Input) {
		case 1: 
		System.out.println("Java 프로그래밍");
		break;
		
		case 2: 
		System.out.println("데이터베이스");
		break;
		
		case 3: 
		System.out.println("알고리즘");
		break;
		
		case 4: 
		System.out.println("AI");
		break;
		default:
			System.out.println("잘못 입력하였습니다.");
		}
		
		//6.반복문 입력값 받기
		System.out.println("계속 입력하시겠습니까?(y입력하면 계속)");
		Opt = sc.next();
		}
		
		//7.입력된 값이 y이면, do문 안의 코드 반복
		while(Opt.equals("y"));
		
		//8.입력된 값이y가 아니면, do문 안의 코드 종료.
		System.out.println("종료합니다.");
	sc.close();
	}
}