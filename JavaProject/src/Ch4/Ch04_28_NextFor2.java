package Ch4;

public class Ch04_28_NextFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) { //j의 조건은 i값에 종속.
				System.out.print(j + " "); //한번 반복 종료되면 1부터 i 값까지 출력.
			} //내부 for문의 실행수는 현재 i값에 의해 변경되게 됨.
			System.out.println(); //내부 for문이 반복이 완료되면, 줄바꿈. => 5번 실행.
		}
	}

}
