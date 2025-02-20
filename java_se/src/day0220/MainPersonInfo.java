package day0220;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;

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
import javax.swing.ListSelectionModel;


/**
 * 메인 MainPersonInfo
 */
@SuppressWarnings("serial")
public class MainPersonInfo extends JFrame {
	
	//JTextFiled
	private JTextField jtName;
	private JTextField jtAge;
	private JTextField jtTel;
	//버튼
	private JButton insert;
	private JButton change;
	private JButton delete;
	private JButton close;
	private JRadioButton jrbMan;
	private JRadioButton jrbWoman;
	
	////////////List 관련 - 이름 헷갈리지 않기////////////////
	//입력용 JList
	private DefaultListModel<PersonInfo> pdlm;
	private JList<PersonInfo> personListView;
    //저장용 ArrayList
    private ArrayList<PersonInfo> personList;
	
	public MainPersonInfo(){
		super("숙제");
		//JList 정의
		pdlm=new DefaultListModel<PersonInfo>();
		personListView=new JList<>(pdlm);
		//userListView-선택창으로 만들기
		personListView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//단일선택모드
		personList = new ArrayList<>();//저장소
		

		//위쪽 창
		//위의 판넬(jpl-jplWest, jplEast)
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
		JPanel jpb=new JPanel();//버튼판넬
		insert=new JButton("추가");
		change=new JButton("변경");
		delete=new JButton("삭제");
		close=new JButton("종료");
		
		//이름,나이,성별,전화번호 - 각 판넬에 넣기
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
		
		//jplWest-jplName,jplAge,jplGender,jplTel
		jplWest.add(jplName);
		jplWest.add(jplAge);
		jplWest.add(jplGender);
		jplWest.add(jplTel);
		//jplWest의 레이아웃 (4행1열)
		jplWest.setLayout(new GridLayout(4,1));
		
		//jpb - 4개 버튼 넣기
		jpb.add(insert);
		jpb.add(change);
		jpb.add(delete);
		jpb.add(close);
		
		//////////////레이아웃///////////////////
		jpl.add("West",jplWest);//왼쪽 입력창 왼쪽으로
		add("Center",jpl);
		jpl.add(new JScrollPane(personListView));
		
		add("South",jpb);//버튼 레이아웃
		
		////////////////이벤트등록//////////////////////
		MainPersonInfoEvt mpif = new MainPersonInfoEvt(this);
		addWindowListener(mpif);
		//추가버튼이벤트
		insert.addActionListener(mpif);
		//수정버튼이벤트
		change.addActionListener(mpif);
		//삭제버튼이벤트
		delete.addActionListener(mpif);
		//종료버튼이벤트
		close.addActionListener(mpif);
		
		//크기 정하기
		personListView.setSize(100,150);
		setBounds(10,10,500,300);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
//////////////getter 만들기//////////
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

	public DefaultListModel<PersonInfo> getPdlm() {
		return pdlm;
	}

	public JList<PersonInfo> getPersonListView() {
		return personListView;
	}

	public ArrayList<PersonInfo> getPersonList() {
		return personList;
	}



	
}
