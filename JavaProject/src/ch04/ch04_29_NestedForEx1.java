package ch04;

import java.util.Scanner;

public class ch04_29_NestedForEx1 {

	public static void main(String[] args) {
		// 출력할 라인수를 입력받아서 *를 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) { //전체 출력의 행을 결정 => num 변수 저장 값 만큼 행을 구성한다.
			for(int j=1; j<=i; j++) {//한 행에 대해서 *의 출력갯수를 결정. =>i값에 종속.
				//* 출력: 오른쪽방향으로 붙여서 출력
				System.out.print("*");
			}
			System.out.println();//한 행의 * 출력이 끝나면 줄바꿈.
		}
		
		
		
		
		
		sc.close();
		}
	}

