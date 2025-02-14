package day0214;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JpanelNorth extends JPanel {
	public JpanelNorth() {

		JLabel jlblName = new JLabel("이름");
		JTextField jtfName = new JTextField(15); // 필트 크기 설정
		JButton jbtnAdd = new JButton("입력");

		add(jlblName); //JPanel Add
		add(jtfName);
		add(jbtnAdd);

	}

}
