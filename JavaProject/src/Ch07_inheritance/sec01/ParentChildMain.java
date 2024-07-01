package Ch07_inheritance.sec01;

public class ParentChildMain {

	public static void main(String[] args) {
		// 자식클래스 객체 생성.
		Child cb1 = new Child();
		

		//자식클래스 객체 사용
		cb1.setChild(); //child 클래스 메서드
		cb1.showChild();//child 클래스 메서드
		cb1.setParent();//부모 클래스 메서드 호출=>상속받았음
		cb1.showParent();//부모 클래스 메서드 호출=>상속받았음.
		
		//cb1.p = 10; //Parent 클래스의 p멤버필드는 private로 되어있어 (상속이 불가능하다.)
		
		//부모 클래스 객체 생성
		Parent pb1 = new Parent();
		pb1.setParent();
		pb1.showParent();
		
		//pb1.setChild(); //부모클래스는 상속해주기만 하므로, 자식클래스와는 완전 별개이다.
		//pb1.p =50;		//private이기 때문에 접근이 불가능하다.
		
		
		
		
		
	}

}
