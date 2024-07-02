package ch08_interface.sec07;

public class ProductDTO{

	//1.멤버변수선언
	private String prdNo,prdName,prdMaker;
	private int prdPrice, prdStock;
	
	//2.생성자 초기화
	
	public ProductDTO(String prdNo,String prdName,String prdMaker,int prdPrice, int prdStock) {
		super();
		this.prdNo=prdNo;
		this.prdName=prdName;
		this.prdMaker=prdMaker;
		this.prdPrice=prdPrice;
		this.prdStock=prdStock;
	}

	//3.getter & setter
	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
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

}

