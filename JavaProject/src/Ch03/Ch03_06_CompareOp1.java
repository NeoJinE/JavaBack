package Ch03;

public class Ch03_06_CompareOp1 {

	public static void main(String[] args) {
		//비교는(관계)연산자
		int n1,n2;
		n1 = 10;
		n2 = 20;

		boolean res = (n1 == n2);
		System.out.println(res);//false
		
		boolean res2 = (n1 != n2);
		System.out.println(res2);//true
	
		char ch1,ch2,ch3,ch4;
		ch1='Z';
		ch2='C';
		
		boolean res3 = (ch1 == ch2);//영문자인 경우, 아스키코드값을 비교해서, 같으면 true, 다르면 false를 출력
		System.out.println(res3); //false
		
		ch3='가';
		ch4='가';
		
		boolean res4 = (ch3 == ch4);//한글인 경우, 유니코드값을 비교해서, 같으면 true, 다르면 false를 출력
		System.out.println(res4); //true
		
		//문자열 객체에 대해서 비교연산자 == 사용. => 비교연산 진행은 가능하다.
		String str1,str2,str3,str4;
		str1 = "가";
		str2 = "가";
	
		boolean res5 = (str1 == str2);//
		System.out.println(res5); //
		
		
		
		
		
		
	}
	

}
