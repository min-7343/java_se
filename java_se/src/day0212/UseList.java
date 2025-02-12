package day0212;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * List 사용<br>
 * - 가변 길이형<br>
 * - 값은 순차적으로 입력되고, 순차적으로 출력된다.<br>
 * - 검색의 기능이 있으며, 값은 중복될 수 있다.<br>
 */
public class UseList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void notUsingGeneric() {
		// 1. Generic을 사용하지 않은 객체화
		List list = new ArrayList();
		// 2.값 할당 : 모든 객체를 할당할 수 있다. (편의성)
		list.add(2025);
		list.add("안녕하세요");
		list.add(12);
		
		// 3.값 사용 : 입력되는 객체에 따라 값을 얻을 때 에러가 발생할 수 있다.
//		System.out.println(list); //toString 메소드로 오버라이딩 => 값이 나온다.
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
//		System.out.println(list.get(0)*list.get(1));
		// 코드 작성할 때는 error 발생하지 않는다.
		// 연산, 메소드 호출시 error => 제한) 똑같은 형식으로 저장해서 써 -> generic

	}// notUsingGeneric

	public void useArrayList() {  //너도 쓰고 나도 쓰고

		//1. 생성
		List<String> list = new ArrayList<String>();
		//2. 값 할당 ) - 값을 추가할 때마다 방의 개수가 증가 (가변길이형)
		list.add("안녕하세요?");
		list.add("오늘은");
		list.add("수요일");
		list.add("입니다.");
//		list.add("안녕하세요?"); //동일값을 추가할 수 있다.
//		System.out.println(list + " / 방의 개수 : " + list.size());
		//Generic에 해당하지 않는 데이터형을 추가하면 error발생
//		list.add(2025);
		list.add("수요일");// 중복값 입력 가능
		list.add("눈그쳤음");
		
		//배열에 복사
		String[] strArr=new String[list.size()];
		list.toArray(strArr);//배열로 복사
		
//		List<int> list2 =new ArrayList<int>(); // generic은 기본형으로 설정할 수 없다.
		List<Integer> list2 =new ArrayList<Integer>(); // => Wrapper class 사용. Integer => 참조형
		list2.add(2025);// 원래는 안들어가는 것이 정상 => autoboxing 기능 제공.
		//list2.add(new Integer(2025));  // 생성자는 JDK1.8가지 사용 가능 //Integer -> 참조형  2025 -> 기본형
		list2.add(Integer.valueOf(2025)); //Java SE 9부터는 valueOf 사용
		
		Integer[] intArr=new Integer[list2.size()];
		list2.toArray(intArr); //배열로 복사
		
//		for(int i=0;i<Integer.MAX_VALUE;i++) {
//			System.out.println();
//		}
		
		
		//값얻기
		
		String temp=list.get(0);
		Integer i=list2.get(0);
		int iv=list2.get(0); //
		
		
		System.out.println(list + " / 방의 개수 : " + list.size());
		System.out.println(list2 + " / 방의 개수 : " + list2.size());
	
	}// useArrayList

	public void useVector() {  //혼자 독차지
		//1. 생성
		List<String> list = new Vector<String>();
		//2. 값 할당 ) - 값을 생성할 때마다 
		System.out.println(list + " / 방의 개수 : " + list.size());

	}// useVector

	public static void main(String[] args) {
		UseList ul = new UseList();

		System.out.println("제네릭을 사용하지 않음");
		ul.notUsingGeneric();

		System.out.println("ArrayList");
		ul.useArrayList();

		System.out.println("Vector");
		ul.useVector();

	}// main

}// class
