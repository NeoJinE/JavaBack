package ch02;
import java.util.Scanner;
public class Ch02_17_InputEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력: ");
		String Name = sc.next();
		System.out.println("학년입력: ");
		int Year = sc.nextInt();
		System.out.println("점수입력: ");
		double Score = sc.nextDouble();
		System.out.println("학점입력: ");
		String Grade = sc.next();
		System.out.println("--------------");
		
		
		System.out.println();
		System.out.println(Name);
		System.out.println(Year);
		System.out.println(Score);
		System.out.println(Grade);
		
		sc.close();
		
		
	}
}
