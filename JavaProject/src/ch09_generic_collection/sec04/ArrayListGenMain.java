package ch09_generic_collection.sec04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenMain {

	public static void main(String[] args) {
		//제네릭타입의 ArrayList
		
		//인스턴스 생성시 타입을 결정
		//ArrayList<String> list = new ArrayList<String>();
		
		//ArrayList는 List 인터페이스를 구현한 구현 클래스
		List<String> list = new ArrayList<String>();
		
		//add() 객체원소 저장
		//먼저 저장(작성)되는 객체가 우선 순서번호(idx)를 갖는다
		//제네릭 타입을 String으로 설정했기 때문에 문자열 객체 원소만 가능
		list.add("Java");
		list.add("DataBase");
		list.add("HTML");
		list.add("DataBase"); //데이터 중복가능.
		list.add("프로그래밍");
		//list.add(100); => 문자열 고정이기때문에 다른타입은 불가능하다.
		
		
		//객체의 총 갯수 출력
		System.out.println("총 객체 수: " + list.size());
		
		//모든 객체 출력 첫번째 방법
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------------------------------");
		//list항목제거: remove()메서드 사용 =>remove(idx) 해당 인덱스 객체원소 제거
		list.remove(1); //idx1번자리 항목값이 제거
		
		//모든 객체 출력 두번째 방법
		for(String value: list) { //list 객체 내 원소가 한번씩 value에 대입
			System.out.println(value);
		}
		System.out.println("-----------------------------------------");
		
		for(String value: list) { //list 객체 내 원소가 한번씩 value에 대입
			System.out.println(value.length());
		}
		
		
		
		
		
	}

}
