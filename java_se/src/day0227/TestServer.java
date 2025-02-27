package day0227;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 신뢰성통신(TCP/IP)을 수행하는 ServerSocket 생성
 */
public class TestServer {

	public TestServer() throws IOException {
		ServerSocket server = null;// 반드시 끊어야 한다.
		DataOutputStream dos=null;//접속자에게 보내줄 메시지를 기록할 스트림
		Socket client=null;
		DataInputStream dis=null; //접속자가 보내오는 메시지를 읽어들일 스트림
		try {
			// 1. ServerSocket 생성 : PORT가 열림
			server = new ServerSocket(65000); // Port 선점
			System.out.println("서버실행 중");
			// 3.접속자 소켓을 허가하여 받는다.
			
			String sendMsg="84번 포항항항"; //메시지를 소켓으로 보야한다.
		
			while (true) {
				client = server.accept(); // blocking method
				System.out.println("접속자 있음 : " + client);
				//접속자 소켓으로부터 출력 스트림 얻기
				dos=new DataOutputStream(client.getOutputStream());
				//스트림에 메시지 기록
				dos.writeUTF(sendMsg);
				//스트림에 내용을 목적지 소켓으로 분출
				dos.flush();
				
				//접속자가 보내오는 메시지를 소켓으로부터 읽어들일 입력 스트림
				dis=new DataInputStream(client.getInputStream());
				System.out.println("접속자의 메시지 : "+ dis.readUTF());
				
				
			}//end while
		} finally {
			if (dos !=null) {dos.close();}
			if (client !=null) {dos.close();}
			if (server != null) {server.close();}//end if
		} // end finally
	}// TestServer

	public static void main(String[] args) {
		try {
			new TestServer();
		} catch (IOException e) {

			e.printStackTrace();
		} // end catch
	}// main

}// class
