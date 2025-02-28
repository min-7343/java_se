package day0227;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 1. 소켓을 열고(PORT) 2. 메시지를 읽어들이는 일(SOCKET)이 무한루프동작 3. J.T.F에서 이벤트가 발생하면 메세지를 보내는
 * 일(SOCKET)
 * 
 */
@SuppressWarnings("serial")
public class SmpleChatClient extends JFrame implements ActionListener {

	private JTextArea jtaTalkDisplay;
	private JScrollPane jspJtaTalkDisplay;
	private JTextField jtfTalk;

	private Socket client;// 서버에 연결을 위해서 사용
	private DataInputStream disReadStream; // 대화를 읽어들이기 위한 스트림
	private DataOutputStream dosWriteStream; // 대화를 쓰기위한 스트림

	private String nick;// 대화명

	public SmpleChatClient() {
		super("::::::::::채팅 클라이언트:::::::::::::::");

		jtaTalkDisplay = new JTextArea();
		jspJtaTalkDisplay = new JScrollPane(jtaTalkDisplay);
		jtfTalk = new JTextField();
		jspJtaTalkDisplay.setBorder(new TitledBorder("대화내용"));
		jtaTalkDisplay.setEditable(false);
		jtaTalkDisplay.setBackground(Color.WHITE);

		jtfTalk.setBorder(new TitledBorder("대화"));

		add("Center", jspJtaTalkDisplay);
		add("South", jtfTalk);

		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		//보여지고 나서 서버 연결
		try {
			connecToServer();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		jtfTalk.addActionListener(this);
		//스레드가 필요한 이유 - 동시에 읽고 쓰기가 안된다.
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}// windowClosing

			@Override
			public void windowClosed(WindowEvent e) {
				try {
					close();
				} catch (IOException e1) {
	
					e1.printStackTrace();
				}finally {
					System.exit(ABORT); //대화창 다 날릴거야
				}//finally
			}//windowClosed
		});

		jtfTalk.requestFocus();
	}// SmpleChatClient

	private void connecToServer() throws UnknownHostException, IOException {// 서버연결

		// 서버 ip받기 //InputDialog
		String connectIp = JOptionPane.showInputDialog("접속할 서버의 주소\n68~98번", "192.168.10.");

		//닉네임
		nick = JOptionPane.showInputDialog("대화명을 입력해 주세요");

		// 소켓 생성( Ip,포트 )
		client = new Socket(connectIp, 55000); // 서버에 연결하여 회선 확립
		jtaTalkDisplay.setText(connectIp + "서버에 접속하셨습니다.\n");

		// 데이터 읽고 얻기위해 Stream 연결
		disReadStream = new DataInputStream(client.getInputStream());
		dosWriteStream = new DataOutputStream(client.getOutputStream());

		jtaTalkDisplay.append(nick + "님 즐거운 대화를 나누세요\n");

		readMsg();// 상대방이 보내오는 메시지를 무한으로 읽어들인다.

	}// connecToServer

	private void readMsg() throws IOException {//메시지 읽기
		
		if(disReadStream !=null) {

			while (true) {
				jtaTalkDisplay.append(disReadStream.readUTF());
				jtaTalkDisplay.append("\n");
			}//end while
		}//end if
		
	}// readMsg

	private void sendMsg() throws IOException {// 메시지 보내기
		String inputMsg=jtfTalk.getText();
		StringBuilder sendMsg=new StringBuilder();
		sendMsg.append("[").append(nick).append("]")
		.append(inputMsg);
		
		//내가 작성한 메시지를 내 대화창에 올리고
		jtaTalkDisplay.append(sendMsg.toString());
		jtaTalkDisplay.append("\n");
		
		//대화상대에게 메시지를 보내준다.
		dosWriteStream.writeUTF(sendMsg.toString());
		dosWriteStream.flush();
		
		
	}// sendMsg

	private void close() throws IOException {// 닫기
		if(disReadStream !=null ) {disReadStream.close();}
		if(dosWriteStream !=null ) {dosWriteStream.close();}
		if(client !=null ) {client.close();}
		
		
	}// close

	@Override
	public void actionPerformed(ActionEvent e) {

		//이벤트가 터졌을때 메시지 보내기
		try {
			sendMsg();
		} catch (IOException e1) {
			e1.printStackTrace();
		}//end catch
	}// actionPerformed

	public static void main(String[] args) {
		new SmpleChatClient();

	}// main

}// class
