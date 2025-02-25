package day0225;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class UseFileOutputStream  {

	public UseFileOutputStream() throws IOException {
		// 1. 디렉토리를 생성 - FileOutputStream은 디렉토리가 만들지 못하기 때문에 먼저 디렉토리 만든다.

		File dir = new File("c:/dev/temp");
		if (!dir.exists()) {// 디렉토리가 없으면 생성한다.
			dir.mkdir();
		} // end if

		// 2. 파일생성
		// 윈도운 경로 구분 /, linux 경로 구분 \ => File.separator 은 운영체제에 맞게 넣어진다.
		File file = new File(dir.getAbsolutePath() + File.separator + "text1.txt"); // 파일생성
		// getAbsolutePath()은 구분자를 주지 않기 때문에 구분자 ( / ) 또는 ( \\ )를 넣어줘야 한다.
		// File.separator
///////////////////////////////////////////////////////////		
		// 파일이 존재하면 덮어쓸것인지를 confirDirlog() 사용하여
		// 예가 눌리면 덮어쓰고, 아니오나 취소가 눌리면 덮어쓰지 않는 코드를 작성.
///////////////////////////////////////////////////////////		
System.out.println(  "-------------"+file +" "+file.exists() );
//	boolean writeFlag= false;
		boolean writeFlag = file.exists(); // 로 쓰면 있으면 true 없으면 false가 나온다.

		if (writeFlag) {
			switch (JOptionPane.showConfirmDialog(null, file + "이 존재합니다. \n파일에 덮어쓰시겠습니까?")) {
			case JOptionPane.OK_OPTION:
				writeFlag = false;
				break;
//		case JOptionPane.NO_OPTION:break;
//		case JOptionPane.CANCEL_OPTION:
//			writeFlag=true;break;
			}// end switch
		} // end if

		if (writeFlag) { // flag 변수를 사용한 분기 여부 설정 (할 지 안할지 정할 때 boolean - flag 사용)
			System.out.println("덮어쓰지 않음");
			return;
		} // end if

		FileOutputStream fos = null;
		try {
			// 3. 스트림 연결
			fos = new FileOutputStream(file);
			// 없으면 생성 -> 있으면 덮어쓴다.
			// temp1 이라는 디렉토리가 없으면 err (파일은 만들지만 디렉토리는 만들 수 없다.)
			int data = 68;
			// 4. 스트림에 데이터를 기록
			fos.write(data);
			// 5. 스트림에 기록된 데이터를 목저지로 분출
			// 기본형인 경우에는 flush하지 않고 참조형은 길이를 알 수 없기 때문에 해줘야 한다.
			fos.flush(); // 참조형인 경우에만
			System.out.println("파일에 기록이 완료되었습니다.");
		} finally {
			// 6. 스트림을 사용했다면 연결을 끊어준다.
			// (스트림에 남아있는 데이터가 목적지로 분출되고 연결이 끊어진다.)
			if (fos != null) {
				fos.close();
			}
		} // end if
	}// UseFileOutputStream

	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// main
}// class
