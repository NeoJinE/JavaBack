package Ch04_2;

import java.util.Scanner;

public class Ch04_15_RandomNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Cnum, num;
		String Rsp;
		Cnum = (int)(Math.random() * 3) + 1;
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나 입력하세요 : ");
		num = sc.nextInt();
		Rsp = (Cnum == 1 && num == 2) ? "당신이 이겼습니다." : 
			  (Cnum == 2 && num == 3) ? "당신이 이겼습니다." : 
			  (Cnum == 3 && num == 1) ? "당신이 이겼습니다." : 
		      (Cnum == num) ? "무승부입니다.":
		    	  "컴이 이겼습니다.";
		
		System.out.println("컴은 " + Cnum + "입니다.");
		System.out.println("당신은 " + num + "입니다.");
		System.out.println(Rsp);
		
		
		
		
		sc.close();
	}

}
