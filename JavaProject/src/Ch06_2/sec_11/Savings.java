package Ch06_2.sec_11;

import java.util.Scanner;

public class Savings {
	//1.멤버변수선언
	String Name;
	int Deposit,Interest;
	int Balance=10000;
	
	//2.멤버메서드
	public void setName() {
		Name = "홍길동";
	}

	public void setBalance() {
		Balance = 10000;
	}
	
	public String getName() {
		return Name;
	}

	public void inputDeposit(Scanner sc) {
		System.out.println("예금액 입력: ");
		Deposit=sc.nextInt();
		Balance += Deposit;
	}
	
	public int getInterest() {
		this.Interest = (int)(Balance * 0.1);
		return this.Interest;
	}
	
	public int getBalance() {
		return Balance+Interest;
	}
	
	//3.출력 메서드.
	public void showList(Scanner sc) {
		System.out.println("예금주: " + Name);
		System.out.println("입금전 잔액: " + Balance);
		inputDeposit(sc);
		getInterest();
		System.out.println("이자: "+Interest);
		System.out.println("최종잔액: " + getBalance());
	}
}
