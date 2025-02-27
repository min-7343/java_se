package day0227;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

/**
 * 서버의 주소와 서버의 포트를 설정하여 서버에 연결하는 클라이언트 
 */
public class TestClient {

	public TestClient() throws UnknownHostException, IOException {
		//2. 소켓을 생성 ( 서버의 id address와 서버의 PORT소켓을 생성)
		//자신 컴퓨터의 임의의 포트를 열고 서버의 접속을 시도.
		
		Socket client=null;
		DataInputStream dis=null;
		DataOutputStream dos=null;
		try {
			String connectIP=
			JOptionPane.showInputDialog("접속할 서버ip\n68~95번까지 가능.","192.168.10");
		client =new Socket(connectIP,65000);
		System.out.println("서버에 접속 : "+ client);
		
		//서버가 제공하는 메시지 받기=> 입력스트림 필요
		dis=new DataInputStream(client.getInputStream());
		//소켓에 연결된 트스림에서 데이터 읽기
		String revMsg=dis.readUTF();
		
		String sendMesg=JOptionPane.showInputDialog(revMsg);
		//메시지를 서버로 전송하기 위한 출력 스트림을 소켓으로부터 얻는다.
		dos=new DataOutputStream(client.getOutputStream());
		// 메시지를 스트림에 기록
		dos.writeUTF(sendMesg);
		//메시지의 내용을 목적지로 분출
		dos.flush();
		}finally {
			if( client!= null) {client.close();}
		}//end finally
	}//TestClient
	
	public static void main(String[] args) {
		try {
			new TestClient();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//main

}//class
