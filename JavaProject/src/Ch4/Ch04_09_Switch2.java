package Ch4;

import java.util.Scanner;

public class Ch04_09_Switch2 {

	public static void main(String[] args) {
		// 브레이크가 없는 case가 포함된 switch문
		// 회사의 직급이 1급부터 ~ 9급까지 있을때, 
		// 각각의 직급에 해당하는 기본급이  
		//1~3급:1500000
		//4~6급:1250000
		//7~9급:1100000
		//그 외에는 잘못된 직급.
		
		Scanner sc = new Scanner(System.in);
		//변수선언
		String Grade = "";
		System.out.println("직급을 입력하시오");
		Grade = sc.next();
		
		switch(Grade) {
		case "1급" : ;
		case "2급" : ;
		case "3급" : ;
			System.out.println("기본급 150만원");
			break;
		case "4급" : ;
		case "5급" : ;
		case "6급" : ;
			System.out.println("기본급 125만원");
			break;
		case "7급" : ;
		case "8급" : ;
		case "9급" : ;
			System.out.println("기본급 110만원");
			break;
		default:
			System.out.println("잘못된 직급입니다");
		}
		sc.close();
	}

}
