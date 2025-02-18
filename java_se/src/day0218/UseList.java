package day0218;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class UseList extends JFrame { //List - 스크롤 바x
	public UseList() {
		super("JList사용");
		//1.모델 사용
		DefaultListModel<String> dlm= new DefaultListModel<String>();
		//2.모델과 has a 관계로 View를 생성
		JList<String> jl=new JList<String>(dlm); //has a 관계
		
		//JList는 ScrollBar가 없음 => ScrollBar 필요 => JScrollPane으로 만들어준다.
		JScrollPane jsp=new JScrollPane(jl); //has a 관계
		
		//데이터 추가 :모델  -> 모델에 넣은 데이터가 view에 표현된다.
		dlm.addElement("Java SE");
		dlm.addElement("Oracle DBMS");
		dlm.addElement("JDBC");
		dlm.addElement("KTML5");
		dlm.addElement("CSS6");
		dlm.addElement("Java Script ( ECMAScript )");
		dlm.addElement("Java EE");
		
		//붙이기
		add("North",new JLabel("학습과목"));
		add("Center", jsp); //모델에 넣고 view 가 붙는다.
		
		
		setBounds(100,100,300,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}//UseList

	public static void main(String[] args) {
		new UseList();

	}//main

}//class
