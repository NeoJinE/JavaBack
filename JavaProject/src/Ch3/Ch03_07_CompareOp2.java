package Ch3;

import java.util.Scanner;


public class Ch03_07_CompareOp2 {

	public static void main(String[] args) {
		//사용자에게 비밀번호를 입력받아 두 비밀번호가 입력받은 값이 변수에 저장된 값과 같은지 확인후 결과를 출력.
		Scanner sc = new Scanner(System.in);
		
		String passString = "1234"; 	//이미 저장된 비밀번호
		String userPassingString = "";	//로그인시 입력하는 비밀번호 가정.
		
		System.out.print("비밀번호 입력: ");
		userPassingString = sc.next();
		
		//문자열 비교
		//if~else
		//if(passString == userPassingString)//문자열 비교조건이 다른 문장에 영향을 주면 =>  == 는 사용하지 않는다.
		if(passString.equals(userPassingString))
			System.out.println("Pass");
		else 
			System.out.println("No Pass");
			
		sc.close();
	}

}
