package Ch06_2.sec_10;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.클래스 호출
		
		Rectangle rec = new Rectangle();
		Rectangle rec2 = new Rectangle();
		//2.가로 & 세로길이 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("가로길이: ");
		int width = sc.nextInt();
		System.out.println("세로길이: ");
		int height = sc.nextInt();
		rec.setRectangle(width, height);
		
		//3. 넓이 출력
		System.out.println("사각형의 넓이: " + rec.getArea());
	
		
		System.out.println("가로2길이: ");
		int width2 = sc.nextInt();
		System.out.println("세로2길이: ");
		int height2 = sc.nextInt();
	
	
	System.out.println("멤버필드 저장 없이 바로 계산 후 반환된 연산값: ");
	System.out.println(rec.calcRectangle(width2,height2));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
