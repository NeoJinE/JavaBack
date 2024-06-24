package Ch4;

import java.util.Scanner;

import javax.management.ValueExp;

public class Ch04_05_NestedIf1 {
	public static void main(String[] args) {
		//현금 지급인지 카드 지급인지 따른 할인율 차등 계산 프로그램
		int num,value;
		char pay;
		 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호입력(1.현금 2.카드): ");
		pay = sc.next().charAt(0);
		if(pay == '1' || pay == '2') {
			//금액입력/계산/출력
			System.out.println("지불액 입력: ");
			value = sc.nextInt();
			//중첩 if문
			if(pay =='1') { // 현금 할인율 10% 적용 후 계산 결과 출력
				System.out.println("현금 할인율 10%");
				System.out.println("할인액 : " +(int)(value * 0.1) + "원");
				System.out.println("할인액 : " + value / 10 + "원");
				
			}else {
				System.out.println("카드 할인율 5%");
				System.out.println("할인액 : " + (int)(value * 0.05) + "원");
				System.out.println("할인액 : " + value / 20 + "원");
			}
		}else {
			System.out.println("잘못 입력하였습니다. 종료합니다.");
		}
			
		
		
		
		
		
		
		
		
		sc.close();
	}
}
