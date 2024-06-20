package Ch3;
import java.util.Scanner;
import java.text.DecimalFormat; //출력시 소숫점이하 2자리
public class Ch03_03_ArithmeticOpEx1{

    public static void main(String[] args) {
    	//세과목 점수 입력받아 총점과 평균 출력하는 프로그램.
    	Scanner sc = new Scanner(System.in);
    	//변수선언
    	int Kor, Eng, Math, Total;
    	double Average;
    	
    	System.out.print("국어점수 입력: ");
    	Kor = sc.nextInt();
    	System.out.print("영어점수 입력: ");
    	Eng = sc.nextInt();
    	System.out.print("수학점수 입력: ");
    	Math = sc.nextInt();
    	System.out.println("--------------");
    	
    	Total = Kor + Eng + Math; // 나눗셈 결과 정수
    	//Average = Total/3;
    	Average = Total/3.0;	//나눗셈 결과 실수.
    	//소숫점 이하 두자리수로 조정.
    	
    	DecimalFormat df = new DecimalFormat("0.00"); 
    	
    	System.out.println("총점: " + Total);
    	System.out.println("평균: " + df.format(Average));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		/*
		 * System.out.print("국어 점수 입력: "); int Kor = sc.nextInt();
		 * 
		 * System.out.print("영어 점수 입력: "); int Eng = sc.nextInt();
		 * 
		 * System.out.print("수학 점수 입력: "); int Math = sc.nextInt();
		 * 
		 * double Total = Kor + Eng + Math; double Average = Total / 3;
		 * 
		 * 
		 * System.out.println("총점: " + Total); System.out.printf("평균: %10f",+ Average);
		 */
    	sc.close();
    }
}

		
		

		
		
	
