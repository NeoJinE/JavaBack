package Ch4;

public class Ch04_38_Break {
	public static void main(String[] args) {
		//break문에 의해 벗어나는 block범위 => 보통 break문은 반복문 조절을 위해 사용하는게 일반적이다.
		
		int i =0;
		while(true) {//무한반복문.
			i+=3; //i값을 3씩 증가.
			
			if(i>20) {
				break;
				//System.out.println("if block 내 "); //break가 실행시 실행불가.
				
			}
			System.out.println("while문 block 내 "+ i);
		}
		//break; => main{} 내에서는 break를 사용할 수 없다. =>영역 오류가 발생.
		System.out.println("main block 내 ");
	}//main 함수는 }를 만나야 종료되고, 프로그램 종료를 의미.
}

//위 코드에 클래스 {}를 제외 3개의 block이 있음.
//1.if{}
//2.while{}
//3.main{} => main블럭 종료시 프로그램이 종료된다.
//Q.위 코드의 break는 1,2,3번 블록중 몇 번 {}을 종료시키는가? => 1,2번
//=> if{} break 이후, 코드가 있어도, 더이상 실행하지 않는다.
//while{} break 이후, 더이상 실행하지 않는다.
//main{}은 위 코드의 break와는 상관이 없다.