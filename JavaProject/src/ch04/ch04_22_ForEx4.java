package ch04;

import java.util.Scanner;

public class ch04_22_ForEx4 {

	public static void main(String[] args) {
		// 사용자에게 시작값과 끝값을 입력받아, 두 수 사이의 합을 구해 출력.
		int start, end, sum=0;	
		
		//사용자에게 입력.
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값 입력: ");
		start = sc.nextInt();
		
		System.out.println("끝값 입력: ");
		end = sc.nextInt();
	
		for(int i = start; i<=end; i++) {
			sum+=1;
		}
					
		System.out.printf("%d~%d의 합: %d",start,end,sum);
		sc.close();
		
	}

}
