package day0205;

import java.util.ArrayList;
import java.util.List;

/**
 * annotation을 사용해 봅시다.
 */
public class UseAnnotation {
	
	@Deprecated
	public void test() {
		System.out.println("제대로 일을 할줄 알았는데...");
	}
	
	@Override
	public String toString() {
		return "heap 주소대신 메시지!";
	}
	
	
//	@SuppressWarnings("unused")
	@SuppressWarnings({"unused","rawtypes"})
	public void temp() {
		int i;
//		@SuppressWarnings("unused")
		int j;
//		@SuppressWarnings("rawtypes") //원시형에대한 경고를 날릴때
		List list=new ArrayList();
	}
	

	public static void main(String[] args) {
		
		UseAnnotation ua = new UseAnnotation();
		ua.test();
		
		System.out.println(ua);
	}//main

}//class
