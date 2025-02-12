package day0212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import javax.annotation.processing.SupportedSourceVersion;

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
		list2.add(2);
		list2.add(2026);
		list2.add(3000);
		
		
		
		
		Integer[] intArr=new Integer[list2.size()];
		list2.toArray(intArr); //배열로 복사
		
//		for(int i=0;i<Integer.MAX_VALUE;i++) {
//			System.out.println();
//		}
		
		//값얻기
		String temp=list.get(0);
		Integer i=list2.get(0);
		int iv=list2.get(0); //unboxing : wrapper가 반환되면 Wrapper class의 method를
		//호출하여 ( intValue()) 기본형 데이터에 할당을 해준다. 레퍼클래스가 갖고 있는 값을 꺼낼때 알아서 자신의 기본형으로 반응하는 것.
		
		temp="";
		for(int j=0;j<list.size();j++) {
			temp=list.get(j);//리스트 인덱스에 해당하는 값을 얻어서
			System.out.println(temp);
		}//end for
		
//		for(Integer j : list2 ) {//unboxing
//			System.out.println(j); //j.toString
//		}//end for
//		
//		System.out.println(list);
		System.out.println("---------------------------------");
		//삭제
		//인덱스
//		list.remove(1); //1번 : 오늘은 => 사라짐, 방의 개수도 적어진다.
		//방의 내용과 일치하는 방 삭제
//		list.remove("오늘은");
		
//		방의 내용과 일치하는 방 삭제 : 방에 동일한 값이 있다면 L->R로 진행하면 가장 처음 일치하는 방이 삭제
		list.remove("수요일"); 
		
		//모은 방의 값 삭제.
		list.clear();
		System.out.println(list + " / 방의 개수 : "+list.size());
		
		//Arrayw 배열 관련된 업무를 처리하는 일.
		System.out.println("배열의 방의 값 출력");
		System.out.println( Arrays.toString(strArr) ); //주소가 출력
		System.out.println( Arrays.toString(intArr) ); //주소가 출력
		//배열을 정렬
		
		Arrays.sort(intArr); //오름차순 정렬
		System.out.println(Arrays.toString(intArr));
		Arrays.sort(intArr,Collections.reverseOrder()); //내림차순 정렬
		System.out.println(Arrays.toString(intArr));
		
		System.out.println("리스트가 비었는지?");
		System.out.println("<String> : "+list.isEmpty());  //
		System.out.println("<Integer> : "+list2.isEmpty()); //generic 사용 list
		
		
//		System.out.println(temp);
//		System.out.println(i.toString());//i = i.toString => 문자열로 나온 것이다. 
//		System.out.println(iv);
//		System.out.println(list + " / 방의 개수 : " + list.size());
//		System.out.println(list2 + " / 방의 개수 : " + list2.size());
	
	}// useArrayList

	public void useVector() {  //혼자 독차지
		//1. 생성
		List<String> list = new Vector<String>();
		
		//2. 값 할당 ) - 값을 추가할 때마다 방의 개수가 증가 (가변길이형)
				list.add("안녕하세요?");
				list.add("오늘은");
				list.add("수요일");
				list.add("입니다.");
//				list.add("안녕하세요?"); //동일값을 추가할 수 있다.
//				System.out.println(list + " / 방의 개수 : " + list.size());
				//Generic에 해당하지 않는 데이터형을 추가하면 error발생
//				list.add(2025);
				list.add("수요일");// 중복값 입력 가능
				list.add("눈그쳤음");
				
				//배열에 복사
				String[] strArr=new String[list.size()];
				list.toArray(strArr);//배열로 복사
				
//				List<int> list2 =new ArrayList<int>(); // generic은 기본형으로 설정할 수 없다.
				List<Integer> list2 =new Vector<Integer>(); // => Wrapper class 사용. Integer => 참조형
				list2.add(2025);// 원래는 안들어가는 것이 정상 => autoboxing 기능 제공.
				//list2.add(new Integer(2025));  // 생성자는 JDK1.8가지 사용 가능 //Integer -> 참조형  2025 -> 기본형
				list2.add(Integer.valueOf(2025)); //Java SE 9부터는 valueOf 사용
				list2.add(2);
				list2.add(2026);
				list2.add(3000);
				
				
				
				
				Integer[] intArr=new Integer[list2.size()];
				list2.toArray(intArr); //배열로 복사
				
//				for(int i=0;i<Integer.MAX_VALUE;i++) {
//					System.out.println();
//				}
				
				//값얻기
				String temp=list.get(0);
				Integer i=list2.get(0);
				int iv=list2.get(0); //unboxing : wrapper가 반환되면 Wrapper class의 method를
				//호출하여 ( intValue()) 기본형 데이터에 할당을 해준다. 레퍼클래스가 갖고 있는 값을 꺼낼때 알아서 자신의 기본형으로 반응하는 것.
				
				temp="";
				for(int j=0;j<list.size();j++) {
					temp=list.get(j);//리스트 인덱스에 해당하는 값을 얻어서
					System.out.println(temp);
				}//end for
				
//				for(Integer j : list2 ) {//unboxing
//					System.out.println(j); //j.toString
//				}//end for
//				
//				System.out.println(list);
				System.out.println("---------------------------------");
				//삭제
				//인덱스
//				list.remove(1); //1번 : 오늘은 => 사라짐, 방의 개수도 적어진다.
				//방의 내용과 일치하는 방 삭제
//				list.remove("오늘은");
				
//				방의 내용과 일치하는 방 삭제 : 방에 동일한 값이 있다면 L->R로 진행하면 가장 처음 일치하는 방이 삭제
				list.remove("수요일"); 
				
				//모은 방의 값 삭제.
				list.clear();
				System.out.println(list + " / 방의 개수 : "+list.size());
				
				//Arrayw 배열 관련된 업무를 처리하는 일.
				System.out.println("배열의 방의 값 출력");
				System.out.println( Arrays.toString(strArr) ); //주소가 출력
				System.out.println( Arrays.toString(intArr) ); //주소가 출력
				//배열을 정렬
				
				Arrays.sort(intArr); //오름차순 정렬
				System.out.println(Arrays.toString(intArr));
				Arrays.sort(intArr,Collections.reverseOrder()); //내림차순 정렬
				System.out.println(Arrays.toString(intArr));
				
				System.out.println("리스트가 비었는지?");
				System.out.println("<String> : "+list.isEmpty());  //
				System.out.println("<Integer> : "+list2.isEmpty()); //generic 사용 list
				
//		//2. 값 할당 ) - 값을 생성할 때마다 
//		System.out.println(list + " / 방의 개수 : " + list.size());

		
		
		
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
