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
import javax.swing.ListModel;

@SuppressWarnings("serial")
public class MainPersonInfo extends JFrame {
	//JTextFiled
	private JTextField jtName;
	private JTextField jtAge;
	
	//버튼
	private JButton insert;
	private JButton change;
	private JButton delete;
	private JButton close;
	private JRadioButton jrbMan;
	private JRadioButton jrbWoman;
	private JTextField jtTel;
	
	private  DefaultListModel<String> pdlm;
	private JList<String> jl; //has a 관계
	
	public MainPersonInfo(){
		super("숙제");
		//JList
		pdlm=new DefaultListModel<String>();
		jl=new JList<String>(pdlm);
		JScrollPane jsp=new JScrollPane(jl); //has a 관계
		//위쪽 창
		//위의 판넬
		JPanel jpl=new JPanel();
		//위의 왼쪽 판넬
		JPanel jplWest=new JPanel();
		//위의 오른쪽 판넬
		JPanel jplEast=new JPanel();

		JPanel jplName= new JPanel();//이름 판넬
		JLabel jlName=new JLabel("이름");
		jtName=new JTextField(15);
		JPanel jplAge= new JPanel();//나이판넬
		JLabel jlAge=new JLabel("나이");
		jtAge=new JTextField(15);
		JPanel jplGender= new JPanel();//성별판넬
		JLabel jlGender= new JLabel("성별");
		jrbMan = new JRadioButton();
		JLabel jlMan=new JLabel("남");
		jrbWoman = new JRadioButton();
		JLabel jlWoman=new JLabel("여");
		//라디오버튼 그룹
		ButtonGroup bg=new ButtonGroup();
		bg.add(jrbMan);
		bg.add(jrbWoman);
		
		JPanel jplTel= new JPanel();//전화번호판넬
		JLabel jlTel= new JLabel("전화번호");
		jtTel=new JTextField(15);
		
		//아래버튼
		JPanel jpb=new JPanel();
		insert=new JButton("추가");
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
		
		jpl.add("West",jplWest);//왼쪽 입력창 왼쪽으로
		
		//버튼넣기
		jpb.add(insert);
		jpb.add(change);
		jpb.add(delete);
		jpb.add(close);
		
		jpl.setLayout(new GridLayout(1, 2));
		setLayout(new GridLayout(2,2));
		
		jpb.setLayout(new FlowLayout());
		
		add("West",jpl);
		add("East",jsp);
		add("Center",jpb);
		
//		jpl.add("East",jplEast);
		//위의 오른쪽 JList의 위치
		//위의 오른쪽 JList
		//위의 왼쪽 배치
		////////////////이벤트등록//////////////////////
		MainPersonInfoEvt mpif = new MainPersonInfoEvt(this);
		addWindowListener(mpif);
		//추가버튼이벤트
		insert.addActionListener(mpif);
		
		
		
		
		
		
		
		
		//종료버튼이벤트
		close.addActionListener(mpif);
		
		jsp.setSize(100,150);
		
		setBounds(10,10,500,500);
		setVisible(true);

		
	}

	public JTextField getJtName() {
		return jtName;
	}

	public JTextField getJtAge() {
		return jtAge;
	}

	public JButton getInsert() {
		return insert;
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

	public JRadioButton getJrbMan() {
		return jrbMan;
	}

	public JRadioButton getJrbWoman() {
		return jrbWoman;
	}

	public JTextField getJtTel() {
		return jtTel;
	}

	public DefaultListModel<String> getPdlm() {
		return pdlm;
	}

	public JList<String> getJl() {
		return jl;
	}

	
}
