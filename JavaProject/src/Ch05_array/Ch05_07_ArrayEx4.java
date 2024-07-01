package Ch05_array;

import java.util.Random;
import java.util.Scanner;

public class Ch05_07_ArrayEx4 {

	public static void main(String[] args) {
		//로또 숫자 생성 : 랜덤 숫자 6개 생성해서 출력
		//1 ~ 45 숫자 중 중복되지 않는 6개의 숫자 출력
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		//1.변수&배열선언
		int Lotto[] = new int[6];
		
		//2.1~45사이의 숫자중 랜덤숫자6개 생성
		for(int i=0; i<6; i++) {
			Lotto[i]=r.nextInt(45)+1;
			//난수의 중복여부를 확인해서 중복이 된다면, 금방 생성된 난수를 버리고, i--를 통해 다시생성.
			for(int j=0;j<i;j++) {
				if(Lotto[i]==Lotto[j]) {
					i--;
					break;
				}
			}
		}
		//3.출력문
		System.out.print("로또번호: ");
		for(int i=0; i<6; i++) {
		System.out.print(Lotto[i] + " ");
		}
		sc.close();
	}
}