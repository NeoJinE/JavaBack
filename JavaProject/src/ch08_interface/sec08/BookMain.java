package ch08_interface.sec08;

public class BookMain {

	public static void main(String[] args) {
		// 인스턴스 생성시, 필드 초기화
		BookDTO dto = new BookDTO("1234567a", "어린왕자", "아무개", 15000, "2021-01-01", "동아출판");
		BookDAO dao = new BookDAO();
		
		dao.insertBook(dto);
		
		
		
		
		
		
		
		
		
		
		
	}

}
