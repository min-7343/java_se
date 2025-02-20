package day0220;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UseJOptionPane extends JFrame {

	private JButton jbtnInput;
	private JButton jbtnMessage;
	private JButton jbtnConfirm;

	private UseJOptionPane ujp;// 부모

	public UseJOptionPane() {
		super("JOptionPane 사용");
		jbtnInput = new JButton("Input Dialog");
		jbtnMessage = new JButton("message Dialog");
		jbtnConfirm = new JButton("confirm Dialog");

		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnInput);
		jpCenter.add(jbtnMessage);
		jpCenter.add(jbtnConfirm);

		add("Center", jpCenter);
		ujp = this;// UseJOptionPane의 주소 넣어주기(이너에서 쓰기 위해)

		// 이벤트 등록
		// 정석
		UseJOptionPane.InnerEvent ie = this.new InnerEvent();
		jbtnInput.addActionListener(ie);
		jbtnMessage.addActionListener(ie);
		jbtnConfirm.addActionListener(ie);

		setBounds(100, 100, 400, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// UseJOptionPane

	////////////// inner class의 시작/////////////////////

	public class InnerEvent implements ActionListener {
		// 추상메소드(ActionListener) 오버라이딩 안하면 오류난다.
		// alt shift s ->ActionListener 를 오버라이딩
		public void useInputDialog() {
//			String name=JOptionPane.showInputDialog("당신의 이름을 입력해 주세요");
			// 원래는 부모가 있어야 한다,
			String name = JOptionPane.showInputDialog(ujp, "당신의 이름을 입력해 주세요", "너의 이름은?"
					, JOptionPane.PLAIN_MESSAGE);
			// 부모에 this를 넣으면 InnerEvent가 부모가 된다.
			// 부모창에서 정의 해준다. ujp
			// JOptionPane.PLAIN_MESSAGE : 옆에 나오는 아이콘 변경- 플레인은 아이콘이 없다.
			setTitle(name + "-님 어서오고!");
			// 취소했을 때 null처리
			if (name != null) {
				setTitle(name + "-님 어서오고");
			} // end if

		}// useInputDialog

		public void useInputMessageDialog() {
			// 이름을 입력하고 메시지를 다이얼로그를 클릭하면 나온다.
//			JOptionPane.showMessageDialog(ujp, ujp.getTitle());
//			JOptionPane.showMessageDialog(ujp, "오전시간 수고하셨습니다\n 맛점하세요");
			JOptionPane.showMessageDialog(ujp, "오전시간 수고하셨습니다\n 맛점하세요", "오늘의 메시지 ", JOptionPane.ERROR_MESSAGE);
			// 아이콘부분J OptionPane.INFORMATION_MESSAGE

		}// useInputDialog

		public void useConfirmDialog() {
//			int selecBtnInd=JOptionPane.showConfirmDialog(ujp, "점심 맛잇게 먹었나요.");
			int selecBtnInd=JOptionPane.showConfirmDialog(ujp, "점심 맛잇게 먹었나요.","오늘은 점심은",
					JOptionPane.YES_NO_CANCEL_OPTION);
			//버튼의 개수를 설정 : YES_OPTION, NO_OPTION: 예 아니오 버튼 제공
			//YES_NO_CANCEL_OPTION : 예 아니오 취소 버튼 제공
//			System.out.println(selecBtnInd);
			switch(selecBtnInd) {
			case JOptionPane.OK_OPTION: //0
				JOptionPane.showMessageDialog(ujp,"식당이 어디일까요?");
				break;
			case JOptionPane.NO_OPTION: //1
				JOptionPane.showMessageDialog(ujp,"내일 맛있는 식사하세요");
				break;
			}//end switch
		}// useInputDialog

		@Override
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == jbtnInput) {
				useInputDialog();
			} // end if
			if (ae.getSource() == jbtnMessage) {
				useInputMessageDialog();
			} // end if
			if (ae.getSource() == jbtnConfirm) {
				useConfirmDialog();
			} // end if

		}// actionPerformed

	}// InnerEvent

//////////////inner class의 끝/////////////////////
	public static void main(String[] args) {
		new UseJOptionPane();
//		JOptionPane.showMessageDialog(null, "메시지");
		// 메시지 다이얼 로그- 사용자에게 단순 메시지, 주의 환기용메시지
//		JOptionPane.showConfirmDialog(null, "오전에 수고하셨습니까");

	}// main

}// class