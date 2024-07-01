package Ch06_2.sec_15;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		//회원관리 프로그램
		Scanner sc = new Scanner(System.in);
		Member info = new Member(null, null, 0, 0);
		info.infoMember(sc);
		info.showMember();
	}

}
