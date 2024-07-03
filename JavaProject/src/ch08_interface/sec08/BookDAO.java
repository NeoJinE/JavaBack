package ch08_interface.sec08;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		// 도서정보 DB에 저장되었다 가정후
		// dto정보 출력해서 확인
		dto.getBookNo();
		System.out.println("==========도서 등록 완료==========");
		System.out.println("도서 번호 : " + dto.getBookNo());
		System.out.println("도서 제목 : " + dto.getBookName());
		System.out.println("저자 : " + dto.getBookAuthor());
		System.out.println("도서 가격 : " + dto.getBookPrice());
		System.out.println("등록 날짜 : " + dto.getBookDate());
		System.out.println("출판사 : " + dto.getBookPublisher());
	}

	@Override
	public ArrayList<BookDTO> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDTO detailBook(String bookNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(String bookNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(BookDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BookDTO> searchBook(String bookAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
