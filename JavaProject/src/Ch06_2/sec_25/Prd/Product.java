package Ch06_2.sec_25.Prd;

public class Product {

	//멤버필드 private

	private String prdNo;
	private String prdName;
	private String prdMaker;
	private int prdPrice;
	private int prdStock;	
	
	
	// 매개변수가 있는 생성
	public Product(String prdNo, String prdName, String prdMaker, int prdPrice, int prdStock) {
	this.prdNo = prdNo;
	this.prdName = prdName;
	this.prdMaker = prdMaker;
	this.prdPrice = prdPrice;
	this.prdStock = prdStock;
	}

	//Getter & Setter 추가
	//public 으로 생성
	public String getPrdNo() { //getter
		return prdNo;
	}
	
	public void setPrdNo(String prdNo) { //setter
		this.prdNo=prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdMaker() {
		return prdMaker;
	}

	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public int getPrdStock() {
		return prdStock;
	}

	public void setPrdStock(int prdStock) {
		this.prdStock = prdStock;
	}
	public String toString() {
		return "상품번호 : " + prdNo + 
				"\n상품명 : " + prdName + 
				"\n제조회사 : " + prdMaker + 
				"\n가격 : " + prdPrice +
				"\n재고 : " + prdStock;
				
	}
}
