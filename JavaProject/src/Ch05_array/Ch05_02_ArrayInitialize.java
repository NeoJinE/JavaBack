package Ch05_array;

import java.util.Arrays;

public class Ch05_02_ArrayInitialize {

	public static void main(String[] args) {
		// 배열 초기화에 대한 정리
		//1. 배열의 자동 초기화: 선언하고 메모리 할당(new)받으면 자동으로 초기값을 저장.
		int[] ar = new int[5]; //선언 + 메모리 할당(아직 값 저장하지 않음)
		
		//ar배열 내용 출력 - 출력은 반복문 전체 이용.
		for (int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");//int형이므로, 0으로 자동 초기화.
		}
		System.out.println();
		
		//2.명시적 초기화: 선언 + 메모리할당 + 값 저장
		String[] flowers = {"해바라기","장미","진달래"};
		//florwers 배열의 모든 원소 값 출력
		for(int i=0; i<flowers.length; i++){
		System.out.printf("flowers[%d] = %s\n", i,flowers[i]);
		}
		
		//3.명시적 초기화 2
		int[] score = new int[] {90,80,60,88,77};
		
		//4.배열 초기화 주의
		//int[] num = new int [3] {1,2,3} //배열 문법에 어긋난다. new int[]에 숫자 입력시 오류발생
		
		//5.배열 먼저 선언 후 나중에 저장할 때 주의.
		int[] cr;
		//cr = {1,2,3,4,5} //값을 따로 저장할 때 {}만 이용은 불가능(선언과 동시에 초기화 할 때만 가능)
		cr = new int[] {1,2,3,4,5}; //사용 가능: 할당 + 저장.
		
		//6.길이가 0인 배열
		int[] sc = new int[0];
		int[] sc1 = new int [] {};
		int[] sc2 = {};
		
		//------------------------------------------------------------------------------------------
		//기타 배열 관련 내용
		//문자열 배열 flowers를 위에서 생성한다. -모든 원소 출력 위해 for문을 사용.
		//배열 객체 클래스인 Arrays의 메서드 toString()을 사용하면, 모든 원소 전체 배열 값 출력 가능.
		//import java.util Arrays ;  필요
								
		System.out.println(Arrays.toString(flowers));
		
		//배열 크기: 배열 객체 참조변수.length 속성 
		System.out.println(ar.length); //자동 초기화된 배열.
		System.out.println(flowers.length);
		
		
		//6에서 생성한 배열의 크기 출력
		System.out.println(sc.length); //0
		System.out.println(sc1.length); //0
		System.out.println(sc1.length); //0
		
		//배열 크기(길이)변경
		//sc2.length = 10; //배열 문법에 어긋난다.(Java배열은 메모리 할당 시점부터 크기를 정하고 변경 불가능하게 만든다)
		
		//문자열의 길이는 length()메서드
		String nameString = "홍길동";
		System.out.println(nameString.length()); //3
		
		
		
		
		
		
		
		
		
	}
}
