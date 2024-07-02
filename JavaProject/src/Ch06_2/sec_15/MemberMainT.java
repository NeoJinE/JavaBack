package ch06_class.sec15;

public class Member {
	//멤버필드 영역--------------------------
	private String name;
	private String yn;
	private String phoneNumber;
	private int age;
	
	//생성자 영역------------------------------
	//1개의 생성자만 구성 : 인스턴스 생성 시 반드시 4개 인수(앞 3개는 문자열, 마지막 1개는 정수)가 전달되어야 함
	public Member(String name,String yn,String phoneNumber,int age) {
		this.name = name ; 
		this.yn = yn;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	//멤버 메소드 영역
	public void infoMember() {
		System.out.println("********회원 정보 출력********");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("나이 : " + age);
		System.out.println("운동복 대여 여부 : " + yn);		
	}
	
	public String getMemberName() {
		return name;
	}
	
	//전체 필드 값을 반환하려면 필드값을 배열등의 저장소에 담아서 반환해야 함
	//필드의 형태가 여러개 (String, int) : 여러 종류의 데이터를 담을 수 있는 기능이 있어야 함(콜렉션)
	
}





