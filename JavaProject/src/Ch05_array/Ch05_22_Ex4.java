package Ch05_array;

public class Ch05_22_Ex4 {

	public static void main(String[] args) {
		// 2차원 배열 모든 원소의 합과 평균을 구하는 프로그램: 원소의 갯수를 확인하는 연산
		int[][] arr ={ 
				{ 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 }, 
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 } };

		int total = 0;
		double average = 0;

		//배열 원소의 총 합을 구하는 연산 코드
		for(int i=0;i<arr.length;i++) {//배열의 행을 담당
			for(int j=0; j<arr[i].length;j++) {//행의 각 원소 담당
				total+=arr[i][j];
			}
		}
		
		//평균을 구하는 코드
		average = (double)total/(arr.length * arr[0].length);
		//2차원 정방형 배열의 총 원소의 갯수는=> 배열의 행수 * 배열의 열수.
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);

	}

}
