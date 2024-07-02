package ch08_interface.sec07;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.데이터 저장
		ProductDTO dto = new ProductDTO("1234", "자바", "한빛아카데미", 20000, 20);
		
		//2.상품정보 출력
		ProductDAO dao = new ProductDAO();
		dao.insertProduct(dto);
		
	}

}
