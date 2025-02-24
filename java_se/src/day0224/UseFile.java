package day0224;

import java.io.File;

/**
 * 파일에 대한 정보 얻기,디렉토리 작업, 생성 작업( 파일명 변경, 파일 삭제 )<br>
 */
public class UseFile {
	
	//파일에 대한 정보
	public void fileInfo() {
		
		//1.File객체 생성
		File file =new File("C:/dev/temp/java_read.txt");
		System.out.println(file);  //toString을 오버라이딩해서 경로가 나온다.
		//2. method 호출
		//파일이 존재?
		System.out.println(file.exists());
	}//fileInfo
	
	//디렉토리에 대한 일
	public void dicectoryWork() {
	
	}//dicectoryWork
	
	//파일명 변경
	public void fileRename() {
		
	}//fileRename
	
	//파일 삭제
	public void fileRemove() {
		
	}//fileRemove


	public static void main(String[] args) {
		UseFile uf =new UseFile();
		System.out.println("파일 정보 얻기");
		uf.fileInfo();
		
		System.out.println("디렉토리 관리");
		uf.dicectoryWork();
		
		System.out.println("파일명 변경");
		uf.fileRename();
		
		System.out.println("파일 삭제");
		uf.fileRemove();

	}//main

}//class
