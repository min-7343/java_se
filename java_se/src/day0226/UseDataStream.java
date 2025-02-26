package day0226;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class UseDataStream {

	public void useDataOutputStream(File file) {
		int age = 25;
	
		// 자바의 기본형 데이터 형을 내보낼 수 있는 Stream을 연결
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
			// 스트림에 데이터를 기록
			dos.writeInt(age);
			// 스트림에 내용을 분출
			dos.flush();
		} catch (IOException ie) {
			ie.printStackTrace();
		} // end try catch
	}// useDataOutputStream

	public void useDataInputStream(File file) {
		//데이터를 읽어들이기 위한 Stream 생성
		try(DataInputStream dis =
				new DataInputStream(new FileInputStream(file)) ){
			//스트림에서 데이터 읽기
			int data=dis.readInt();
			System.out.println("읽어들인 데이터 : "+data); //근데 못읽고 있음
		}catch(IOException ie) {
			ie.printStackTrace();
			
		}//end catch

	}// useDataInputStream

	public static void main(String[] args) {
		
		UseDataStream uds=new UseDataStream();
		File file = new File("c:/dev/temp/data_output.txt"); //속 사영ㅇ하니깐
		String msg="데이터를 JVM외부로 내보내시겠습니까?";
		
		switch (JOptionPane.showConfirmDialog(null, msg)) {
		case JOptionPane.OK_OPTION:
			uds.useDataInputStream(file);
			break;
		case JOptionPane.NO_OPTION: 
			switch (JOptionPane.showConfirmDialog(null, "데이터를 JVM 내부로 읽어들잇겠습니까?")){
			case JOptionPane.OK_OPTION: 
				uds.useDataOutputStream(file);
			}//end switch
		}//end switch

}// main

}// class
