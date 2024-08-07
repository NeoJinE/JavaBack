package Ch04_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch04_06_NestedIfEx {

	public static void main(String[] args) {
		// 상품번호 & 주문수량 입력받고 주문서 출력하기.
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###");
	
		//기본으로 출력되는 문구.
		System.out.println("************************");
		System.out.println("노트북: 1,200,000원");
		System.out.println("카메라: 400,000원");
		System.out.println("************************");
	
		//변수선언
		String Prd; //상품명
		int Input,PrdQty,Price,Amount; //상품번호, 주문수량, 상품가격, 주문액
		double Discount = 0; //할인액
		double Pay; //총 지불액, 
		
		
		//상품번호를 입력(1 또는 2가 아니면 종료)
		System.out.println("상품번호 입력");
		Input = sc.nextInt();
		
		if(Input ==1 || Input==2){
			Prd = (Input == 1) ? "노트북" : "카메라";
			Price = (Input == 1) ? 1200000 : 400000;
		
		//상품번호가 올바르면, 주문수량 입력받기.	
			System.out.println("주문 수량 입력");
			PrdQty = sc.nextInt();
			
		//주문금액, 할인금액, 지불금액 작성.
			Amount = PrdQty * Price;
			Discount = (Amount >= 1000000) ? Amount * 0.1 : (Amount >= 500000) ? Amount * 0.05 : 0;  
			Pay = Amount - Discount;
			
		//주문서 출력하기(천단위로 구분)	
			System.out.println("***********주문내용*************");
			System.out.println("상품명: " + Prd);
			System.out.println("가격: " + df.format(Price)+ "원");
            System.out.println("주문 수량: " + PrdQty+ "개");
            System.out.println("주문액: " + df.format(Amount)+ "원");
            System.out.println("할인액: " + df.format(Discount)+ "원");
            System.out.println("총지불액: " + df.format(Pay)+ "원");
		
		}else // 상품번호 1 or 2가 아닐시, 종료문. 
		System.out.println("잘못 입력하였습니다. 종료합니다.");
		 sc.close();
	}
}
