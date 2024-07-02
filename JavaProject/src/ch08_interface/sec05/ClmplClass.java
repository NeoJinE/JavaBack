package ch08_interface.sec05;

//구현하는 InterfaceC는 InterfaceA와 InterfaceB를 상속받았음.
//ClmplClass 클래스에서는 InterfaceA,InterfaceB,Interface의 추상메서드 모두 구현해야한다. 
public class ClmplClass implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ClmplClass의 methodA() 실행");
		
	}
	
	
	@Override
	public void methodB() {
		System.out.println("ClmplClass의 methodB() 실행");	
	}

	

	@Override
	public void methodC() {
		System.out.println("ClmplClass의 methodC() 실행");
	}

	
}
