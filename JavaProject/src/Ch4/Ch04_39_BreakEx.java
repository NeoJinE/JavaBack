package Ch4;

import java.util.Scanner;

public class Ch04_39_BreakEx {

	public static void main(String[] args) {
		// **현재 잔액은 100,000으로 지정**
		// **인출 수행 시 잔액이 부족하면**
	    // **프로그램 종료하고**
	    // **현재 잔액 출력**
		Scanner sc = new Scanner(System.in);
		
		//1.변수선언
		int Balance = 100000, Withdrawal;
		
		//2.현재잔액
		System.out.println("현재잔액: " + Balance);
		
		
		while(true){
		
		//3.인출액 입력.
		System.out.println("인출액 입력");
		Withdrawal = sc.nextInt();
		
		
		if(Balance >= Withdrawal) {
		//4.현재잔액에서 인출 액 차감.	
		Balance -= Withdrawal;
		
		//5.현재금액에서 인출액을 차감이 가능하면 지속
		continue;
		}
		//6.4번이 불가능하면, "잔액부족, 현재잔액" 출력
		else {
		System.out.println("잔액 부족. 현재 잔액: " + Balance);
        break;	
		}
		
		}
		sc.close();
	}

}
