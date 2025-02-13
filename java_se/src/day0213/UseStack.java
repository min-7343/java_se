package day0213;

import java.util.Stack;

/**
 * Stack : LIFO를 구현한 자료 구조
 */
public class UseStack {
	public UseStack() {
		//1.객체 생성)
		Stack<String> stack=new Stack<String>();
		Stack<String> stack2=new Stack<String>();
		//2. stack에 값 할당.
		stack.push("즐거운 하루 되세요");//0
		stack.push("입니다");//1
		stack.push("목요일");//2
		stack.push("오늘은");//3
		
		System.out.println("스택이 비었는지 ? "+ stack.empty());
		
//		//3. 값얻기
//		System.out.println(stack.pop()); //오늘은 3
//		System.out.println(stack.pop()); //목요일 2
//		System.out.println(stack.pop()); //입니다. 1
//		System.out.println(stack.pop()); //즐거운 하루 되세요. 0
//		System.out.println(stack.pop()); //더이상 가져올 수 없음 -> error
		
		String item="";
		while ( !stack.empty()) {
			item=stack.pop();
			stack2.push(item);
			System.out.println(item);
		}
		
		System.out.println("------------------");
		
		while ( !stack2.empty()) {
			item=stack2.pop();
			System.out.println(item);
		}
		
		
		System.out.println(stack);
		//부모에게서 제공하는 method는 사용하면 안된다.size
//		System.out.println(stack+"크기"+stack.size() );  //쓰면 안됨
	}//UseStack
	public static void main(String[] args) {
		new UseStack();
		

	}//main

}//class
