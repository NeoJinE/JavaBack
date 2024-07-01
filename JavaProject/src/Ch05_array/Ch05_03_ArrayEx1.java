package Ch05_array;

import java.text.DecimalFormat;

public class Ch05_03_ArrayEx1 {

	public static void main(String[] args) {
		//배열을 선언하고 scores선언.
		DecimalFormat df = new DecimalFormat("0.00");
		//1.변수 & 배열선언
		int Total=0;
		double Aver;
		int[]Score = {83,95,88};
		
		//2.배열의 합과 평균 구하기
		for(int i=0;i<3;i++) {
			Total+=Score[i];
		}
		Aver = (double)Total/3;
		//3.배열출력문 작성.
		System.out.println("총점: " + Total);
		System.out.println("평균: " +df.format(Aver));
	}

}
