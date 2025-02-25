package day0225;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * File과 연결하는 작업
 */
public class UseFileStream {

	/**
	 * 8bit stream + 16bit Stream연결 사용
	 */
	public void UseFileInputStream() throws IOException {
		// 1.File을 생성
		File file = new File("c:/dev/temp/java_read.txt");
		if (!file.exists()) {
			System.out.println(file + "이 존재하지 않습니다. 경로를 확인하세요");
			return;
		} // end if

		// 2.Stream을 연결하여 생성
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);

		BufferedReader br =null;

		// 3.파일안의 내용을 읽어 들임 ( 반복 )
		String str = "";
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			} // end while
		} finally {
			// 4.연결 끊기 //반드시 해야할 일
			if (br != null) {
				br.close();
			}
			; // if 문으로 null eception을 피한다.
//			br.close();  //객체(BufferdeReder)가 생성되기 전에오게 되면 br은 null이 되어 nullEception 
		} // end finally

		// 4.연결 끊기 //반드시 해야할 일
//		fis.close();
//		isr.close();

	}// UseFileInputStream

	/**
	 * 16bit stream 구성
	 * @throws IOException 
	 */
	public void useFileReader() throws IOException {
		// 1.File을 생성
		File file = new File("c:/dev/temp/java_readsysotus.txt");
		if (!file.exists()) {
			System.out.println(file + "이 존재하지 않습니다. 경로를 확인하세요");
			return;
		} // end if

		// 2.Stream을 연결하여 생성
//		FileReaer fr=new FileReaer(file);
//		BufferedReader br = new BufferedReader(isr);

		BufferedReader br = null;

		// 3.파일안의 내용을 읽어 들임 ( 반복 )
		String str = "";
		try {
			br=new BufferedReader(new FileReader(file));
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			} // end while
		} finally {
			// 4.연결 끊기 //반드시 해야할 일
			if (br != null) {
				br.close();
			}
			; // if 문으로 null eception을 피한다.
//					br.close();  //객체(BufferdeReder)가 생성되기 전에오게 되면 br은 null이 되어 nullEception 
		} // end finally

	}// useFileReader

	public static void main(String[] args) {
		UseFileStream ufs = new UseFileStream();
		System.out.println("-------8bit + 16bit-------------");
		try {
			ufs.UseFileInputStream();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("------- 16bit-------------");

		try {
			ufs.useFileReader();
		} catch (IOException e) { //FileReader, readLine(), close() 다 잡음
			e.printStackTrace();
		}//end catch
		
		
		
		
		
	}// main

}// class
