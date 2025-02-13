package day0212;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map의 사용
 */
public class UseMap {
	public void useHashtable() {
		// 1. 생성 ) 11개의 행이 기본 생성되어서 제공.
		// 행은 전체 행에 약75%가 채워져 있어야 검색 효율이 좋다.
		Map<String, String> map = new Hashtable<String, String>();

		// 2. 값 할당) 순서대로 입력되지 않고, 중복키를 입려가면 이전 키에 덮어쓰게 된다. 순서X
		map.put("java", "완벽한 OPP언어");
		map.put("Ocacle", "대용량 DBMS");
		map.put("JDBC", "저수준 API"); // 개발자가 원하는 시점에 실행시킬 수 있다.
		// 동일키 입력
		map.put("java", "WORA");

		// 3. 키가 존재하니?
		String key = "java";
		System.out.println(map.containsKey(key));

		if (map.containsKey(key)) {
			// 4.값 얻기
			String value = map.get(key);
			System.out.println(key + "에대한 값 : " + value);
		} // end if

		// 모든 키 얻기
		Set<String> set = map.keySet();
		System.out.println(set);

		for (String tempKey : set) {
			System.out.println(tempKey);
		} // end for

//		//4-1 존재하지 않는 키 넣어서 해보기
//		value = map.get("java123");
//		System.out.println(value);

		// 맵의 모든 행의 값을 출력해 보세요.
		// Iterator 사용 하고 key를 다음으로 넘겨준다.

		Iterator<String> ita = set.iterator();

		while (ita.hasNext()) {
			key = ita.next();
			System.out.println(key + "의 값은 " + map.get(key));
		}

		// map의 값 삭제
		map.remove("java");
		// 전부 지우기
		map.clear();

		System.out.println(map + " / " + map.size());
	}// useHashtable

	public void useHashMap() {

		// 1. 생성 ) 16개의 행이 기본 생성되어서 제공.
		// 행은 전체 행에 약75%가 채워져 있어야 검색 효율이 좋다.
		Map<String, String> map = new HashMap<String, String>();

		// 2. 값 할당) 순서대로 입력되지 않고, 중복키를 입려가면 이전 키에 덮어쓰게 된다. 순서X
		map.put("java", "완벽한 OPP언어");
		map.put("Ocacle", "대용량 DBMS");
		map.put("JDBC", "저수준 API"); // 개발자가 원하는 시점에 실행시킬 수 있다.
		// 동일키 입력
		map.put("java", "WORA");

		// 3. 키가 존재하니?
		String key = "java";
		System.out.println(map.containsKey(key));

		if (map.containsKey(key)) {
			// 4.값 얻기
			String value = map.get(key);
			System.out.println(key + "에대한 값 : " + value);
		} // end if

		// 모든 키 얻기
		Set<String> set = map.keySet();
		System.out.println(set);

		for (String tempKey : set) {
			System.out.println(tempKey);
		} // end for

//				//4-1 존재하지 않는 키 넣어서 해보기
//				value = map.get("java123");
//				System.out.println(value);

		// 맵의 모든 행의 값을 출력해 보세요.
		// Iterator 사용 하고 key를 다음으로 넘겨준다.

		Iterator<String> ita = set.iterator();

		while (ita.hasNext()) {
			key = ita.next();
			System.out.println(key + "의 값은 " + map.get(key));
		}

		// map의 값 삭제
		map.remove("java");
		// 전부 지우기
		map.clear();

		System.out.println(map + " / " + map.size());

	}// useHashMap

	public static void main(String[] args) {
		UseMap um = new UseMap();

		System.out.println("--------Hashtable사용------------");
		um.useHashtable();

		System.out.println("--------HashMap사용------------");
		um.useHashMap();

	}// main

}// class
