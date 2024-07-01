package Ch05_array;

import java.util.Scanner;

public class Ch05_20_Ex3 {

	public static void main(String[] args) {
		//영어 단어의 뜻을 알아 맞히는 프로그램
		Scanner sc = new Scanner(System.in);
		//1.변수&배열선언
		String[][]Voc = {//3행2열
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		String Ans= "";
		
		//2.단어퀴즈 생성
		 for(int i=0; i<Voc.length; i++) {
			 System.out.printf("Q%d.%s의 뜻은?: ",i+1,Voc[i][0]);
			 //System.out.println("\nQ"+(i+1)+" "+Voc[i][0]+"의 뜻은?");
			 Ans = sc.next();
			if(Ans.equals(Voc[i][1])) {
				System.out.println("정답입니다. \n");
			}else {
				System.out.println("틀렸습니다. 정답은 "+ " " + Voc[i][1]+"입니다.");
			}	 
		 }
	sc.close();
	}
}
