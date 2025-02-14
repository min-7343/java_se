package day0214;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UseLayout extends JFrame {
	public UseLayout() {
		
		JTextField jtfNumber = new JTextField(); //textFile
		String[] btnLabel="7,8,9,4,5,6,1,2,3,+/-,0,.".split(",");
		JButton[] btnArr=new JButton[btnLabel.length];
		
		JPanel jpCenter=new JPanel();
		jpCenter.setLayout(new GridLayout(4,3)); //F->G
		
		for(int i=0;i<btnArr.length;i++) {
			//String 배열 방의 값으로 JButton배열의 방을 생성하고
			btnArr[i]=new JButton(btnLabel[i]);
			//생서오딘 JButton을 JPanel 배치
			jpCenter.add(btnArr[i]);
		}//end for
		
		//윈도우 컴포넌트에 컴포넌트를 배치
//		setLayout(null); 배치 관리자 해제
		add("North", jtfNumber);
		add("Center",jpCenter);
		
		setSize(250,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new UseLayout();
	}

}
