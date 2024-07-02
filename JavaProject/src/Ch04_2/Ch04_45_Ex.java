package Ch04_2;

public class Ch04_45_Ex {
	public static void main(String[] args) {
		//주어진 문자열이 숫자형인지 확인하는 프로그램
		String value = "12o34"; //주어진 문자열(보통은 사용자 입력 문자열로 유효성 검사를 진행)
		char ch = ' '; //문자 하나하나씩 체크할 것이므로 문자열에서 문자를 한개 받아와 저장 할 때 사용하는 변수.
		boolean isNumber = true; //숫자인지 아닌지 체크 변수로 사용
		
		//주어진 s문자열이 숫자형인지 확인해서 아니면 isNumber를  false로 변경
		//주어진 문자열에 대해서 한문자씩 추출(charAt(idx))한 후 0~9 범위인지 검사~반복문
		//몇번 검사할 것인지(몇문자인지)는 문자열.length() 메서드 반환값이 속성이 결정하게 된다.
		//문자열 idx는 0부터 시작, 반복은 0~문자열.length-1
		
		//코드완성. =>윗쪽 코드에서 주어진 숫자형이면 isNumber값이 true일 것이고, 아니면 false임.
		for(int i=0; i<value.length(); i++) {
			ch = value.charAt(i); //문자열에서 idx별로 한 문자씩 추출
			//숫자형이면: 추출문자가 문자0보다 크거나 같고(&) <=문자9보다 작거나 같다.
			//if(ch < '0' || ch>'9') { //숫자형이 아니면 (||활용 논리식)
			if(!(ch>='0' && ch <='9')) {	//숫자형이 아니면(!(숫자형이면))
				isNumber = false;
				break; //문자가 숫자가 아니라고 판단되면, 나머지 반복은 무의미하므로 반복 종료.
				
			}
		}
		
		
		
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다");
		}
		
		
		
		
		
		
		
		
	}
}
