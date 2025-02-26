package day0226;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

/**
 * 객체를 JVM외부로 내보내고, 읽어들이는 일.
 */
public class UseObjectStream {
	public void writeObject(File file, UserDataVO udVO) throws IOException {
		// 0.어떤 파일 만들지 File file 로 정해준다.
		// 1.객체를 내보낼 수 있는 Stream을 생성
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			// 2. 객체를 잘게 잘라서 내보내기 (마샬링, 객체 직렬화)
			oos.writeObject(udVO);
			// 3. 스트림 안의 내용을 목적지로 분출
			oos.flush();

		} finally {
			if (oos != null) {
				oos.close();
			} // end if
		}

	}// writeObject

	public UserDataVO readObject(File file) throws IOException, ClassNotFoundException {
		UserDataVO udVO = null;
		ObjectInputStream ois = null;

		try {
			// 스트림 연결
			ois = new ObjectInputStream(new FileInputStream(file));
			// 객체 읽기
			udVO = (UserDataVO)ois.readObject();
		} finally {
			if (ois != null) {
				ois.close();
			}
		} // end finally

		return udVO;
	}// readObject

	public static void main(String[] args) {
		
		String inputMenu=JOptionPane.showInputDialog("아래의 번호를 입력 \n 1. 객체 쓰기 2- 객체 읽기");
		
		UseObjectStream uos=new UseObjectStream();
		
		
		if(inputMenu != null) {
			File file =new File("c:/dev/temp/obj.txt");
			if("1".equals(inputMenu)) {
				UserDataVO udVO= new UserDataVO("강태일", 185.7,74.2); //an
				try {
					uos.writeObject(file,udVO);
					System.out.println("객체 쓰기 완료" + udVO);
				} catch (IOException e) {
					e.printStackTrace();
				}//end catch
			}//end if
			
			if("2".equals(inputMenu)) {
				try {
					UserDataVO udVO=uos.readObject(file);
					System.out.println("객체의 값 읽기" +udVO);
				}catch (IOException e){
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}//end catch
			}//end if
		}//end if
		
		
		
		
	}// main

}// class
