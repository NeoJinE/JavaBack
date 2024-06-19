package ch02;

public class Ch02_05_Literal {

	public static void main(String[] args) {
		//변수에 저장되는 실제 값 자체:리터럴
		int score = 95;
		double average = 88.5;
		char familyName = '김'; //문자 리터럴
		String lastName = "홍"; //문자열 리러털
		boolean result = true;	//논리 리터럴
		
		
		System.out.println(score);
		System.out.println(average);
		System.out.println(familyName);
		System.out.println(lastName);
		System.out.println(result);
		System.out.println(100);// 100: 정수 리터럴 
		System.out.println("score");// score: 문자열 리터럴
		
	}//main 메서드 종료시점. => (메인메서드 내 블럭 내에서 선언된 모든 변수는 메모리에서 지워진다)

}
