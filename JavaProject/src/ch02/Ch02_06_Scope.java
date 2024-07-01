package Ch02;

public class Ch02_06_Scope {
	//클래스 내부 변수 선언.
	int a = 10; // 일반변수.
	//메서드 추가
	public void showName() {
		//System.out.println(name); //name변수는 사용 불가 => name변수는 이 프로그램 내에서는 main()내에서만 선언함  
		//사용범위가 main{}안인데 => showName{}안에서 사용하고 있으므로, 오류 발생.
		//엄밀히 현재 메서드 블럭내에서 선언하지 않았으므로, 사용불가능.
		//System.out.println(addr); //변수의 사용보다 선언을 늦게 하고 있어서 오류가 발생한다.
		int addr ;
		addr = 10; //블럭 내에서 선언했기 때문에 사용가능.
		System.out.println("상위블럭 변수 a의 값은?: " + a);//상위 블럭에서 선언하고 초기화 한 변수: 사용가능.(현재 코드 블럭이 클래스 코드 블럭 내 있기때문)
	}
	public static void main(String[] args) {
		String name = "홍길동"; //main() 메서드 내에서 선언된 지역 변수. => main() 메서드 안에서만 사용가능
		System.out.println(name);
		//main 메서드도 클래스 내부에 포함된 블럭이므로, 클래스 변수 a를 사용해보면,  
		System.out.println("상위블럭 변수 a의 값은?: " + a);  
		//오류가 발생.=> main 메서드는 static 메서드 임.
		// static 메서드 내에서 다른 블럭(상위블럭 포함)의 변수를 참조시, 해당 블럭이 static이어야 한다.
		//변수 a가 선언된 class는 static이 아니고, 변수도 static이 아니므로, main메서드 내에서는 참조 불가능.
	}

}
