package day0221_homework;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;


/**
 * 메모장 서식 > 글꼴 디자인
 */
@SuppressWarnings("serial")
public class FontInfoDialog extends JDialog implements MouseListener{

	private MemoDesign md;
	////List관련////	
	private DefaultListModel<String> fontDlm;
	private DefaultListModel<String> styleDlm;
	private DefaultListModel<String> sizeDlm;
	
	private JList<String> fontListView;
	private JList<String> styleListView;
	private JList<String> sizeListView;
	
	///JTextField 필드창///
	private JTextField fontT;
	private JTextField styleT;
	private JTextField sizeT;
	
	///글씨변화구간///
	private JLabel viewChar;
	
	///확인 취소버튼///
	private JButton cancleB;
	private JButton okayB;
	
	public FontInfoDialog(MemoDesign md) {
		super(md,"글꼴",true);
		
		//라벨
		JLabel fontLb=new JLabel("글꼴(F):");
		JLabel styleLb=new JLabel("글꼴스타일(Y):");
		JLabel sizeLb=new JLabel("크기(S):");
		JLabel viewL=new JLabel("보기");
		
		//JTextField
		fontT = new JTextField(15);
		styleT = new JTextField(15);
		sizeT = new JTextField(15);
		
		//글씨크기라벨
		Font font =new Font("맑은 고딕",Font.PLAIN,70);
		viewChar= new JLabel("AaBbYyZz");///잠깐만,이걸 배치하고 가운데 문자넣기
		viewChar.setFont(font);
		
		//ListView
		fontDlm=new DefaultListModel<String>();
		fontListView =new JList<>(fontDlm);
		fontListView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//단일선택모드
		JScrollPane jsp1=new JScrollPane(fontListView);
		
		styleDlm=new DefaultListModel<String>();
		styleListView =new JList<>(styleDlm);
		styleListView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//단일선택모드
		JScrollPane jsp2=new JScrollPane(styleListView);
		
		sizeDlm=new DefaultListModel<String>();
		sizeListView =new JList<>(sizeDlm);
		sizeListView.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//단일선택모드
		JScrollPane jsp3=new JScrollPane(sizeListView);
		
		//JList - 글씨체 
		fontDlm.addElement("굴림");
		fontDlm.addElement("궁서체");
		fontDlm.addElement("Consolas");
		fontDlm.addElement("맑은고딕");
		fontListView.setSelectedIndex(0);
		
		//JList - 글꼴 스타일 
		styleDlm.addElement("일반");
		styleDlm.addElement("굵게");
		styleDlm.addElement("기울임꼴");
		styleDlm.addElement("굵은 기울임꼴");
		styleListView.setSelectedIndex(0);
		
		//JList - 크기 
		sizeDlm.addElement("8");
		sizeDlm.addElement("9");
		sizeDlm.addElement("10");
		for(int i=10;i<78;) {
			i=i+2;
			String size=String.valueOf(i);
			sizeDlm.addElement(size);
		}
		sizeListView.setSelectedIndex(0);
		
		//버튼
		cancleB=new JButton("취소");
		okayB=new JButton("확인");
		
		///////레이아웃////
		setLayout(null);
		//글꼴
		fontLb.setBounds(md.getX()-25, md.getY()-100, 180, 190);
		add(fontLb);
		fontT.setBounds(md.getX()-25, md.getY()+20, 180, 20);
		add(fontT);
		jsp1.setBounds(md.getX()-25, md.getY()+50, 180, 100);
		add(jsp1);
		//스타일
		styleLb.setBounds(md.getX()+200, md.getY()-100, 180, 190);
		add(styleLb);
		styleT.setBounds(md.getX()+200, md.getY()+20,180, 20);
		add(styleT);
		jsp2.setBounds(md.getX()+200, md.getY()+50, 180, 100);
		add(jsp2);
		//크기
		sizeLb.setBounds(md.getX()+425, md.getY()-100, 180, 190);
		add(sizeLb);
		sizeT.setBounds(md.getX()+425, md.getY()+20, 180, 20);
		add(sizeT);
		jsp3.setBounds(md.getX()+425, md.getY()+50, 180, 100);
		add(jsp3);
		//아래창
		viewL.setBounds(md.getX()+200,md.getY()+170,180,20);
		add(viewL);//보기
		viewChar.setBounds(md.getX()+200, md.getY()+190,380,150);
		viewChar.setBorder(new LineBorder(Color.red));
		add("Center",viewChar);//바뀌는 글씨
		//버튼
		okayB.setBounds(md.getX()+400, md.getY()+350, 90, 40);
		add(okayB);
		cancleB.setBounds(md.getX()+500, md.getY()+350, 90, 40);
		add(cancleB);
		/////////////레이아웃 끝///////////////////
		/////////////이벤트등록///////////////////
		FontInfoDialogEvt fide =new FontInfoDialogEvt(this);
		addWindowFocusListener(fide);
		addMouseListener(fide);
		fontListView.addMouseListener(fide);
		fontT.addMouseListener(fide);
		styleListView.addMouseListener(fide);
		styleT.addMouseListener(fide);
		sizeListView.addMouseListener(fide);
		sizeT.addMouseListener(fide);
		viewChar.addMouseListener(fide);
		//버튼
		okayB.addMouseListener(fide);
		cancleB.addMouseListener(fide);
		
	
		setBounds(md.getX()+100,md.getY()+100,700,500);
		setVisible(true);
		setResizable(false);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}//end FontInfoDialog

	public MemoDesign getMd() {
		return md;
	}

	public DefaultListModel<String> getFontDlm() {
		return fontDlm;
	}

	public DefaultListModel<String> getStyleDlm() {
		return styleDlm;
	}

	public DefaultListModel<String> getSizeDlm() {
		return sizeDlm;
	}

	public JList<String> getFontListView() {
		return fontListView;
	}

	public JList<String> getStyleListView() {
		return styleListView;
	}

	public JList<String> getSizeListView() {
		return sizeListView;
	}

	public JTextField getFontT() {
		return fontT;
	}

	public JTextField getStyleT() {
		return styleT;
	}

	public JTextField getSizeT() {
		return sizeT;
	}

	public JLabel getViewChar() {
		return viewChar;
	}

	public JButton getCancleB() {
		return cancleB;
	}

	public JButton getOkayB() {
		return okayB;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}// class
