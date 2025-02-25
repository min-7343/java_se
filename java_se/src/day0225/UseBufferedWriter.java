package day0225;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

/**
 * 문자열을 파일에 기록
 */
public class UseBufferedWriter {
	/**
	 * 8bit + 16bit  stream 결합
	 */
	public void useFileOutputStream() { //try resources
		String msg="오늘은 25일 화요일 입니다.";
		File file =new File("c:/dev/temp/test.txt"); //파일생성
		
		//try ~ with ~ resources사용 : close() 가 자동으로 처리
		//2.Stream을 연결
		try(BufferedWriter bw = 
				new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file)))){
			//3. 데이터를 스트림에 기록
			bw.write(msg);
			//4. Stream의 내용을 목적으로 분출
			bw.flush();
			System.out.println("파일에 기록되었습니다.");
		}catch(IOException ie){
			ie.printStackTrace();
		}//end catch
		
	}//useFileOutputStream

	/**
	 * 16bit stream만 사용
	 */
	public void useFileBufferedWriter() throws IOException { //throws - >아래에서 try catch

		//16bit stream만 사용
		
		String data= "내일은 수요일 입니다";
		
		File file =new File ("c:/dev/temp/test.txt");
		
		BufferedWriter bw=null;
		
		try {
			//스트림 연결
			bw=new BufferedWriter(new FileWriter(file));
			//스트림에 데이터를 기록
			bw.write(data);
			//스트림에 내용을 목적지로 분출
			System.out.println("스트림에 데이터를 기록"); 
			//파일에 쓰인것이 아니다. Stream에 쓰인것이지 파일에 쓰인 것이 아니다.
//			bw.flush();
//			System.out.println("스트림에 기록된 데이터를 목적지 파일로 분출"); 
			
		}finally {
			if(bw!=null) {bw.close();}; // end if -> close()
		}//end finally
		
		
	}//useFileBufferedWriter



	public static void main(String[] args) {
		UseBufferedWriter ubw=new UseBufferedWriter();
//		ubw.useFileOutputStream();
		try {
			ubw.useFileBufferedWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}// main

}// class
