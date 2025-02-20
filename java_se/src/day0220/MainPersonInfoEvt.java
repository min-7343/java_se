package day0220;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JMenuItem;

public class MainPersonInfoEvt extends WindowAdapter implements ActionListener {

	private MainPersonInfo mp;
	private JButton bInset;
	private JButton bChage;
	private JButton bDelete;
	private JButton bClose;

	public MainPersonInfoEvt(MainPersonInfo mp) {
		this.mp = mp;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mp.getInset()) {

		}
		if (ae.getSource() == mp.getChange()) {

		}
		if (ae.getSource() == mp.getDelete()) {

		}
		if (ae.getSource() == mp.getClose()) {

		}

	}

}
