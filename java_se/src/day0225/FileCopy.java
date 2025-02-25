package day0225;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileCopy {
	public FileCopy() throws IOException {
		JFileChooser jfcOpen=new JFileChooser(); //파일 창 띄우기
		jfcOpen.showOpenDialog(null);
		
		File file=jfcOpen.getSelectedFile();
		if(file ==null) { //취소
			return;
		}//end if
		
		//복사할 파일명 생성 : 원본파일명_copy.확장
		StringBuilder copyFileName=new StringBuilder(file.getAbsolutePath()); //경로를 기록
		copyFileName.insert(copyFileName.lastIndexOf("."),"_copy");
//		System.out.println(copyFileName);
		
		File copyFile=new File(copyFileName.toString()); //StringBuilder를 String형으로 변환 
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			//파일에서 데이터를 읽기 위한 스트림 연결
			fis=new FileInputStream(file); //원본파일과 연결
			//파일에서 데이터를 쓰기위한 스트림 연결
			fos=new FileOutputStream(copyFile);
		///////매우 비효율적 - 하드 디스크의 특성을 무시한 코드/////////////////
//			int fileData=0;
//			while((fileData=fis.read()) !=-1) { 
//				//데이터를 1byte씩 읽어들여 EOF아니면 
//				fos.write(fileData); //스트림에 쓰기
//			}//end while
//			fos.flush(); //스트림에 읽어들인 1bytes만 기록
		/////////매우 비효율적//////////////
			
			//HDD의 head는 한번에 제조사마다 다르긴하지만 일반적으로 512Bytes씩 읽어 들인다.
			
			byte[] readData=new byte[512];  //512개를 만들었는데
			int readSize=0;
			int cnt=0;
			
//			while ( (readSize =fis.read(readData)) !=-1) {
			while ( (readSize =fis.read()) !=-1) {
				cnt++;
//				System.out.println(readSize);
				//읽어들인 배열의 0번째 방부터 배열의 크기까지를 스트림에 쓴다.
				fos.write(readData,0,readSize); 
			}//end while
			fos.flush();
			System.out.println("파일복사 완료");
//			System.out.println("총"+cnt + "번 읽어 들임 ");
			
		}finally {
			if(fis !=null) {fis.close();}
			if(fos !=null) {fos.close();}
		}//end finally
	
		
	}//FileCopy

	public static void main(String[] args) {
		try {
			new FileCopy();
			System.out.println("파일 복사 성공");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "파일 복사 도중 문제 발생");
			e.printStackTrace();
		}

	}//main

}//class
