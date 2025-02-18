package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * MVC Pattern이 도입된 컴포넌트 사용<br>
 * Model : 데이터<br>
 * View : 화면<br>
 * Controller : 이벤트
 */
@SuppressWarnings("serial")
public class UseItemListenerDesign extends JFrame { 
	private DefaultComboBoxModel<String> dcbm; //getter로 접근가능
	private JComboBox<String> jcbDomain;
	
	private JTextField jtfEmail;
	private JTextField jtfDomain;
	private JLabel emailOutput;
	
	
	public UseItemListenerDesign() {
		super("JComboBox사용");
		//1.데이터를 가지는 Model단의 클래스를 객체화
		dcbm =new DefaultComboBoxModel<String>();
		//2. 데이터를 사용하여 화면을 만드는 View단 클래스를 객체화.(has a)
		jcbDomain=new JComboBox<String>(dcbm);
		
		
		//3. 도메인을 추가(데이터) => Mobel 사용
		dcbm.addElement("gamail.com");
		dcbm.addElement("naver.com");
		dcbm.addElement("daum.net");
		dcbm.addElement("hotmail.com");
		dcbm.addElement("직접입력");
		
		
		JPanel jp=new JPanel();
		jp.setBorder(new TitledBorder("이메일 입력"));
		
		//이메일 입력
		jtfEmail=new JTextField(15);
		jtfDomain =new JTextField(15);
		emailOutput=new JLabel("출력");
		emailOutput.setBorder(new TitledBorder("출력"));
		jp.add(jtfEmail);
		jp.add(new JLabel("@",JLabel.CENTER));
		jp.add(jtfDomain);
		jp.add(jcbDomain);

		add("North",jp);
		add("Center",emailOutput);
		
		//디자인에서 발생한 이벤트를 처리하기위해 이벤트 클래스를 has a 관계로 생성
		
		ItemListenerDesignEvent ilde=new ItemListenerDesignEvent(this);
		jcbDomain.addItemListener(ilde);
		jtfDomain.addActionListener(ilde);
		
		setBounds(100, 100, 500, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}//UseItemListenerDesign
	
	
	
	public DefaultComboBoxModel<String> getDcbm() {
		return dcbm;
	}

	public JComboBox<String> getJcbDomain() {
		return jcbDomain;
	}

	public JTextField getJtfEmail() {
		return jtfEmail;
	}

	public JTextField getJtfDomain() {
		return jtfDomain;
	}

	public JLabel getEmailOutput() {
		return emailOutput;
	}

	public static void main(String[] args) {

		new UseItemListenerDesign();

	}//main

}//class
