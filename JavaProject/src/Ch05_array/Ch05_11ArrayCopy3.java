package Ch05_array;

public class Ch05_11ArrayCopy3 {
	public static void main(String[] args) {
		//배열 깊은 복사: objext.clone()메서드 사용
		//배열변수.clone()을 이용: 배열변수를 깊은복사 진행 후 반환하기에, 새로 선언한 배열변수에 저장.
		int[] ar= {1,2,3,4,5};
		int[] br = ar.clone(); //ar배열을 깊은 복사를 진행한 결과(새로운 배열의 시작주소)가 반환되어서, br배열에 저장.
		
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
