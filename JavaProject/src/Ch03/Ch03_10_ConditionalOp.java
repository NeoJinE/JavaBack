package Ch03;

public class Ch03_10_ConditionalOp {
	public static void main(String[] args) {
		//삼항연산자(조건연산자)=> (조건식) ? (조건식 참일때) : (조건식 거짓일때)
		
		//저장된 점수가 60점을 넘으면 pass, 그렇지 않으면 fail.
		//1.if문
		int score = 80;
		if(score>60)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		
		//2. 삼항연산자
		System.out.println((score>60) ? "Pass": "Fail");
		String reString = (score>60) ? "Pass": "Fail";
		System.out.println(reString);
		//if~ => ((score>60) ? "Pass"), 
		//else if~ => ((score>40) ? "Fail") 
		//else => ("X") 구조와 동일하다.
		System.out.println((score>60) ? "Pass": (score>40) ? "Fail" : "X");
			
		
		
		
	}
}
