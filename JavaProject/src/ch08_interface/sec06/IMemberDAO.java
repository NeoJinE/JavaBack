package ch08_interface.sec06;

import java.util.ArrayList;

public interface IMemberDAO {
	
	//1.추상메서드 선언
	
	//1-1회원등록: 1명의 회원정보를 받아서(매개변수) DB에 저장하고 종료, 반환값은 없다.
	//회원정보표현 클래스: MemberDTO
	public void insertMember(MemberDTO dto);
	
	//1-2.회원정보삭제:회원 ID를 전달받아서(매개변수),
	// DB에서 해당 ID를 삭제하고 종료, 반환값은 없다.
	public void deleteMember(String memId);
	
	//1-3.전체 회원정보 조회:전체회원의 정보를 조회,(매개변수없음)  
	//DB에 회원정보를 저장하는 회원테이블에서 전체 회원 정보를 반환.
	//회원 1명 정보는 (MemberDTO)
	//MemberDTO 객체가 여러개가 있는 형태로 반환이 되어야 한다.
	//배열을 생각할 수 있다. => 배열은 원소수가 고정되어야 하므로, 배열과 비슷하지만, 원소수가 고정되지 않는 Java제공 컬렉션 사용
	//Java제공 컬렉션 => ArrayList => generic을 사용할 수 있다.(generic: 원소타입을 구현하거나 개발자가 정하는 타입으로 설정가능하다)
	public ArrayList<MemberDTO> getAllMemeber();
	
	//1-4.회원정보를 수정: 
	//1명의 수정된 회원정보를 전달받아서(매개변수), DB에 수정&저장하고 종료, 반환값은 없다.
	public void updateMember(MemberDTO dto);
	
	//1-5.회원정보 검색 : 
	//회원의 ID를 전달받아서(매개변수) 해당 ID의 회원정보를(MemberDTO) DB에서 찾아 반환하는 메서드
	public MemberDTO searchMember(String memId);
	
}
