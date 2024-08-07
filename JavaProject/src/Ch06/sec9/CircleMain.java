package Ch06.sec9;

import java.util.Scanner;

public class CircleMain {
	 public static void main(String[] args) {
	        // Circle 클래스 인스턴스를 생성하고, 반지름을 전달해서 멤버필드에 저장.
	        // 필요시, 원의 넓이를 반환받아 출력하는 프로그램.
	        
	        // 객체 인스턴스 생성
	        Scanner sc = new Scanner(System.in);
	        Circle c = new Circle();
	        
	        // 출력
	        System.out.println("반지름을 입력하시오: ");
	        int radius = sc.nextInt();
	        c.setCircle(radius); // 반지름값이 인스턴스 멤버필드 radius에 저장.
	        
	        // 저장한 반지름값을 이용해서 원의 넓이 계산(메서드 호출)후 반환된 결과 출력
	        System.out.println("원의 넓이: " + c.getArea());
	    }
	}
