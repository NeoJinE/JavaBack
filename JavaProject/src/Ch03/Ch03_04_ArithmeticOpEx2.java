package Ch03;
import java.util.Scanner;
public class Ch03_04_ArithmeticOpEx2 {
	public static void main(String[] args) {
		//초를 입력받아서 시간,분,초로 나누어서 출력
		//xxxx초는 x시간 x분 x초입니다.
		Scanner sc = new Scanner(System.in);
		//변수선언.
		int Input,Hours,Minutes,Seconds,RestTime;
		
		System.out.print("시간입력(초): ");
		 Input = sc.nextInt();
		
			/*
			 * Hours = Input / 3600; Minutes = (Input%3600)/60; Seconds = Input % 60;
			 */
		
			 Hours = Input / 3600; 
			 RestTime = Input % 3600; 
			 Minutes = RestTime / 60;
			 Seconds = RestTime % 60;
			 
		
		System.out.println(Input + "초는" + Hours + "시간," + Minutes + "분," + Seconds + "초입니다" );
		sc.close();
	}
}
