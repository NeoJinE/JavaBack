package Ch05_array;

public class Ch05_19_Ex2 {

	public static void main(String[] args) {
		// 2차원 배열을 사용하여 각 과목 점수와 총점, 평균을 출력하는 프로그램
		//1.변수&배열선언
		int[][]scores = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int [] total = {0,0,0}; //누적변수 반복문 이전에 선언 및 초기화, 과목별(열별) 총 합계저장.
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");
		
		//배열내용 출력하고 형별 총점과 평균 계산 후 출력, 배열의 열별 합계 계산.
		for(int i=0;i<scores.length;i++) {//2차원배열의 행을 담당.
			int sum=0;
			System.out.printf("%d\t",i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("%d\t",scores[i][j]); //한과목의 점수를 출력
				sum+=scores[i][j]; //한 행의 점수 총합계를 구하는 연산. => 행별 종료
				total[j]+=scores[i][j]; //과목별(열별) 총점을 구하는 연산. => 전체 연산이 끝나야 종료
			}
			System.out.printf("%d\t%.1f\t",sum,(double)sum/scores[i].length);
			System.out.println();
			
		}
		System.out.println("==========================================");
		System.out.println("총점\t");
		
		//배열 열별 합계를 출력.
		for(int k=0;k<total.length;k++) {
			System.out.printf("%d\t",total[k]);
		}
		
		
		
		//배열 열별 합
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String[]Sub = {"번호","국어","영어","수학","총점","평균"};
		double[][]Score= {//5행6열
				{1,100,100,100,300,100.0},
				{2,20,20,20,60,20.0},
				{3,30,30,30,90,30.0},
				{4,40,40,40,120,40.0},
				{5,50,50,50,150,50.0},
					
		};
		int KorTotal=0,EngTotal=0,MathTotal=0;
		
		//2.Sub배열 출력.
		for(int i=0; i<Sub.length;i++) {
			System.out.print(Sub[i]+"\t");		
		}
		System.out.println("\n===============================================");
		//3.Score 행렬 출력.
		for(int i=0;i<Score.length;i++) {
			for(int j=0;j<Score[i].length;j++){
			System.out.print(Score[i][j]+"\t");	
			}
			System.out.println();
		}
		//4.과목별 총점 출력
		for(int i=0;i<Score.length;i++) {
			KorTotal+=Score[i][1];
			EngTotal+=Score[i][2];
			MathTotal+=Score[i][3];
		}
		System.out.print("총점:\t"+KorTotal+"\t"+EngTotal+"\t"+MathTotal);
		*/}
}
