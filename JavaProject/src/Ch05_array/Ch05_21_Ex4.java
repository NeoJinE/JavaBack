package Ch05_array;

public class Ch05_21_Ex4 {

	public static void main(String[] args) {
		// 거스름돈에 대한 동전 갯수 출력 프로그램
		// 큰 금액의 동전을 우선적으로 거슬러줘야 한다.
		int [] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money" + money);
		for(int i=0; i<coinUnit.length; i++) {
			//한 종류의 동전의 수 결정하는 연산
		int change = money / coinUnit[i]; //각 동전별로 거슬러줘야 하는 거스름돈 갯수
		money= money % coinUnit[i]; //거스름돈으로 계산된 값을 제외한 나머지
		System.out.printf("%d원: %d원\n",coinUnit[i],change);//동전 종류와 갯수 출력
		}

	}

}
