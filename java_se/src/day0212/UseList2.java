package day0212;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseList2 {
	
	public UseList2() {
		//1.리스트 생성
		List<String> nameList=new ArrayList<String>();
		//2. 값 할당
		nameList.add("Java");
		nameList.add("JDBC");
		nameList.add("HTML");
		nameList.add("CSS");
		//API를 찾아서. java 뒤에 오라클을 추가해보기
	
		System.out.println(nameList);
		
	
		nameList.add(1,"Ocalcle");
		System.out.println("이거"+nameList);
		// 리스트로 변경하는 것은 효율이 떨어진다. => LinkedList 사용
		//차곡차곡 들어가기 => ArrayList, 리스트 변경이 자주 => LinkedList
		
		for(String subject : nameList) { //리스트의 값을 하나의 코드에서 여러 번 사용할 때
			System.out.println(subject);
		}
		
		System.out.println("0213 UseSet-----------------------------");
		//Iterator를 사용한 List의 모든 요소 출력
		Iterator<String> ita = nameList.iterator(); //리스트의 값을 하나의 코드에서 한 번만 사용할 때 
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}//end while
		
	}//UseList2 
	
	
	
	public static void main(String[] args) {
		
		new UseList2();
		
		
		
	}//main

}//class
