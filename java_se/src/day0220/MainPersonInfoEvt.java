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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainPersonInfoEvt extends WindowAdapter implements ActionListener {
	
	private PersonInfo user; //사용자 정보-만들 객체들//
	
	private MainPersonInfo mpi;//

	
	
	public MainPersonInfoEvt(MainPersonInfo mpi) {
		this.mpi = mpi;
	}
	
	
	/////////////4번 버튼이벤트 시작///////////
	private void windowClosing() {//windowClosing오버로딩- 윈도우 닫기 전처리 하기 위해(수정못하게)
		mpi.dispose();
	}//WindowClosing
	
	@Override
	public void windowClosing(WindowEvent we) {//윈도우 이벤트
		windowClosing();
	}//windowClosing
	//////////////4번 버튼이벤트 끝///////////
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String gender="";
		//추가버튼
		if (ae.getSource() == mpi.getInsert()) {
			String name=mpi.getJtName().getText();//toString()하면 안나옴 오류.당연하잖아...
			String ageText=mpi.getJtAge().getText();
			int age=Integer.parseInt(ageText);
			if(mpi.getJrbMan().isSelected()) {
				gender="남";
			}else if(mpi.getJrbWoman().isSelected()) {
				gender="여";
			}
			String telNum=mpi.getJtTel().getText();
			
			user = new PersonInfo(name,age,gender,telNum);
            
			mpi.getPersonList().add(user);
            mpi.getPdlm().addElement(user);

            //초기화
            mpi.getJtName().setText("");
            mpi.getJtAge().setText("");
            //////////왜 초기화안되는 거야...성별 라디오버튼 초기화 안됨.확인할것
            mpi.getJrbMan().setSelected(false);
            mpi.getJrbWoman().setSelected(false);
            mpi.getJtTel().setText("");

		}
		//수정버튼
		if (ae.getSource() == mpi.getChange()) {
			int selectIndex = mpi.getPersonListView().getSelectedIndex();
			if(selectIndex>=0) {
                PersonInfo selectUser = mpi.getPdlm().getElementAt(selectIndex);
                mpi.getJtName().setText(selectUser.name);
         /////////////할 곳. 아 나이 왜안되니.............다른거부터하자...확인할것
                mpi.getJtAge().setText(String.valueOf(selectUser.age));
                mpi.getJtTel().setText(selectUser.telNum);
                if (selectUser.gender.equals("Male")) {
                	mpi.getJrbMan().setSelected(true);
                } else {
                	mpi.getJrbWoman().setSelected(true);
                }
                mpi.getPdlm().removeElementAt(selectIndex);//모델 삭제-removeElementAt
                mpi.getPersonList().remove(selectIndex);//리스트 삭제remove
			}
		}
		//삭제버튼
		if (ae.getSource() == mpi.getDelete()) {
			int deleteIndex=mpi.getPersonListView().getSelectedIndex();
			mpi.getPdlm().removeElementAt(deleteIndex);
			mpi.getPersonList().remove(deleteIndex);
		}
		//종료버튼
		if (ae.getSource() == mpi.getClose()) {
			windowClosing();
		}
	}
}
