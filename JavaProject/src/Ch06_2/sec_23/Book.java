package Ch06_2.sec_23;

public class Book {

	//1.멤버변수 선언	
	private String bookName;
	private String bookNo;	
	private String bookAuthor;
	private int bookPrice; 
	
	//2.생성자 초기화
	public Book(String bookName,String bookNo,String bookAuthor,int bookPrice) {
	this.bookName = bookName;
	this.bookNo = bookNo;
	this.bookAuthor = bookAuthor;
	this.bookPrice = bookPrice;
	}
	
	//3.Setter getter 메서드 작성
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	//3.toString 메서드로 출력
	@Override
	public String toString() {
		return "제목: " + bookName +"\n"
			 + "번호: " + bookNo +"\n"
			 + "저자: " + bookAuthor +"\n"
			 + "가격: " + bookPrice;
	}

	
	
	
	
	
	
	
}
