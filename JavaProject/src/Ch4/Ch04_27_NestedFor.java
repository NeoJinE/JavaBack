package Ch4;

public class Ch04_27_NestedFor {

	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j + " "); //한번 반복 종료되면 1 2 3 4 5 한 줄이 출력
			} //내부 for문은 총 15번 실행.
			System.out.println(); //내부 for문이 반복이 완료되면, 줄바꿈. => 3번 실행.
		}
	}
}