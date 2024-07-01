package Ch06_2.sec_15;

import java.util.Scanner;

public class MemberMainT {
	public static void main(String[] args) {
		//변수 및 인스턴스 영역
		String name, yn, phoneNumber;
		int age;
		Scanner sc = new Scanner(System.in);
		Member member ;
		
		//-- 입력 영역 ---
		System.out.println("********회원 정보 입력********");
		System.out.print("이름 입력: ");	
		name = sc.next();
		System.out.print("전화번호 입력: ");	
		phoneNumber = sc.next();
		System.out.print("나이 입력: ");	
		age = sc.nextInt();
		System.out.print("운동복 대여 여부 입력: ");	
		yn = sc.next();
		
		//-- 인스턴스 생성
		member = new Member(name, yn, phoneNumber, age);
		
		// -- 인스턴스 사용
		member.infoMember();
		
		System.out.println("회원이름 : " + member.getMemberName());
		
		sc.close();
	}
}





