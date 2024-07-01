package Ch06.sec4;

public class RectangleMain {

	public static void main(String[] args) {
		// 사각형의 가로길이와 세로길이를 입력 받아서 넓이를 구하여 출력하는 프로그램.

		//1.클래스 선언
		Rectangle area = new Rectangle();
		
		//2.가로&세로길이 입력메서드 호출
		area.setRectangle();
		
		//3.사각형 넓이 출력메서드 호출
		area.showRectangle();
	}

}
