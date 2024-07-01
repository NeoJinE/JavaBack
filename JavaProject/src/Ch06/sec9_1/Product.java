package Ch06.sec9_1;

import java.util.Scanner;

public class Product {
	//1.멤버필드:private멤버변수선언 => 이 멤버 필드에 값을 저장하거나 접근하기 위해서는 내부 메서드를 이용해야 한다.
	private String prdName;
	private int prdPrice;
	private int prdStock;
	private int prdSold;
	
	//2.멤버메서드작성(상품정보를 입력받기) => 입력만 받는다
	//Scanner 인스턴스를 클래스에서 생성하고 종료하면 stream문제로 오류가 발생.
	//해결: Scanner 인스턴스를 매개변수로 전달받아 사용.
	public void inputProduct(Scanner sc){//private로 되어있는 멤버변수에 값을 저장해주는 기능
		System.out.println("****상품정보입력****");
		System.out.println("상품명");
		prdName = sc.next();
		System.out.println("가격");
		prdPrice = sc.nextInt();
		System.out.println("판매수량");
		prdStock = sc.nextInt();
		System.out.println("재고수량");
		prdSold = sc.nextInt();
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

