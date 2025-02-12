package day0212;

import java.util.ArrayList;
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
		System.out.println(nameList);
		// 리스트로 변경하는 것은 효율이 떨어진다. => LinkedList 사용
		//차곡차곡 들어가기 => ArrayList, 리스트 변경이 자주 => LinkedList
		
		for(String subject : nameList) {
			System.out.println(subject);
		}
		
	}//UseList2 
	
	public static void main(String[] args) {
		
		new UseList2();
	}//main

}//class
