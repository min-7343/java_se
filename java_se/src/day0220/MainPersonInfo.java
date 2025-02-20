package day0220;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainPersonInfo extends JFrame {
	private JButton inset;
	private JButton change;
	private JButton delete;
	private JButton close;
	public MainPersonInfo() throws HeadlessException {
		super("숙제");
		//위쪽 창
		//위의 판넬
		JPanel jpl=new JPanel();
		//위의 왼쪽 판넬
		JPanel jplWest=new JPanel();
		//JList
		DefaultListModel<String> dlm= new DefaultListModel<String>();
		JList<String> jl=new JList<String>(dlm); //has a 관계
		JScrollPane jsp=new JScrollPane(jl); //has a 관계
		//위의 오른쪽 판넬
		JPanel jplEast=new JPanel();
		
		JPanel jplName= new JPanel();//이름 판넬
		JLabel jlName=new JLabel("이름");
		JTextField jtName=new JTextField(15);
		JPanel jplAge= new JPanel();//나이판넬
		JLabel jlAge=new JLabel("나이");
		JTextField jtAge=new JTextField(15);
		JPanel jplGender= new JPanel();//성별판넬
		JLabel jlGender= new JLabel("성별");
		JRadioButton jrbMan = new JRadioButton();
		JLabel jlMan=new JLabel("남");
		JRadioButton jrbWoman = new JRadioButton();
		JLabel jlWoman=new JLabel("여");
		//라디오버튼 그룹
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrbMan);
		bg.add(jrbWoman);
		
		JPanel jplTel= new JPanel();//전화번호판넬
		JLabel jlTel= new JLabel("전화번호");
		JTextField jtTel=new JTextField(15);
		
		//아래버튼
		JPanel jpb=new JPanel();
		inset=new JButton("추가");
		change=new JButton("변경");
		delete=new JButton("삭제");
		close=new JButton("종료");
		
		jplName.add(jlName);
		jplName.add(jtName);
		jplAge.add(jlAge);
		jplAge.add(jtAge);
		jplGender.add(jlGender);
		jplGender.add(jrbMan);
		jplGender.add(jlMan);
		jplGender.add(jrbWoman);
		jplGender.add(jlWoman);
		jplTel.add(jlTel);
		jplTel.add(jtTel);
		
		jplWest.add(jplName);
		jplWest.add(jplAge);
		jplWest.add(jplGender);
		jplWest.add(jplTel);
		
		jpl.add(jplWest);//왼쪽 입력창 왼쪽으로
		
		//버튼넣기
		jpb.add(inset);
		jpb.add(change);
		jpb.add(delete);
		jpb.add(close);
		
		add("West",jpl);
		add("East",jsp);
		add("South",jpb);
//		jpl.add("East",jplEast);
		//위의 오른쪽 JList의 위치
		//위의 오른쪽 JList
		//위의 왼쪽 배치

		
		
		jsp.setSize(200,250);
		
		setBounds(10,10,500,500);
		setVisible(true);
		
		
	}
	public JButton getInset() {
		return inset;
	}
	public JButton getChange() {
		return change;
	}
	public JButton getDelete() {
		return delete;
	}
	public JButton getClose() {
		return close;
	}
	
}
