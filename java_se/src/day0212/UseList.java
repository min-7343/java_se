package day0212;

import java.util.ArrayList;
import java.util.List;

/**
 * List 사용<br>
 * - 가변 길이형<br>
 * - 값은 순차적으로 입력되고, 순차적으로 출력된다.<br>
 * - 검색의 기능이 있으며, 값은 중복될 수 있다.<br>
 */
public class UseList {

	@SuppressWarnings({"rawtypes","unchecked"})
	public void notUsingGeneric() {
		//1. Generic을 사용하지 않은 객체화
		List list =new ArrayList();
		//2.값 할당 : 모든 객체를 할당할 수 있다. (편의성)
		list.add(2025);
		list.add("안녕하세요");
		list.add(12);
		//3.값 사용 : 입력되는 객체에 따라 값을 얻을 때 에러가 발생할 수 있다.
//		System.out.println(list); //toString 메소드로 오버라이딩 => 값이 나온다.
		System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(2));
//		System.out.println(list.get(0)*list.get(1));
		//코드 작성할 때는 error 발생하지 않는다.
		//연산, 메소드 호출시 error  => 똑같은 형식으로 저장해서 써 -> generic
		
		
		
	}//notUsingGeneric
	
	public void useArrayList() {
		
	}//useArrayList
	
	public void useVector() {
		
	}//useVector
	
	public static void main(String[] args) {
		UseList ul=new UseList();
		
		System.out.println("제네릭을 사용하지 않음");
		ul.notUsingGeneric();
		
		System.out.println("ArrayList");
		ul.useArrayList();
		
		System.out.println("Vector");
		ul.useVector();
		
	}//main

}//class
