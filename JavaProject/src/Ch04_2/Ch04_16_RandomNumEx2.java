package Ch04_2;

import java.util.Scanner;

public class Ch04_16_RandomNumEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Cnum, num;
		String Rsp = " ";
		
		Cnum = (int)(Math.random() * 3) + 1;
		System.out.println("가위(1), 바위(2), 보(3) 중 하나 입력하세요 : ");
		num = sc.nextInt();
		
		if((Cnum == 2 && num == 3) || 
		   (Cnum == 1 && num == 2) ||
		   (Cnum == 3 && num == 1))
			Rsp = "Win";
		else if((Cnum == 3 && num == 2) ||
				(Cnum == 2 && num == 1) ||
				(Cnum == 1 && num == 3))
			Rsp = "Lose";
		else
			Rsp = "Draw";
		
		
		switch (Rsp) {
		case "Win":
			System.out.println("당신이 이겼습니다.");
			break;
		case "Lose":
			System.out.println("당신이 졌습니다.");	
			break;
		default:
			System.out.println("무승부입니다.");
			break;
		}
		
		System.out.println("컴은 " + Cnum + "입니다.");
		System.out.println("당신은 " + num + "입니다.");
		
		
		
		
		
		sc.close();
	}
}
