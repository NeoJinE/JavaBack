package Ch3;

public class Ch03_15_Ex3 {
	public static void main(String[] args) {
		//100의 자리 이하 버리는 코드
		int num =456;
		System.out.println(num / 100 * 100);
		System.out.println(num - num % 100);
		
	}
}
