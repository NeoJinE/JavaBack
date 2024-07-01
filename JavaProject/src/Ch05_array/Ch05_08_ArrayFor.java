package Ch05_array;

public class Ch05_08_ArrayFor {

	public static void main(String[] args) {
		// 향상된 for문
		//for(타입 변수명:배열명){} => 해당 배열 원소를 모두 순회하면서, 변수에 원소 하나씩 저장.
		int[]scores = {95,71,84,93,89};
		int sum = 0;

		//scores 원소 각각 출력
		for(int score: scores) {
			System.out.print(score +" ");
		}
		//scores 배열의 모든 원소 값의 총 합
		for(int score: scores) {
			sum+=score;
		}
		System.out.printf("\n총점: %d",sum);
	}
}
