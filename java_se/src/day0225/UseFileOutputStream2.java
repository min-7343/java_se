package day0225;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileOutputStream2 {
	
	/**
	 * try~with~resources사용 <br>
	 * 연결을 제공하는 객체에서  try~with~resources를 지원하면 자동으로 연결을 끊어주게 된다.<br>
	 * throws () -> 이 생성자 안에서 어떤 일이 일어나는 지 알 수 있다는 장점 이 있다.
	 */
	public UseFileOutputStream2() {  //예외날림 -> 어떤 일이 일어나는지 알 수 있다.
		//1. 디렉토리를 생성 - FileOutputStream은 디렉토리가 만들지 못하기 때문에 먼저 디렉토리 만든다.
		File dir=new File("c:/dev/temp");
		if(!dir.exists()) {//디렉토리가 없으면 생성한다.
			dir.mkdir();
		}//end if
		
		//2. 파일생성
		//윈도운 경로 구분 /, linux 경로 구분 \ => File.separator 은 운영체제에 맞게 넣어진다.
		File file =new File(dir.getAbsolutePath()+File.separator +"text.txt"); //파일생성
		//getAbsolutePath()은 구분자를 주지 않기 때문에 구분자 ( / ) 또는 ( \\ )를 넣어줘야 한다.
		//File.separator
		
		//try ~with~resources 를 사용하면 해당 스트림의 관련된 연결을 자동으로 끊어준다.
		try (FileOutputStream fos=new FileOutputStream(file)){
			//3. 스트림 연결
				//없으면 생성 -> 있으면 덮어쓴다.
				//temp1 이라는 디렉토리가 없으면 err (파일은 만들지만 디렉토리는 만들 수 없다.)
			int data=66;  
			//4. 스트림에 데이터를 기록
			fos.write(data);
			//5. 스트림에 기록된 데이터를 목저지로 분출
				//기본형인 경우에는 flush하지 않고 참조형은 길이를 알 수 없기 때문에 해줘야 한다.
			fos.flush(); //참조형인 경우에만
			System.out.println("파일에 기록이 완료되었습니다.");
		} catch(IOException ie){
			//6. 스트림을 사용했다면 연결을 끊어준다.
			//(스트림에 남아있는 데이터가 목적지로 분출되고 연결이 끊어진다.)
			ie.printStackTrace();
		}// end if
	}//UseFileOutputStream

	public static void main(String[] args) {
			new UseFileOutputStream2(); //예외를 숨기고 싶다!
	}//main

}//class
