package Ch06.sec6;

import java.security.PublicKey;
import java.util.Scanner;

public class Product {
	//1.멤버필드:private멤버변수선언 => 이 멤버 필드에 값을 저장하거나 접근하기 위해서는 내부 메서드를 이용해야 한다.
	private String prdName;
	private int prdPrice;
	private int prdStock;
	private int prdSold;
	
	//2.멤버메서드작성(상품정보를 입력받기) => 입력만 받는다
	public void inputProduct(){
		Scanner sc = new Scanner(System.in);
		System.out.println("****상품정보입력****");
		System.out.println("상품명");
		prdName = sc.next();
		System.out.println("가격");
		prdPrice = sc.nextInt();
		System.out.println("판매수량");
		prdStock = sc.nextInt();
		System.out.println("재고수량");
		prdSold = sc.nextInt();
		//sc.close();
		 //객체 인스턴스 종료
		//Scanner를 close 시키면, window가 유지하고있던 키보드 신호 전달 stream을 완전히 없애버린다.
		//스캐너 객체 생성시 열었던 System.in이 없어져버린다.
		//sc.close() 프로그램 종료시 자동으로 닫히게 처리.
		//단 이렇게 처리시, sc를 계속 생성은 하면서, 종료를 하지 않은다.
		//다른 방법을 생각해야 한다. => 메서드에서 매개변수로 Scanner객체를 받는다.
	}
	
	//3.멤버메서드작성(매출액 계산해서 출력)
	public void showSaleAmount(){
		int SaleAmount = prdPrice * prdStock;
		System.out.println("매출액: " + SaleAmount);
	}
		
	//4.멤버메서드작성(재고액 계산해서 출력)
	public void showStockAmount() {
		int StockAmount = prdPrice * prdSold;
		System.out.println("재고액: " + StockAmount);
	}
		
		
	
	//5.멤버메서드작성(입력받은 상품정보를 출력하기) => 상품 정보 출력
	public void showProduct() { 
		System.out.println("\n****상품정보출력****");
		System.out.println("상품명: " + prdName);
		System.out.println("가격: "+ prdPrice);
		System.out.println("판매수량: "+ prdStock);
		System.out.println("재고수량: "+ prdSold);		
	}	
}
