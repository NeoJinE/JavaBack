package Ch06_2.sec_22;

public class ProductMain {

	public static void main(String[] args) {
		// getter & setter
		Product prd = new Product("1001", "노트북", "삼성", 5000000, 10);
		
		//객체 인스턴스 필드 초기값 출력 => toString()메서드 자동 호출
		System.out.println(prd);
				
		//상품가격 변경
		prd.setPrdPrice(1000000);	//setter()이용해서 새로운 값 저장.
		System.out.println("변경된 상품가격: "+prd.getPrdPrice());
		
		
	}

}
