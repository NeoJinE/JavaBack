package Ch4;

public class Ch04_41_continue {
	public static void main(String[] args) {
		// continue 문장 이후의 문장을 실행하지 않고, 다음 반복을 진행하러 반복 선언문(for/while)으로 올라간다.
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {//홀수인 경우.
				System.out.println("홀수"); //홀수일 경우만 실행된다.
			}
			System.out.println(i); //홀수 or 짝수건 모두 실행되는 문장.
			
		}	
		System.out.println("-------------홀수일때 continue사용---------------");
		for(int i=1;i<=10;i++) {
			
			if(i%2 !=0) {//홀수인 경우.
				System.out.println("continue문으로 인해, 홀수값은 출력되지 않는다."); //홀수일 경우만 실행된다.
				continue;
			}
			System.out.println(i);
			
		}
	
	}
}
