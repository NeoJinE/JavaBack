package Ch06.sec3;

public class BookMain {
	public static void main(String[]args){
		//1.Book 클래스 생성
		Book Info = new Book();
		
		//2.setBookInfo메서드 호출, 값저장
		Info.setBookInfo();
		
		//3.showBookInfo메서드 호출, 값호출
		Info.showBookInfo();
	}
}
