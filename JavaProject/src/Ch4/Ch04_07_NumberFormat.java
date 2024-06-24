package Ch4;
import java.text.DecimalFormat;

public class Ch04_07_NumberFormat {

    public static void main(String[] args) {
        int price = 1000000;
        double num = 1234.5678;

        // 천단위 구분자 표시
        // 1. DecimalFormat 클래스 사용
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("가격: " + df.format(price));

        // 2. printf
        System.out.printf("가격: %,d%n", price);

        // 3. String.format
        System.out.println(String.format("가격: %,d", price));

        System.out.println("==========================================");

        // 소수점 이하 자릿수 지정
        // 1. DecimalFormat 클래스 사용
        DecimalFormat df2 = new DecimalFormat("0.00");
        System.out.println("value: " + df2.format(num));

        // 2. printf
        System.out.printf("value: %.2f%n", num);

        // 3. String.format
        System.out.println(String.format("value: %.2f", num));

        System.out.println("==========================================");

        // 천단위 구분자 + 소수점 자릿수 표시
        // 1. DecimalFormat 클래스 사용
        DecimalFormat df3 = new DecimalFormat("#,###.00");
        System.out.println("value: " + df3.format(num));

        // 2. printf
        System.out.printf("value: %,.2f%n", num);

        // 3. String.format
        System.out.println(String.format("value: %,.2f", num));
    }
}

