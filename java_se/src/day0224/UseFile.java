package day0224;

import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * 파일에 대한 정보 얻기,디렉토리 작업, 생성 작업( 파일명 변경, 파일 삭제 )<br>
 */
public class UseFile {

	// 파일에 대한 정보
	public void fileInfo() {

		// 1.File객체 생성
		File file = new File("c:/Dev/temp/java_read.txt"); // 소문자 c, 대문자 D도 가능하다

		System.out.println(file); // toString을 오버라이딩해서 경로가 나온다.
		// 2. method 호출
//		System.out.println(file.exists());// boolean 파일 존재? 
		if (!file.exists()) {// 파일이 존재하는지
			return; // 없으면 아래로 내려가지 않는다.
		} // end if

		System.out.println("파일의 길이 : " + file.length() + "byte");
		System.out.println(file.isDirectory() ? "디렉토리" : "파일");
		System.out.println(file.isFile() ? "파일" : "디렉토리");
		System.out.println(file.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(file.canWrite() ? "쓰기가능" : "쓰기불가능");
		System.out.println(file.canExecute() ? "실행가능" : "실행불가능");
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("파일에 접근하는 방법이 여러가지 이다.\n");
		System.out.println("경로 : " + file.getPath());

		try {
			// 규범경로 : OS에서 파일에 접근하기 위한 단 하나의 경로
			System.out.println("규범경로" + file.getCanonicalPath());
			System.out.println("OS에서 파일에 접근하기 위한 단 하나의 경로이다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("디렉토리명 : " + file.getParent());
		System.out.println("파일명 : " + file.getName());

//		JFileChooser jfc=new JFileChooser();
//		jfc.showOpenDialog(null);
//		
//		File selectedFile=jfc.getSelectedFile();
//		System.out.println("디렉토리명 : "+ selectedFile.getParent());
//		System.out.println("파일명 : "+ selectedFile.getName());
//		
		System.out.println();
		System.out.println(file.isHidden() ? "숨김파일" : "일반파일");
		System.out.println();

		long fileMs = file.lastModified();
		System.out.println("마지막으로 수정된 날짜 : " + fileMs);

		Date date = new Date(fileMs);
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd=yyyy EEEE HH:mm:ss");
		System.out.println(sdf.format(date));

		System.out.println();
	}// fileInfo

	// 디렉토리에 대한 일
	public void dicectoryWork() {
		// 1. 생성할 디렉토리명을 가진 File을 생성
		File createDir = new File("C:/dev/java/kws"); // java는 없다.
//		if (createDir.exists()) {
//			JOptionPane.showMessageDialog(null, "디렉토리가 이미 존재합니다");
//			return;
//		}
		// 2. 디렉토리 생성
		String result = "디렉토리 생성 실패";
		if (createDir.mkdirs()) {
			result = "디렉토리 생성 성공";
		} // end if
		System.out.println(result);
		System.out.println();

	}// dicectoryWork

	// 파일명 변경
	public void fileRename() {

		//1. 이전 파일명
		File originalFile= new File("c:/dev/temp/java_read2.txt");
		//2. 변경할 파일명
		File renamelFile= new File("c:/dev/temp/kws.txt");
		//3. 변경
		originalFile.renameTo(renamelFile);
	}// fileRename

	// 파일 삭제
	public void fileRemove() {
		
		//1.삭제할 파일 선택
		File renamelFile= new File("c:/dev/temp/kws.txt");
		//2.삭제
		renamelFile.delete();

	}// fileRemove

	public static void main(String[] args) {
		UseFile uf = new UseFile();
		System.out.println("파일 정보 얻기");
		uf.fileInfo();

		System.out.println("디렉토리 관리");
		uf.dicectoryWork();

		System.out.println("파일명 변경");
		uf.fileRename();

		System.out.println("파일 삭제");
		uf.fileRemove();

	}// main

}// class
