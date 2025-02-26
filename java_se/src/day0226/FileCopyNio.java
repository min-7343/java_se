package day0226;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileCopyNio {
	public FileCopyNio() throws IOException {
		JFileChooser jfcOpen=new JFileChooser(); //파일 창 띄우기
		jfcOpen.showOpenDialog(null);
		
		File originalFileName=jfcOpen.getSelectedFile();
		if(originalFileName ==null) { //취소
			return;
		}//end if
		
		//복사할 파일명 생성 : 원본파일명_copy.확장
		StringBuilder copyFileName=new StringBuilder(originalFileName.getAbsolutePath()); //경로를 기록
		copyFileName.insert(copyFileName.lastIndexOf("."),"_copy");
		
		File copyFile=new File(copyFileName.toString()); //StringBuilder를 String형으로 변환 
		
		//1.원파일 선택
		//Paths.get(originalFileName.getAbsolutePath()) 하지 않아도 된다.
		Path orginal=Path.of(originalFileName.getAbsolutePath());
		//2. 복사할 파일 설정
		Path copy=Path.of(copyFile.getAbsolutePath());
		
		//3. 복사를 수행
		Files.copy(orginal, copy, StandardCopyOption.REPLACE_EXISTING);
		
	}//FileCopy

	public static void main(String[] args) {
		try {
			new FileCopyNio();
			System.out.println("파일 복사 성공");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "파일 복사 도중 문제 발생");
			e.printStackTrace();
		}

	}//main

}//class
