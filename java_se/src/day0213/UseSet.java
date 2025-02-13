package day0213;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  Set : 검색의 기능이 없으며, 중복 값을 저장하지 않는 자료구조.
 *  	 입력값은 순차적으로 입력되지 않는다.
 */
public class UseSet {
	
	public UseSet() {
		//1. 생성
		Set<String> set=new HashSet<String>(); //100은 방의 크기지 값이 들어간 곳이 아니다.
		//2. 값 할당 : 중복값 허용x, 순차적 입력x
		set.add("Java 1");
		set.add("Oracle 2");
		set.add("JDBC 3");
		set.add("HTML 4");
		set.add("강태일");
		set.add("CSS 5");
		set.add("JAava Script 6");
		set.add("강태일");//중복 값 입력 x
		
		System.out.println("6번 배열로 복사");
		//6. 요소를 배열로 복사
		//set의 크기로 배열을 생성
		String[] arr=new String[set.size()];
		//set의 내용을 배열로 복사
		set.toArray();	
		
		//5. 요소 삭제
		set.remove("CSS 5");
//		set.clear();
		
		//검색의 기능이 없음 => java.util.Iterator를 사용.
		Iterator<String> ita=set.iterator();
		//요소가 몇개인지 모르겠으나 모든 방의 값을 얻어야 한다.
		while(ita.hasNext()) { //최소 0번 수행 최대 조건까지 수행.
			System.out.println(ita.next()); //요소의 값을 얻고, 포인터를 다음으로 이동.
		}//end while
		
//		//다시 while문을 쓴다고 해도 출력 x, 한번 더 하고 싶으면 다시 제어권을 가지고 와야한다.
//		ita=set.iterator(); //다시 제어권을 가지고 옴.
//		while(ita.hasNext()) { //최소 0번 수행 최대 조건까지 수행.
//			System.out.println(ita.next()); //요소의 값을 얻고, 포인터를 다음으로 이동.
//		}//end while
		
	
//		System.out.println(ita);
		System.out.println("확장된 for");
		System.out.println(set+" / "+set.size());
		for(String data : set) {
			System.out.println(data);
		}
		
	}
	public static void main(String[] args) {
		new UseSet();

	}//main

}//class
