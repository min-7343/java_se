package day0227;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 1. 소켓을 열고(PORT)
 * 2. 메시지를 읽어들이는 일(SOCKET)이 무한루프동작
 * 3. J.T.F에서 이벤트가 발생하면 메세지를 보내는 일(SOCKET)
 * 
 */
@SuppressWarnings("serial")
public class SmpleChatServer extends JFrame implements ActionListener {

	private JTextArea jtaTalkDisplay; //접속자의 대화를 보여주기위한 J.T.A
	private JScrollPane jspJtaTalkDisplay; // 스크롤바와 데이터가 따로 놀아서 스크롤바 메소드 구현해야한다.
	private JTextField jtfTalk;//접속자에게 대화를 쓰기위한 J.T.F
	
	private ServerSocket server;//포트를 열고 접속자 소켓을 받는다.
	private Socket client;//접속자 소켓을 받아서 관리하기 위해서
	private DataInputStream disReadStream;//접속자가 보내오는 메시지를 읽어들이위한
	private DataOutputStream dosWriteStream;// 접속자에게 메시지를 봰기위한 스트림
	
	public SmpleChatServer() {
		super("::::::::::채팅 서버:::::::::::::::");
		
		jtaTalkDisplay=new JTextArea();
		jspJtaTalkDisplay=new  JScrollPane(jtaTalkDisplay);
		jtfTalk=new JTextField();
		jspJtaTalkDisplay.setBorder(new TitledBorder("대화내용"));
		jtaTalkDisplay.setEditable(false);
		jtaTalkDisplay.setBackground(Color.WHITE);
		
		jtfTalk.setBorder(new TitledBorder("대화"));

		add("Center",jspJtaTalkDisplay);
		add("South",jtfTalk);
		
		setBounds(100, 100, 400, 600);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//windowClosing
		});
		
		jtfTalk.requestFocus();
	}//SmpleChatServer
	
	
	/**
	 * 서버 소켓을 열고 > 접속자 소켓을 받고 > 대화를 읽거나 보내기위한 스트림을 연결
	 */
	public void openServer() {
		
	}//openServer
	/**
	 * 접속자가 보내오는 메시지를 무한루프로 읽어들이기
	 */
	public void readMsg() {
		
	}//readMsg
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 발생ㅅ했을 때 메시지를 보내보자
	}//actionPerformed

	public static void main(String[] args) {
		new SmpleChatServer();
	}//main

}//class
