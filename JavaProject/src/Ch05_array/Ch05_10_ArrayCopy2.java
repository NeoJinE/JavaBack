package Ch05_array;

public class Ch05_10_ArrayCopy2 {

	public static void main(String[] args) {
		//깊은 복사: 배열 새로 생성.
		//복사본 변경해도 원본이 변경되지 않음
		int[] ar = {1,2,3,4,5};
		int[] br = new int[5]; // 새로운 배열 생성.
		
		//ar배열의 각 원소의 값을 br배열에 저장.
		for (int i=0; i<5; i++) {
			br[i] = ar[i]; //두 배열의 동일 인덱스의 같은 값이 저장.
		}
		
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
