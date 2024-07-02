package Ch04_2;

public class Ch04_40_Break2 {
	public static void main(String[] args) {
	//중첩 반복일 경우 break의 범위
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3;j++) {//2번 for문
				System.out.println(i + ":" + j);
				if(j==2)
					break; //반복문 안에 break는 반복을 종결함.
				//위 break문이 종결시키는 반복문은? => break문장과 제일 가까운 반복문만 종결.
				///=> 2번 for문만 종료, 1번 for문은 끝까지 실행된다.
			}
			//2번 반복문 종료 이후.
			System.out.println("현재 i: " + i);
		}
		//1번반복문 종료 이후.
		
		//===============================================================
		//명시적으로 바깥쪽 for문을 종결하고자 할 때
		//종료하고자 하는 반복문에 이름(라벨)을 붙이고, break문 다음에 이름을 적어줌.
		Outter: for(int i=1; i<=5; i++) { //1번 for문의 이름=>Outter.
			for(int j=1; j<=3;j++) {//2번 for문
				System.out.println(i + ":" + j);
				if(j==2)
				break Outter;
				//무분별한 라벨링을 통한 break문 사용은 프로그램 효율을 떨어뜨린다.
				//너무 자주 사용하게 되면, 프로그램 로직이 복잡해진다.
					
			}
			//2번 반복문 종료이후
			System.out.println("현재 i: " + i);
		}
		//1번 반복문 종료 이후
	System.out.println("프로그램 실행 종료");
	}
	
}
