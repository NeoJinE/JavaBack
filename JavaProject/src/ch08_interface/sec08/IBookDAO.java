package ch08_interface.sec08;

import java.util.ArrayList;

public interface IBookDAO {
	//도서관리 프로그램에서 필수적(DB)으로 구성해야 할 메서드를 결정
	//추상메서드 선언 
	
	//1. 도서 등록
	public void insertBook(BookDTO dto);
	//2. 전체 도서 정보 조회 : 여러 도서 반환
	public ArrayList<BookDTO> getAllBook();
	//3. 상세 도서 조회 : 1권의 도서 정보 반환
	public BookDTO detailBook(String bookNo);
	//4. 도서 정보 삭제 : 1권 도서 삭제
	public void deleteBook(String bookNo);
	//5. 도서 정보 수정 : 수정할 정보가 저장된 한권 도서의 전체정보
	public void updateBook(BookDTO dto);
	//6. 도서 검색(저장로 검색) => 여러 도서 반환
	public ArrayList<BookDTO> searchBook(String bookAuthor);

}
