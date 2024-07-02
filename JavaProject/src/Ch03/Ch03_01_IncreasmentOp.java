package Ch03;

public class Ch03_01_IncreasmentOp {

	public static void main(String[] args) {
		//증가감 연산자: ++, -- 해당되는 증가감 연산자
		//증가감 연산자만 있는 경우, 
		//연산자는 변수 앞/뒤 어디든 위치해도 결과는 동일.
		
		int x = 10;
		++x;
		System.out.println(x);
		
		int y = 10;
		y++;
		System.out.println(y);
		System.out.println("----------------------");
		
		//증가감 연산자와 다른 연산자가 연산식에 혼용되어 있을 때
		int a = 1;
		int b = 1;
		
		b = a++;	//a변수의 값을 먼저 b에 저장하고, 후에 a변수의 값을 1증가시킨다.
		System.out.println(b);	//1
		System.out.println(a);	//2
		System.out.println("----------------------");
		
		a = 1;
		b = 1;
		
		b = ++a;	//a변수의 값을 먼저 증가 시켜, a에 저장 그 후에 저장된 a의 값을 b에 저장
		System.out.println(b);	//2
		System.out.println(a);	//2
		System.out.println("----------------------");
		
		
		a = 1;
		b = 1;
		//a변수의 값을 1증가시켜 b변수에 저장하는 코드
		//결과 a변수와 b변수의 값은 동일해야 함.
		b = ++a;
		
		a = 1;
		b = 1;
		
		//a변수 값에 10을 더하고, 그 값을 b에 저장하시오.(b = 11)
		//a변수는 현재값에 1이 증가된 값을 저장 할 것(a = 2)
		
		//b=a+10;
		//b=a+1; => a++/++a를 이용
		//위 코드를 한줄코드로 재배치.
		
		b = ++a + 10; //더하기 연산전, a값을 1증가 => a에 1증가값 저장 => 증가값에 10을 더한 값을 b에 저장.
					  //계산순서:1.a에 1증가 => 2.10 더하기. =>3.b에 2+10값 저장
		System.out.println(b); //12
		System.out.println(a); //2
		System.out.println("----------------------");
		
		a = 1;
		b = 1;
		
		//a변수 값에 10을 더하고, 그 값을 b에 저장하시오.(b = 11)
		//a변수는 현재값에 1이 증가된 값을 저장 할 것(a = 2)
		
		//b=a+10;
		//b=a+1; => a++/++a를 이용
		//위 코드를 한줄코드로 재배치.
		
		b = a++ + 10; //a변수값을 증가하기 전에 현재a변수의 저장값(1)과 10을 더함 => 더한값을 b에 저장 => 후에 a변수값을 증가시켜 저장.
					  //계산순서:1. a변수 저장값(1)+10 실행 => b변수에 1+10값 저장 => 후에 a변수에 ++를 증가시켜 저장. 
		System.out.println(b); //11
		System.out.println(a); //2
		System.out.println("----------------------");
		
		//부호연산자의 변수 대응 연산 산출 타입은 int
		short s =100;
		short t =-100;
		System.out.println(s);
		System.out.println(t);
		
		//short res = -s; //Type mismatch: cannot convert from int to short
		//부호 연산자를 변수에 사용 후 결과(int)를 short에 저장하면, 에러가 발생한다. 
		
		
		
	}

}
