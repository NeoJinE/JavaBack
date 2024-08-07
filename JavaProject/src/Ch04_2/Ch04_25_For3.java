package Ch04_2;

public class Ch04_25_For3 {
	public static void main(String[] args) {
	//초기식, 증감식이 2개인 경우
	// , 로 구분
	 for(int i=1,j=10; i<=10; i++, j--) {
	 System.out.printf("(%d, %d)\n",i,j);
	}
	System.out.println("============================================");
	
	
	
	//초기식, 조건식(독립적인 조건식 2개를 사용할 수는 없다), 증감식을 2개씩 사용해보자
	// && 연산으로 두 조건을 묶었다.
		int i,j;
		for( i=1, j=10; i<=10 && j>=5; i++, j--) {
		System.out.printf("(%d, %d)\n",i,j);
	}
		System.out.println("i: " + i + "," + "j: " + j);
	
	//초기식, 조건식(독립적인 조건식 2개를 사용할 수는 없다), 증감식을 2개씩 사용해보자
	// || 연산으로 두 조건을 묶었다.
		int i1,j1;
		for( i1=1, j1=10; i1<=10 || j1>=5; i1++, j1--) {
		System.out.printf("(%d, %d)\n",i1,j1);
	}
		System.out.println("i: " + i1 + "," + "j1: " + j1);
		
	}
}
