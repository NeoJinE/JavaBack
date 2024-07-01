package Ch06.sec5;

import java.util.Scanner;

public class Student {
	//1.멤버변수선언
	int stdNo;
	String stdName;
	int stdYear;
	int stdScore;
	
	//2.메서드 작성1.(학생정보를 입력받는 메서드)
	public void inputStdInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("****학생 정보 입력****");
		System.out.println("학번");
		stdNo=sc.nextInt();
		System.out.println("성명");
		stdName = sc.next();
		System.out.println("학년");
		stdYear=sc.nextInt();
		System.out.println("점수");
		stdScore=sc.nextInt();	
		sc.close();
	}
	//3.메서드 작성2.(입력받은 학생정보를 출력하는 메서드)
	public void showStdInfo() {
		System.out.println("\n****학생 정보 입력****");
		System.out.println("학번: "+stdNo);
		System.out.println("성명: "+stdName);
		System.out.println("학년: "+stdYear);
		System.out.println("점수: "+stdScore);
	}
}
