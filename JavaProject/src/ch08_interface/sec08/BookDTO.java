package ch08_interface.sec08;

public class BookDTO { //Data Transfer Object
	//1.멤버필드: DB에 저장될 Book의 정보
	private String bookNo; //도서를 유일하게 구별하게 해주는 정보, 중복값이 없는 정보
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private String bookDate; //문자열로 구성한 후에 DB에서 날짜형식으로 변경해서 사용
//	private Date bookDate2;//날짜 형식으로 구성해서 DB에 전달
	private int bookPrice;
	
	
	//2.기본 생성자 함수
	public BookDTO() { 
		
	}
	
	//3.생성자 오버로딩(매개변수가 있는 생성자함수)
	public BookDTO(String bookNo, String bookName, String bookAuthor, int bookPrice, String bookDate,
			String bookPublisher) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
		this.bookPublisher = bookPublisher;
	}

	//4.getter & setter
	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public String getBookDate() {
		return bookDate;
	}

	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
}
