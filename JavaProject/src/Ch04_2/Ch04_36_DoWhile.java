package Ch04_2;

import java.util.Scanner;

public class Ch04_36_DoWhile {
	public static void main(String[] args) {
		//사용자가 입력하는 숫자가 0 일때까지 반복 실행
		
		Scanner sc = new Scanner(System.in);
		int num =0;
		//while 문으로 작성. => while(조건){}
		while(num!=0) { //처음부터 조건에 어긋나, 반복 진행이 없다.
			System.out.println("while반복 실행중입니다: " + num);
				//num변수 초기값이 0일때 0번 실행.
		}
		//do ~ while문으로 작성 => do{}작성, while(조건)
		do { //조건검사를 나중에 함으로, 일단 진입해서 1번 실행.
			System.out.println("do~while반복 실행중입니다: " + num);
		}while(num != 0);//조건검사에서 어긋남 => 더이상 반복 진행 x
		//num변수 초기값이 0일때 1번 실행.
		
		//사용자가 입력하는 숫자가 0 일때까지 반복 실행
		do {
			System.out.print("숫자입력:(종료하려면 0을 입력) ");
			num = sc.nextInt();
			System.out.println("사용자 입력 값: " + num);
		}while(num!=0);
		
		//사용자가 입력한 값을 모두 더한 결과를 출력하는 프로그램.
		
		
		int num1, sum =0;
		do {
			System.out.print("숫자입력:(종료하려면 0을 입력) ");
			num1 = sc.nextInt();
			sum+=num1;
		}while(num!=0);//num1 초기값이 없어도 에러가 발생 x => do{}에서 num1이 결정되기에 에러x
		
		System.out.println("입력종료!");
		System.out.printf("입력한 숫자의 총합: %d",sum);
		
		int num2=1;//while문 종료 조건이 n2가 0일때 이기에, 초기값은 0이되면 안된다.
		while(num2!=0) { //블럭 진입 전에 조건 검사 num2가 초기화 되어 있지 않을시 오류.
			System.out.print("숫자입력:(종료하려면 0을 입력) ");
			num2 = sc.nextInt();
			sum+=num2;
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
