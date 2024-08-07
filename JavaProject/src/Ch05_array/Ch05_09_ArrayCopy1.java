package Ch05_array;

public class Ch05_09_ArrayCopy1 {

	public static void main(String[] args) {
		//배열의 얕은 복사 정리: 배열원소의 저장에 대한 시작주소(참조주소)만 복사
		//배열 이름만 다르고, 동일한 위치의 원소값.
		//복사본 변경하면 원본 값도 변경: 복사 의미가 없다.
		int[] ar= {1,2,3,4,5};
		int[] br; //배열변수 br을 앞으로 사용한다는 의미.
		br = ar; //ar배열을 br에 저장. =>배열의 실제 원소가 br로 저장되지 않고,ar의 참조주소만 저장이된다.
		//그렇기에, ar & br은 둘이 같은 배열이 된다.
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + " ");
			}
		for(int i=0; i<ar.length; i++) {
			System.out.print(+ br[i] + " ");
		}
		System.out.println();
	
		//복사본 배열 br 원소값 변경
		br[0]=10;
	
		//배열 원소값 변경 후 출력
		for(int i=0; i<br.length; i++) {
			System.out.print(br[i] + " ");
		}
	
	
	
	
	
	
	}
}
