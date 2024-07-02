package Ch04_2;

import java.util.Scanner;

public class Ch04_26_For4 {
	public static void main(String[] args) {
		//무한반복 for 문
		int num = 0;
		//무한반복
		for(; ;) { // {}의 문장으로 무한반복 할 것. => 종료되지 않는다. => 종료조건 코드를 작성해야 한다.
			
			//Scanner sc = new Scanner(System.in);
			//System.out.println("숫자를 입력하세요");
			
			//num = sc.nextInt();
			System.out.println("당신이 입력한 숫자는" + (num++) + "입니다");
			//sc.close();
			if(num > 1000)
				break;
			}
		System.out.println("break 상태의 num값 : " + num);
		}
}
