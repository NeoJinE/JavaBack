package Ch07_inheritance.sec08;

import java.util.Scanner;

public class Worker {
		Scanner sc = new Scanner(System.in);
		//1.멤버변수 선언
		private int RegNo;
		private String Name;
		
		//2.생성자 초기화
		public void setWorker() {
			System.out.println("주민번호: ");
			this.RegNo = sc.nextInt();
			System.out.println("성명");
			this.Name = sc.next();
		}
		
		//3.toString 출력문 작성
		@Override
		public String toString() {
			return "주민번호: " + RegNo +
				   "\n성명: " + Name;
		}
}
