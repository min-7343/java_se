package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainPersonInfoEvt extends WindowAdapter implements ActionListener {

	private MainPersonInfo mpi;
	private JButton bInsert;
	private JButton bChage;
	private JButton bDelete;
	private JButton bClose;
	
	
	public MainPersonInfoEvt(MainPersonInfo mpi) {
		this.mpi = mpi;
	}
	private void windowClosing() {//windowClosing오버로딩- 윈도우 닫기 전처리 하기 위해(수정못하게)
		//윈도우를 종료하기 전에 처리해야할 코드
		mpi.dispose();
	}//WindowClosing
	
	@Override
	public void windowClosing(WindowEvent we) {//윈도우 이벤트
		windowClosing();
	}//windowClosing

	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		StringBuilder sb= new StringBuilder();
		String gender="";
		
		if (ae.getSource() == mpi.getInsert()) {
			String name=mpi.getName();
			String age=mpi.getJtAge().toString();
			if(mpi.getJrbMan().isSelected()) {
				gender="남";
			}else if(mpi.getJrbWoman().isSelected()) {
				gender="여";
			}
			String telNum=mpi.getJtTel().toString();
			
			sb.append(name).append(",").append(age).append(",").append(gender).append(",").append(telNum);
		}

		if (ae.getSource() == mpi.getChange()) {

		}
		if (ae.getSource() == mpi.getDelete()) {

		}
		if (ae.getSource() == mpi.getClose()) {
			windowClosing();
		}

	}


}
