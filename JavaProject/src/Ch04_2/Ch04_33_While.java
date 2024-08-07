package Ch04_2;

public class Ch04_33_While {

	public static void main(String[] args) {
		// while문 정리
		
		//while문 기본형식(조건문만 필요)
		
		/*while(true) { //조건이 true일 때 반복, 명시적으로 조건을 true라고 쓰면 무한반복.
			System.out.println("while문 내부입니다.");
		}*/
		boolean res = false;
		while(res) {
			System.out.println("한번도 반복실행하지 않는 코드");
		}// res변수 내용이 변경되면, 반복가능할 수 있음.
		
		
		
		
		
		
		//무한반복 목적이 아니라면,
		//무한반복이 아니라면, 반복의 횟수가 결정되어 있거나
		
		//1~10까지 출력(while문 이용) => 10번 반복
		int i = 1; //초기값
		while(i<=10) { //조건문
			System.out.println(i); //반복 실행할 문장
			i++;//조건을 false로 만들기 위한 코드
		}
		System.out.println("================================");
		
		for(i=1; i<=10; i++) {
			System.out.println(i); //반복 실행할 문장
		}
		
		//while문과 for문 실행 순서까지 동일하게 변환 코드를 작성.
		//(1.조건을 거짓으로 만들거나), 
		//2.또는 반복문을 벗어날 경우를 만들고, break를 이용해서 반복을 종료.(사용자 입력에 의해 반복을 종료할 때)
		//반복 시점이 결정되어 있어야 한다.
		int j = 0; // j변수 생성 및 초기화. => 반복문 종료를 위한 생성 및 초기화코드는 반복 출력 이전에 진행되어야 한다.
		while(true) {
			System.out.println("반복 실행 중 입니다." + j);
			//반복 종료 시점: j의 값이 30보다 커지는 경우 종료
			//무한반복 중에 종료 조건 검사 실행.
			//int j = 30; // j변수 생성 및 초기화. => 반복문 종료를 위한 생성 및 초기화코드는 반복 출력 이전에 진행되어야 한다.
			if(j>30) //j변수 선언 및 값의 초기화 필요. => j가 30초과 시점이 필요.
			break;
			j++;
		}//0~31까지 출력
		//위의 while문이 실행 종료 후 j값은 얼마인가? =>31
		System.out.println(j); 
		
		//----------------------------------------------------------------------------
		int z =0;
		while(z<=30) {
			System.out.println("반복 실행 중 입니다." + z);
			z++;
		} 
		
		//위 while문 코드의 결과가 38라인 무한반복 while문 결과와 동일한가?
		
		//위 코드를 0~31 까지 출력될 수 있도록 수정하시오.
		System.out.println(z); //31이 출력된다.
		
		int h =0;
		while(h<=31) {
			System.out.println("반복 실행 중 입니다." + h);
			h++;
		} 
		System.out.println(h); //31이 출력된다.
		
		//위 코드를 0~31 까지 출력되고, 31일때 반복이 종료되도록 수정 가능한가?
		
		 h =0;
		while(h<32) {
			System.out.println("반복 실행 중 입니다." + h);
			h++;
		} 
		System.out.println(h); //
		
		
		
	}

}
