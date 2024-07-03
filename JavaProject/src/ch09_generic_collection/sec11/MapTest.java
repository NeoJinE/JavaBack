package ch09_generic_collection.sec11;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapTest {

	public static void main(String[] args) {
		// Map interface를 구현한 HashMap 클래스 활용
		Map<String, Integer> map = new HashMap<String, Integer>();

		//HashMap 인스턴스의 객체저장: put( , value): 우리반 학생(key)들의 성적(value)저장
		
		map.put("홍길동", 90);//value는 중복가능.
		map.put("이몽룡", 90);
		map.put("성춘향", 95);
		map.put("홍길동", 75);//key가 중복시, 90이 아닌 75로 저장됨.
		
		System.out.println("총 객체수: " + map.size());
		
		//Map 컬렉션에서 value 추출: key로 접근(중복되면 안되는 이유)
		//추출메서드 => get(key)
		System.out.println(map.get("이몽룡")); //key값이 이몽룡인 value값
		
		//Map객체는 순서를 보장하지 않는다.
		//Map객체 전체 출력시 필요한 값: 모든 key값을 알아야 해당 key의 값을 얻어올 수 있다.
		//keySet()
		//HashMap 객체 전체 출력: 방법1
		System.out.println("---------------------------------------");
		System.out.println(map.keySet());
		for(String k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//HashMap 전체 객체 출력 : 방법2
		System.out.println("---------------------------------------");
		//Set클래스 데이어타입에 key 저장해놓고 for문에서 사용
		//Set클래스는 집합과 같고, 중복값을 허용하지 않음.
		Set<String> keySet = map.keySet();
		for(String k : keySet) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//HashMap 전체 객체 출력 : 방법3
		System.out.println("---------------------------------------");
		map.forEach((key,value)->{
			System.out.println(key + " : " + map.get(key));
		});
		
		//HashMap 전체객체출력: 방법4
		System.out.println("---------------------------------------");
		//entry라는 객체는 hashMap에 대한 key-value 쌍을 하나의 객체로 갖고 있어 
		//getKey(), getValue() 메서드로 key와 value에 접근할 수 있도록 해준다.
		//즉, map에 들어있는 하나의 쌍을 entry라고 함
		for(Entry<String, Integer> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
		}
		
		
		
	}

}
