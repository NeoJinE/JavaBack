package Ch3;
import java.util.Scanner;
public class Ch03_11_ConditionalOpEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//점수 입력 받아서 결과 출력
		
		//변수선언
		int Score;
		char Grade;
		
		//점수입력받기
		System.out.print("점수입력: ");
		Score = sc.nextInt();
		
		//점수에 따른 등급출력
		Grade = (Score >= 90) ? 'A' : (Score >= 80) ? 'B' : 'C';
		System.out.println(Score + "점은" + Grade + "등급입니다");
		
		
		sc.close();
	}
}
