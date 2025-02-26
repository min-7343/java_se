package day0226;

import java.io.NotSerializableException;
import java.io.Serializable;

public class UseInstanceOf {
	public void UseInstanceOf(Test t) throws NotSerializableException {
		if( t instanceof Serializable) {//직렬화 인터페이스를 가지고 만들어졌니? 
			System.out.println("직렬화 가능"); //자르는 코드 넣으면 된다.
		}else {
//			System.out.println("직렬화 불가능");//예외 중 notSerializable
			throw new NotSerializableException("생명연장의 꿈~");
		}
	}

	public static void main(String[] args) {
		Test t=new Test();
		UseInstanceOf uio= new UseInstanceOf();
		try {
			uio.UseInstanceOf(t);
		} catch (NotSerializableException e) {
			e.printStackTrace();
		}
	}//main

}//class
