package Ch06.sec4;

import java.util.Scanner;

public class Rectangle {

	//1.변수선언
	int width;
	int height;
	int Area;
	
	//2.메서드생성 (가로&세로길이 입력받기)
	public void setRectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로길이입력");
		width = sc.nextInt();
		System.out.println("세로길이입력");
		height= sc.nextInt();
		Area = width * height;
		sc.close();
	}
	
	//3.메서드생성 (넓이호출)
	public void showRectangle() {
		System.out.println("사각형의 넓이: " + Area);
	}
	
}