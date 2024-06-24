package Ch4;

public class Ch04_17_For1 {

	public static void main(String[] args) {
		//for문 
		//for문에서 선언된 변수는 for 블록 내에서만 사용이 가능하다.
		
		//i는 for문 안에서 선언되었기에, for {}에서만 사용 가능하다.
		for(int i =1; i<=5; i++) { int b ; //지역변수에 해당이 된다.
			System.out.println(i); // 1 ~ 5까지 출력한다. (6이 되면 for문은 종료된다)
		}
		//System.out.println(i); //i의 사용범위를 벗어남 => 에러가 발생한다.
		
		
		//for 반복변수를 for문 밖에서 선언.
		int j;
		for(j=1; j<=5; j++) {
		System.out.println("반복중 j값 " + j);
		}
		System.out.println("for문 종료후 j값 " + j);
		
	}
}