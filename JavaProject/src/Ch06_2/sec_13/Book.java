package Ch06_2.sec_13;

public class Book {
	
	//1.멤버변수선언
	int bookNo;
	int bookPrice;
	String bookName;
	String bookAuthor;

	//2.(메서드작성 멤버변수에 값 저장)
	public Book(int No, int Price, String Name, String Author) {
		//this는 멤버필드의 멤버변수(인스턴스)를 가리킨다(참조한다). => 
		//=> this.(멤버변수) = 매개변수 로 작성해서 매개변수 값을 선언한다.
		//클래스 설계시 this를 사용하면, 클래스 자신을 가리키게 된다.
		//생성자를 명시적으로 하나 만들면, 인스턴스 생성할 때 반드시 아래와 같은 매개변수에 인수를 전달해줘야 한다.
		this.bookNo = No; //=> this는 클래스 Book을 가리키게 되므로, No 라는 변수 클래스 Book의 멤버필드를 가리키게 된다.
		this.bookPrice =Price;
		this.bookName = Name;
		this.bookAuthor =Author;
	}
	
	//3.(메서드작성2 멤버변수의 값 출력)
	public void showBookInfo() {
		System.out.println("도서번호: " + bookNo);
        System.out.println("도서명: " + bookName);
        System.out.println("저자: " + bookAuthor);
        System.out.println("가격: " + bookPrice);
	}
}
