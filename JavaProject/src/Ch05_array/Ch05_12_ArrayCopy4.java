package Ch05_array;

import java.util.Arrays;

public class Ch05_12_ArrayCopy4 {

	public static void main(String[] args) {
		// 깊은복사: Arrays.copyOf(배열명, 길이): 깊은복사와 복사되는 배열의 크기 변경도 가능하다.(적게 or 많게 복사가능)
		// 길이: 원본 배열에서 0번 idx부터 몇개의 원소를 복사할 것인지를 설정하는 인수.
		
		int[] ar= {1,2,3,4,5};
		//int[] br = Arrays.copyOf(ar,5); // 원본 배열 ar과 동일한 길이 값을 인수로 전달.
		//int[] br = Arrays.copyOf(ar,2); // 길이 매개변수의 인수를 2로 전달(원본 길이보다 짧게)=>0~1번 idx 2개가 복사된다.
		int[] br = Arrays.copyOf(ar,7);	  // 길이 매개변수의 인수를 2로 전달(원본 길이보다 길게)=>배열크기(길이)를 7로 생성, 복사값이 없으면 0으로 자동 초기화가 발생.
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");//12345
		}
		System.out.println();
		for(int i=0; i<br.length; i++) {
			System.out.print(br[i] + " ");//12345
		}
		System.out.println();

		//복사본의 배열값 변경
		br[0]=10;
		//배열 원소 값 변경 후 출력: br 배열변수의 원소값만 변경 => ar배열과 br배열은 서로 독립적이다.
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");//12345
		}
		System.out.println();
		for(int i=0; i<br.length; i++) {
			System.out.print(br[i] + " ");//1234500
		}
		System.out.println();
		
		

	}
}
