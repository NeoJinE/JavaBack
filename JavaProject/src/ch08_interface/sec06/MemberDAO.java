package ch08_interface.sec06;

import java.util.ArrayList;

//(Data Access Object)
//Service와 DB를 연결하는 역할을 하며, 
//실제로 DB에 접근하여 data를 삽입, 삭제, 조회, 수정 등 CRUD 기능을 수행
//DB연결 코드와 DB 통신 코드가 각 메서드에 표현되어 있어야 하지만, 
//DB 사용중이 아니므로, 회원가입 메서드에서만 전달된 데이터(정보)가 제대로 전달 후 출력이 되는지만을 체크
public class MemberDAO implements IMemberDAO {
	//1.추상메서드 구현
	@Override
	public void insertMember(MemberDTO dto) {
		// 전달받은 회원정보를 DB에 저장했다 가정하고,
		// 전달받은 회원정보를 출력(연습용) : Getter가 사용되고 있는지를 확인.
		System.out.println("회원 가입 성공");
		System.out.println("ID: " + dto.getMemID());
		System.out.println("Pass: " + dto.getMemPass());
		System.out.println("성명: " + dto.getMemName());
		System.out.println("전화번호: " + dto.getMemHP());
		System.out.println("주소: " + dto.getMemAddress());
	}

	@Override
	public void deleteMember(String memId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MemberDTO> getAllMemeber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO searchMember(String memId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
