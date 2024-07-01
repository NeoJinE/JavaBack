package Ch06_2.sec_21;

public class ProductMain {

    public static void main(String[] args) {
        // toString() 사용예제
        // 객체생성: Product 클래스 toString 
        Product prd = new Product("1001", "노트북", "삼성", 5000000, 10);

        // 객체참조변수인 prd에는 인스턴스를 참조하는 주소가 저장되어있다
        // 아래 코드는 실행되면 일반적으로 주소값이나 무의미한 값이 출력이 된다
        // prd 인스턴스는 Product 클래스 인스턴스고, toString()이 오버라이딩 되어 있으므로
        // toString()메서드가 자동 호출되면서 반환되는 문자열이 출력
        // 잦은 출력이 필요한 멤버 필드인 경우에는 toString 오버라이딩,
        // 필드값을 문자열로 반환해주면 사용자가 편하게 내용 확인이 가능하다.
                
        System.out.println(prd);
    }
}