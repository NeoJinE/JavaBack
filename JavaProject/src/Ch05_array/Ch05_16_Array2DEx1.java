package Ch05_array;

public class Ch05_16_Array2DEx1 {

	public static void main(String[] args) {
		//2차원 배열을 생성해서 값을 저장하고 각 행의 합을 구하여 출력
		//1.변수&배열 선언(5행 3열)
		int [][] Num = {
			{5,9,3},
			{7,4,8},
			{9,5,7},
			{7,8,9},
			{6,9,4}
		};
		int []Sum = new int[5];
		
		//2.제목작성
			System.out.println("각 행의 합 출력:   ");
		
		//3. 작성한 행렬 출력
		for(int i=0; i<Num.length;i++) {
			for(int j=0; j<Num[i].length; j++) {
			System.out.print(Num[i][j] + "\t");
		
		//4.각 행의 합 구하기.		
				Sum[i] += Num[i][j];	
			}
		//5.출력문
			System.out.print(i + "행의 합: " + Sum[i]);
			System.out.println(); 
		}
	}
}
