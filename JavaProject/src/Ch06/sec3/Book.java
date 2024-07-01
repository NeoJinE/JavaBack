package Ch06.sec3;

public class Book {
	//1.멤버변수선언
	int bookNo;
	int bookPrice;
	String bookName;
	String bookAuthor;

	//2.(메서드작성 멤버변수에 값 저장)
	public void setBookInfo() {
		bookNo = 1001;
		bookPrice = 20000;
		bookName = "자바";
		bookAuthor = "홍길동";
	}
	//3.(메서드작성2 멤버변수의 값 출력)
	public void showBookInfo() {
		System.out.println("도서번호: " + bookNo);
        System.out.println("도서명: " + bookName);
        System.out.println("저자: " + bookAuthor);
        System.out.println("가격: " + bookPrice);
	}
	
}
