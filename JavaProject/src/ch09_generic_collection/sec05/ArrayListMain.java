package ch09_generic_collection.sec05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListMain {

	public static void main(String[] args) {
		//1.Generic 타입의 배열생성
		ArrayList<String> voca = new ArrayList<String>();
		
		//2.4개의 단어 입력받기(flower,sun,student,good)
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("단어입력");
			String input = sc.next();
			voca.add(input);
		}
		//3.가장 긴 단어와 단어의 길이 조건문 생성	
			int Max = 0;
			String Long ="";
			for(String word : voca) {
				if(word.length()>Max) {
					Max = word.length();
					Long = word;
				}
			}
		System.out.println("가장 긴 단어: "+Long);
		System.out.println("단어의 수: " + Max);
		
		
		//4.출력문작성
		
		
	
		
		
		
		
	}
}
