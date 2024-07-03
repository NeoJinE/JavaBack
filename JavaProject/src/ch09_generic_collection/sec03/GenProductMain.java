package ch09_generic_collection.sec03;

public class GenProductMain {

	public static void main(String[] args) {
		// 멀티타입 파라미터
		Product <Tv, String> prd1 = new Product<Tv,String>();
		
		prd1.setKind(new Tv()); //Product 인스턴스 멤버필드 prd1의 kind에는 Tv클래스 인스턴스 참조값이 저장
		prd1.setModel("스마트TV");
		System.out.println(prd1.getModel());
		System.out.println(prd1.getKind());
		
		Product <Car, String> prd2 = new Product<Car,String>();
		
		prd2.setKind(new Car()); //Product 인스턴스 멤버필드 prd1의 kind에는 Tv클래스 인스턴스 참조값이 저장
		prd2.setModel("스마트Car");
		System.out.println(prd2.getModel());
		System.out.println(prd2.getKind());
		
	}
}
