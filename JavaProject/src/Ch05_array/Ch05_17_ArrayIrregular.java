package Ch05_array;

public class Ch05_17_ArrayIrregular {

	public static void main(String[] args) {
		// 가변배열(비정방형배열) : 행은 결정되어 각 행의 원소수는 행마다 다르게 가변설정을 할 수 있다.
		// 가변배열 선언 및 메모리 할당.
		int [][] ar = new int[4][]; //2차원 배열에서 행수는 결정, 행 별 원소수는 결정하지 않았음.
		
		//실행코드에서 각 행에 대한 메모리를 할당(각 행별 원소수를 결정)
		ar[0] = new int[1]; //0번 행의 원소수를 1로 설정.
		ar[1] = new int[2];	//1번 행의 원소수를 2로 설정.
		ar[2] = new int[3];	//2번 행의 원소수를 3로 설정.
		ar[3] = new int[4]; //3번 행의 원소수를 4로 설정.
		
		//가변배열: 초기화 진행하면서, 가변배열 생성.
		char[][] br = {{'a'},{'b','c'},{'d','e','f'}}; //3행 가변배열 생성 및 초기화
		String[][] student = {{"홍길동","학생"},
							  {"성춘향","3학년","영어과"},
							  {"이몽룡","4학년","물리학과","A"}
							  };
		//가변배열 ar에 값을 저장하기 전 출력. => 자동 초기화 확인.(int형이므로, 0으로 초기화)
		for(int i=0; i<ar.length;i++) { //행수만큼 반복
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		//가변 배열 ar에 값을 저장.
		int count = 1;
		for(int i=0; i<ar.length;i++) { //행수만큼 반복
			for(int j=0;j<ar[i].length;j++) {
				ar[i][j] = count++; //count 변수값을 ar[i][j]에 먼저 저장하고, 나중에 그 후에 증가.
			}
		}
		//값을 저장 후 출력.
		for(int i=0; i<ar.length;i++) { //행수만큼 반복
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
		//가변 배열 br값 출력
		for(int i=0; i<br.length;i++) { //행수만큼 반복
			for(int j=0;j<br[i].length;j++) {
				System.out.print(br[i][j] + " ");
			}
			System.out.println();
		}
		
		//가변 배열 students값 출력
		for(int i=0; i<student.length;i++) { //행수만큼 반복
			for(int j=0;j<student[i].length;j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
		
		//가변배열의 length 속성 이용
		System.out.println(student.length); //행수 3
		System.out.println(student[0].length);//열수 2
		System.out.println(student[1].length);//열수 3
		System.out.println(student[2].length);//열수 4
		
		//가변 배열명 출력
		System.out.println(student);//문자열 배열 변수명: [[Ljava.lang.String;@67f89fa3
		System.out.println(student[0]);//문자열 배열 0행: [Ljava.lang.String;@4ac68d3e
		
	}//main 종료
}
