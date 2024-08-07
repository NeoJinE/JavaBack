package Ch05_array;

import java.util.Arrays;

public class Ch05_13_ArrayCopy5 {

	public static void main(String[] args) {
		// 배열의 깊은 복사:  Arrays.copyOfRange(원본배열명,시작idx,끝idx+1)
		int[] ar= {1,2,3,4,5};
		//int[] br= Arrays.copyOfRange(ar, 0, 5); //새로운 배열 생성하고, ar배열의 값을 복사저장.
		//복사 범위: ar배열의 0번 idx 부터 5-1idx까지 원소를 복사
		//1.int[] br= Arrays.copyOfRange(ar, 0, 3); //ar의 idx 0~2번 까지의 원소가 복사.
		//2.int[] br= Arrays.copyOfRange(ar, 0, 7); //원본 배열의 idx 번호를 넘어서는 끝 idx를 설정함 => 원본 배열보다 더 큰 크기의 배열 생성, 빈 원소 공간은 0으로 초기화 진행
		int[] br= Arrays.copyOfRange(ar, 1, 5); //ar의 idx의 1~4번 까지의 원소가 br idx 0~3번까지의 원소가 복사.
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for(int i=0; i<br.length; i++) {
			System.out.print(br[i] + " ");
		}
		System.out.println();

		//복사본의 배열값 변경
		br[0]=10;
		//배열 원소 값 변경 후 출력: br 배열변수의 원소값만 변경 => ar배열과 br배열은 서로 독립적이다.
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for(int i=0; i<br.length; i++) {
			System.out.print(br[i] + " ");
		}
		System.out.println();
	}
}
