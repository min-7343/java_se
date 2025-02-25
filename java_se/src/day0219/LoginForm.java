package day0219;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class LoginForm extends JFrame {
	private JTextField jtfId;
	private JPasswordField jpfPass;
	private JLabel jlblOutput;
	
	public LoginForm() {
		super("로그인");
		//컴포넌트 선언 및 생성
		
		//- 라벨 만들기 + 디자인
		JLabel jlblTitle=new JLabel("로그인",JLabel.CENTER);
		jlblTitle.setFont(new Font("맑은 고딕",Font.BOLD,30));
		//-JPanel 만들기(구역나누기) 
		JPanel jpCenter =new JPanel(); 
		jpCenter.setLayout(new GridLayout(3,1)); //3행1열
		jpCenter.setBorder(new TitledBorder("입력정보"));//네모박스의 이름
		
		//인스턴스 변수로 만들기
		jtfId=new JTextField();//1행
		jpfPass=new JPasswordField();//2행
		jlblOutput=new JLabel();//3행
		
		Font font=new Font("맑은 고딕",Font.BOLD,20);
		// 컴포넌트들에게 동일한 폰트를 설정
		jtfId.setFont(font);
		jpfPass.setFont(font);
		jlblOutput.setFont(font);
		
		//border
		//TitledBorder-타이틀 넣을 수 있다.
		jtfId.setBorder(new TitledBorder("아이디"));
		jpfPass.setBorder(new TitledBorder("비밀번호"));
		//LineBorder-색을 넣을 수 있다.
		jlblOutput.setBorder(new LineBorder(Color.red));
		
	
		
		jpCenter.add(jtfId);
		jpCenter.add(jpfPass);
		jpCenter.add(jlblOutput);
		
		
		//배치
		add("North",jlblTitle);
		add("Center",jpCenter);
		
		//
		LoginFormEvt lfe=new LoginFormEvt(this);
		//윈도우이벤트
		addWindowListener(lfe);
		//액션이벤트
		jtfId.addActionListener(lfe);
		jpfPass.addActionListener(lfe);
		
		//윈도우크기설정
		setBounds(50,100,300,250);
		//가시화
		setVisible(true);

	}//TestTitledBorder
	
	
	public static void main(String[] args) {
		new LoginForm();
		System.out.println("---");
	}//main
	public JTextField getJtfId() {
		return jtfId;
	}
	public JPasswordField getJpfPass() {
		return jpfPass;
	}
	public JLabel getJlblOutput() {
		return jlblOutput;
	}

}//class
