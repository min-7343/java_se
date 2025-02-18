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
public class UseJComboBox extends JFrame implements ActionListener { //ActionListener- 추상 : 구현의 강제성-> addUn어쩌구-> 오버라이딩
	private DefaultComboBoxModel<String> dcbm; //getter로 접근가능
	private JComboBox<String> jcbDomain;
	
	public UseJComboBox() {
		super("JComboBox사용 - MVC Pattern");
		//1.데이터를 가지는 Model단의 클래스를 객체화
		dcbm =new DefaultComboBoxModel<String>();
		//2. 데이터를 사용하여 화면을 만드는 View단 클래스를 객체화.(has a)
		jcbDomain=new JComboBox<String>(dcbm);
		
		jcbDomain.addActionListener(this);
		
		//3. 도메인을 추가(데이터) => Mobel 사용
		dcbm.addElement("gamail.com");//0
		dcbm.addElement("naver.com");//1
		dcbm.addElement("daum.net");//2
		dcbm.addElement("hotmail.com");//3
		dcbm.addElement("hotmail.net");//4 -오류 삭제할 도메인 //후에 다시함
		
		
		JPanel jp=new JPanel();
		jp.setBorder(new TitledBorder("이메일 입력"));
		
		jp.add(new JTextField(15));
		jp.add(new JTextField("@",JLabel.CENTER));
		jp.add(jcbDomain);
		
		add("South",jp);
		setBounds(100, 100, 400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {

		new UseJComboBox();

	}//main
	@Override
	public void actionPerformed(ActionEvent e) { //ActionListener- 추상 : 구현의 강제성-> addUn어쩌구-> 오버라이딩
		int selectedIndex=jcbDomain.getSelectedIndex();
		System.out.println("선택한 인덱스 : "+jcbDomain.getSelectedIndex());
		//Model에서 선택한 인덱스에 해당하는 값 얻기
		System.out.println("값 얻기 : "+ dcbm.getElementAt(selectedIndex));
		//선택한 아이템 삭제
//		dcbm.removeElementAt(selectedIndex); //바로 삭제된다. 후에 다시 함
	
	
	}//actionPerformed

}//class
