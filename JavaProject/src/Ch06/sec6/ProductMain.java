package Ch06.sec6;

public class ProductMain {
	public static void main(String[] args) {
		//Product 클래스 메서드 사용해서 상품 관리 프로그램.
		
		//1.클래스 선언
		Product list1 = new Product();
		Product list2 = new Product();
		
		//2.상품정보입력 메서드 출력 => private로 설정된 멤퍼필으에 데이터를 저장해주는 메서드
		list1.inputProduct();
		
		//3.학생정보출력 메서드 호출
		list1.showProduct(); // private 설정된 멤버필드의 데이터를 출력해주는 메서드
		
		//4.매출액 메서드 호출
		list1.showSaleAmount();
		
		//5.재고액 메서드 호출
		list1.showStockAmount();
		
		list2.inputProduct();
		list2.showProduct();
		list2.showSaleAmount();
		list2.showStockAmount();
		
	}
}
