package firstProject;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


/**
 * jplFull : 감싸고 있는 파란 선
 * jlbLg : 'Login'로고
 * 
 * 라벨
 * jlbLg : Login
 * jlblId : 아이디 라벨
 * jlblPass : 비밀번호 라벨
 * 
 * 버튼
 * loginB: 확인 버튼
 * 
 * 글씨체
 * fontLg : 로고
 * fontIdPass : 아이디와 비밀번호
 * fontField : 입력되는 아이디와 비밀번호 필드
 * 
 * 필드
 * jtfId : 아이디 입력하는 곳
 * jtfPass : 비밀번호 입력하는 곳
 * 
 * 
 */
public class PjLoginForm extends JFrame{
	
	private JTextField jtfId; 
	private JPasswordField jpfPass; 
	private JButton loginB;
	
	public PjLoginForm() {
		super("로그인창");
		//판넬
		JPanel jplFull = new JPanel();
		jplFull.setBorder(new LineBorder(Color.BLUE));
		
		
		//로고 + 글씨체
		JLabel jlbLg=new JLabel("Login");
		Font fontLg=new Font("Lucida Console",Font.BOLD,40); // 로고 글씨
		Font fontIdPass=new Font("맑은 고딕",Font.BOLD,23);// 라벨 : 아이디 비밀번호
		Font fontField =new Font("Console",Font.PLAIN,20);//필드 : 아이디 비밀번호
		
		jlbLg.setFont(fontLg);
		jlbLg.setForeground(Color.blue);
		//라벨
		JLabel jlblId=new JLabel("아이디");
		jlblId.setFont(fontIdPass);
		JLabel jlblPass=new JLabel("비밀번호");
		jlblPass.setFont(fontIdPass);
		
		//로그인버튼
		loginB=new JButton("확인");
//		loginB.setFont("맑은 고딕",Font.PLAIN,20);
		loginB.setBackground(Color.blue);
		loginB.setForeground(Color.white);
		
		//필드
		jtfId=new JTextField(15);
		jtfId.setFont(fontField);
		jpfPass=new JPasswordField(15);
		jpfPass.setFont(fontField);
//		//아이디, 비번 - 패널 넣기
//		jplId.add(jlblId);
//		jplId.add(jtfId);
//		jplPass.add(jlblPass);
//		jplPass.add(jtfPass);
		
		
		//레이아웃 (1차)
//		setLayout(null);
//		jlblId.setBounds(getX()+50,getY()+ 90,100,100);
//		jtfId.setBounds(getX()+150,getY()+ 130,200,30);
//		jlblPass.setBounds(getX()+50,getY()+ 150,100,100);
//		jtfPass.setBounds(getX()+150,getY()+ 180,200,30);
//		loginB.setBounds(getX()+110,getY()+ 250,180,30);
//		add(jlblId);
//		add(jtfId);
//		add(jtfPass);
//		add(jlblPass);
//		add(loginB);
		
		//리에웃 2차
		setLayout(null);
		jplFull.setBounds(getX()+20,getY()+70,345,180);
		jlbLg.setBounds(getX()+130,getY()-15,200,100);
		jlblId.setBounds(getX()+40,getY()+60,100,100);
		jlblPass.setBounds(getX()+40,getY()+110,120,100);
		jtfId.setBounds(getX()+150,getY()+90,200,40);
		jpfPass.setBounds(getX()+150,getY()+140,200,40);
		loginB.setBounds(getX()+40,getY()+190,310,40);
		
		
		add(jlbLg);
		add(jlblId);
		add(jlblPass);
		add(jtfId);
		add(jpfPass);
		add(loginB);
		add(jplFull);
		
		/////이벤트 등록/////
		PjLoginFormEvt plre =new PjLoginFormEvt(this);
		addWindowFocusListener(plre);
		jtfId.addActionListener(plre);
		jpfPass.addActionListener(plre);
		loginB.addActionListener(plre);
		jtfId.addMouseListener(plre);
		jpfPass.addMouseListener(plre);
		loginB.addMouseListener(plre);
		
//		setBounds(50,50,400,500); //1차
		setBounds(50,50,400,300);//2차
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JTextField getJtfId() {
		return jtfId;
	}

	public JPasswordField getJpfPass() {
		return jpfPass;
	}

	public JButton getLoginB() {
		return loginB;
	}
	
}
