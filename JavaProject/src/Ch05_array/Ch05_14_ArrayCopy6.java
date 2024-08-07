package Ch05_array;

public class Ch05_14_ArrayCopy6 {

	public static void main(String[] args) {
		//System.arraycopy(원본배열, 시작idx, 대상배열, 대상배열의 시작idx, 복사갯수)메서드 사용
		//복사대상 배열이 참조공간이 할당되어야 한다(배열을 선언해줘야 한다)
		//즉 System.arraycopy()메서드는 원본 배열의 부분복사를 진행시 사용하는 메서드이다.
		int[]ar= {1,2,3,4,5}; //원본배열생성
		int[]br= new int[ar.length];//복사본 배열 메모리 할당 자동 초기화.
		//System.arraycopy(ar, 0, br, 0, ar.length); => ar배열 모든 원소를 br배열에 동일 idx에 저장.
		System.arraycopy(ar, 0, br, 1, 3);
		//System.arraycopy(ar, 0, br, 1, 5);//배열의 크기를 넓힐 수 있는지=>last destination index 6 out of bounds
		//주의: 범위를 벗어나면 오류를 발생, 복사본 배열의 복사 시작 주소가 idx1번이면, 4개 원소까지만 복사가능. => 5개는 범위 오류를 발생한다.
		
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
