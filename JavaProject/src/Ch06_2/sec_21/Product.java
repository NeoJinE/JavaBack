package Ch06_2.sec_21;

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
	//toString()추가 => 재정의(오버라이딩)해서 사용. object에서 구성된 메서드 현재 클래스(하위클래스)에서 
	//개발자가 원하는 내용으로 변형해서 사용.
	//재정의 하려면 재정의 한다고 코딩해 줘야 한다. => 어노테이션을 이용해서 재정의한다.
	//어노테이션(@) => 언어나 기술마다 미리 구성해놓고 있기 때문에 정해진 걸 사용한다.
	@Override //=> 아래 코드는 상위클래스에서 만들어져 있고, 재정의해서 사용하겠다는 의미를 전달(컴파일러) 
	public String toString() { //상위 클래스에서 만든 기능은 유지가 되면서 하위 클래스에서 기능 추가.
		return "상품번호 : " + prdNo + 
				"\n상품명 : " + prdName + 
				"\n제조회사 : " + prdMaker + 
				"\n가격 : " + prdPrice +
				"\n재고 : " + prdStock;
				
	}
	
	//getter & setter
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
	
	
	
	
	
	
	
	
	
	
	
	
}