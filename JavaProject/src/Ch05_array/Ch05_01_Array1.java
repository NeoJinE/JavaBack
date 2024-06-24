package Ch05_array;

public class Ch05_01_Array1 {

	public static void main(String[] args) {
		// 배열 선언 1
		int ar[] = new int[3]; // 선언과 동시에 메모리 할당(저장영역확보)
		
		int br[] ; //배열의 참조변수만 선언.(메모리의 할당이 없어, 사용이 불가능하다)
		br = new int[5]; //배열 참조 변수에 메모리 할당.
		
		//배열 각 원소에 값 저장
		//idx 이용해서 접근: 0 시작.
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		//배열의 각 원소값 출력 => 원래는 for문을 사용해서 나열.
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		System.out.println("==========================================");
		
		//배열 전체 원소 for문 사용해서 출력.
		for(int i=0; i<3; i++) {
			System.out.println(ar[i]);
		}	
		System.out.println("==========================================");
		//배열 전체 원소 출력: 종료조건에 배열의 길이 값 사용
		//배열 전체 원소 for문 사용해서 출력.
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("---------------------------------------------");
		//메모리영역 할당까지만 받은 배열의 전체 원소에 값을 저장 => for문 사용.
		//br 배열변수 각 원소에 값을 저장
		for(int i=0; i<br.length;i++) { //br 배열 각 원소에 0,1,2,3,4,5 저장.
			br[i] = i;
		}
		for(int i=0; i<br.length;i++) {
			System.out.println(br[i]);
		}
		
		}
	}


