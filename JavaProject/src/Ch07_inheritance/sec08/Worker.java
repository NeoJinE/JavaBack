package Ch07_inheritance.sec08;

public class Worker {///부모클래스, 슈퍼클래스
	
		//1.멤버변수 선언
		private String joominNo ,Name, isWorker ="isWorking" ;
		
		//2.생성자 초기화(명시적 생성자 함수 1개 생성 => worker 객체 생성하기 위해서는 매개변수가 2개인 생성자 함수)
		//기본생성자 메서드 사용 못한다.
		public Worker(String joominNo, String Name){
			this.joominNo=joominNo;
			this.Name = Name;
		}
		
		//3.toString 출력문 작성
		@Override
		public String toString() {
			return "주민번호: " + joominNo +
				   "\n성명: " + Name;
		}
		
		@Override
		public void workingSet() {
			System.out.println("부분 작업 준비를 시작합니다"+isWorker);
		}
		
}
