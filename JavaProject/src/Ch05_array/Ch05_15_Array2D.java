package Ch05_array;

public class Ch05_15_Array2D {

	public static void main(String[] args) {
		// 2차원 배열의 정리.
		//2차원 배열 선언 및 초기화
		
		int[][] score = {
						{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50}};
		double[][] scores=new double[5][3];

		//2차원 배열 score의 원소 값 출력
		//score.length => score 2차원 배열의 행의 수를 의미한다.
		for(int i=0; i<score.length;i++) {
			//각 행의 원소수만큼 반복
			for(int j=0; j<score[i].length;j++) {
				System.out.printf("score[%d][%d]=%d\n",i,j,score[i][j]);
			}
		}
		//2차원 테이블 형태로 원소 값 출력.
		for(int i=0; i<score.length;i++) {
			//각 행의 원소수만큼 반복
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j] + "\t");//각 원소의 값, \t는 탭문자.
			}
			System.out.println();
		}	
	
		//2차원 배열의 length값
		System.out.println("score.length(행의수): " + score.length);
		System.out.println("score[0].length(0행의 열의수): " + score[0].length);
		System.out.println("score[1].length(1행의 열의수): " + score[1].length);
		
		//배열명 출력:가상주소출력
		//1차원 주소 => [데이터타입@메모리 가상주소 [I@19dfb72a: 1차원 정수형 배열의 시작주소.
		//2차원 주소 => [[데이터타입@메모리 가상주소 [[I@57829d67: 2차원 정수형 배열의 시작주소.
		System.out.println(score); //[[I@57829d67
		System.out.println(score[0]); //[I@19dfb72a
		
		//더블형 배열 변수 : scores =>(0.0으로 자동 초기화)
		for(int i=0; i<scores.length;i++) {
			//각 행의 원소수만큼 반복
			for(int j=0; j<scores[i].length;j++) {
				System.out.print(scores[i][j] + "\t");//각 원소의 값, \t는 탭문자.
			}
			System.out.println();
		}	//더블형 배열 변수명과 행 idx를 출력
		System.out.println(scores);//[[D@17c68925: 더블형 배열변수 이므로 [[D
		System.out.println(scores[0]);//[D@7e0ea639: 더블형 배열변수이므로 [D
			
	
	
	
	
	
	
	}
}
