package ch01_01;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
    	// 변수 생성
        int Num;
        int Ran;
        
        // 시작 문 작성
        System.out.println("\t숫자 알아맞히기 게임" +
                           "\n-----------------------------" +
                           "\n어떤 숫자일까요? 알아 맞혀보세요(1~10)");
        
        // 숫자 입력창 생성 & 난수 생성
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        Num = sc.nextInt(); 
        Ran = r.nextInt(10) + 1; // 1부터 10 사이의 난수 생성
        
        do {
            if (Num != Ran) {
            	System.out.println("아닙니다 다시 맞혀보세요" +
                        "\n다시 입력");
            	 Num = sc.nextInt(); 
            } 
               
        }
         while (Num != Ran);
      System.out.printf("드디어 맞혔습니다~ 나의 숫자는 %d입니다\n", Ran);
    }
}