package Ch03;
import java.util.Scanner;
public class Ch03_09_LogicalOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//입력된 숫자(정수)가 2 또는 3의 배수인지 확인
		
		//변수선언
		int num;
		
		//숫자 입력받기
		System.out.print("숫자입력: ");
    	num = sc.nextInt();
		
    	//2의배수 또는 3의 배수
		 if(num % 2 ==0 ||num % 3 ==0) 
			 System.out.println(num + "은 2 또는 3의 배수입니다.");
		 else  
			 System.out.println(num + "은 2 또는 3의 배수가 아닙니다."); 
			 
		 System.out.printf("입력한 숫자: %d" , num);
		
		 sc.close();
	}

}
