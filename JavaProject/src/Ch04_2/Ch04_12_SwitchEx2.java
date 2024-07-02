package Ch04_2;

import java.util.Scanner;

public class Ch04_12_SwitchEx2 {

	public static void main(String[] args) {
		// 주민등록번호를 입력받고, 성별번호로 성별 구분하기
		
		Scanner sc = new Scanner(System.in);
		//변수선언
		String regNum;
		char GenNum = '0';
		String Gender="";
		
		//주민번호 입력
		System.out.println("주민번호 입력");
		regNum = sc.next();
		if(regNum.length() == 14) {
		GenNum = regNum.charAt(7);
		
		//성별 번호에 따른 성별 출력
		switch (GenNum) {
		case '1':
		case '3':	
			Gender = "남";
			break;
		
		case '2':
		case '4':
			Gender = "여";
			break;
		
		default:
			System.out.println("유효하지않은 주민등록번호입니다.");
			break;
		}
		
		System.out.println(Gender);	
		
		}else//주민번호 형식이 아닐시 출력
			System.out.println("유효하지않은 주민등록번호입니다.");
		sc.close();
	}

}
