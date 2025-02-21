package kr.co.sist.user.memo;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SubWinMemo extends JDialog {
	
	private JButton subjb;
	
	public SubWinMemo(MemoDesign md) {
		super(md,"메모장 정보",true);
		
		JTextArea subJtCenter = new JTextArea();
		subjb=new JButton("닫기");
		
		add(subJtCenter);
		add(subjb);
		
		subJtCenter.setSize(300,200);
		setBounds(50,50,300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JButton getSubjb() {
		return subjb;
	}

}
