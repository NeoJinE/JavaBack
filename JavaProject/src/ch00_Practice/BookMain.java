package ch00_Practice;


public class BookMain {

	public static void main(String[] args) {
		// Book출력
		
		//1.클래스 호출
		Book b1 = new Book("자바", "홍길동", 1001, 25000);

		//2.메서드 호출
		System.out.println(b1);
		
		//3.가격변경
		b1.setPrice(20000);
		
		//4.변경된 가격 출력
		System.out.println("\n변경가"+ b1.getPrice());
		
		
		
		
	}

}
