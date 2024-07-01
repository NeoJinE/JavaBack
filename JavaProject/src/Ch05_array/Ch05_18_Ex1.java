package Ch05_array;

import java.util.Random;
import java.util.Scanner;

public class Ch05_18_Ex1 {

	public static void main(String[] args) {
		Random r = new Random();
        //1.변수&배열선언
        int[] Ran = new int[10];
        int[] count = new int[10];
        //2.랜덤숫자10개생성(0~9범위) & 배열에 저장.
        for (int i = 0; i < Ran.length; i++) {
            Ran[i] = r.nextInt(10); 
            System.out.print(Ran[i] + " ");
            count[Ran[i]]++;
        }
        System.out.println(); 
        
      //4.출력문
        for (int i = 0; i < count.length; i++) 
             System.out.println(i + "의 갯수: " + count[i]); 
        }
    }
