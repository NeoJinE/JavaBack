package ch04;
import java.util.Scanner;
public class ch04_12_SwitchEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sinNo; //주민번호 입력받을 변수(문자열로 생성-주민번호는 문자열 처리해야 하는 데이터)

		System.out.print("주민번호 입력: ");
		sinNo = sc.next();
		
		switch (sinNo.charAt(7)) {//한개의 문자를 추출
		case '1': 
		case '3': 
			System.out.println("남성입니다.");
			break;
		case '2': 
		case '4': 
			System.out.println("여성입니다.");
			break;	
		default:
			System.out.println("여성입니다.");
			break;
		}
		
		sc.close();
	}

}
