package ch08_interface.sec05;

public class MultiExtendsInterfaceMain {

	public static void main(String[] args) {
		//1.구현클래스 객체
		ClmplClass c = new ClmplClass();
		
		InterfaceA ia = c;
		ia.methodA(); //InterfaceA의 메서드만 사용가능
		
		InterfaceB ib = c;//InterfaceB의 메서드만 사용가능
		ib.methodB();
		
		//자식 인터페이스로, 부모 인터페이스 2개 존재
		
		InterfaceC ic = c;ic.methodA();
		ic.methodB();
		ic.methodC();
		
		//구현한 모든 메서드 사용 가능
		c.methodA();
		c.methodB();
		c.methodC();
		
		
	}

}
