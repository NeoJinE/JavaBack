package ch08_interface.sec02;

public interface ITestinterface {
	//메서드 추가 => 인터페이스에서 선언부만 설정하면, 무조건 추상메서드. (하위클래스가 구현해야 동작한다)
	//컴파일러가 컴파일 할 때 public abstract를 자동으로 추가
	public abstract void show(); //추상메서드 형태
	abstract void show2(); //디폴트 접근 제한 추상 메서드 형태 => 디폴트 접근제한으로 해석하지 않는다.
	public void show3(); //일반 메서드 형태
	void show4(); // 디폴트 일반 메서드 형태 => 디폴트 접근제한으로 해석하지 않는다.
}
