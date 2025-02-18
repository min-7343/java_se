package day0218;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

/**
 * ItemListenerDesign의 이벤트를 처리하기위해서 만들어진 클래스
 */
public class ItemListenerDesignEvent implements ItemListener, ActionListener {

	/**
	 * UseItemListenerDesign
	 * 
	 * @param uild
	 */
	private UseItemListenerDesign uild;

	public ItemListenerDesignEvent(UseItemListenerDesign uild) {
		this.uild = uild;

	}

	/**
	 * JTextField에서 이벤트가 발생되었을 때 호출되는 method
	 */
	@Override
	public void actionPerformed(ActionEvent e) { //입력시키는 곳
		JTextField jtfEmail=uild.getJtfDomain();
		JTextField jtfDomain=uild.getJtfDomain();
		//이메일과 도메인을 받아와서 이메일 형태의 문자열을 만들고
		StringBuilder outputEmail=new StringBuilder();
		outputEmail.append(jtfEmail.getText()).append("@")
		.append(jtfDomain.getText() );
		//JLabel에 이메일을 출력 - 출력란
		uild.getEmailOutput().setText(outputEmail.toString());
		
		//JTextFeild를 초기화
		jtfEmail.setText("");
		jtfDomain.setText("");
		
		jtfEmail.requestFocus();
		
	}// actionPerformed

	/**
	 * JComboBox에서 이벤트가 발생되었을 때 자동으로 호출 되는 method
	 */
	boolean runFlag;

	@Override
	public void itemStateChanged(ItemEvent e) { //콤보박스 - 도메인 선택, 직접입력 -> 아이템 선택시 변화
//		System.out.println(cnt);
//		cnt++;
		// 선택된 아이템을 받아와서 ( MVC Pattern 도입된 Component )
		// 사용자가 선택된 아이템의 번호를 받아와서 (Viewer)
		if (runFlag) {
			int selectedIndex = uild.getJcbDomain().getSelectedIndex();
			// 아이템 번호에 해당하는 아이템 값을 얻기( Model )
			String domain = uild.getDcbm().getElementAt(selectedIndex);
//			System.out.println(domain);
			//얻은 값을 JTextField Domain에 설정
			if("직접입력".equals(domain)) {
				domain="";
				uild.getJtfDomain().requestFocus();
			}//end if
			uild.getJtfDomain().setText(domain);
			
		} // endif
		runFlag = !runFlag;
		// 태생적으로 두번 찍힌다.
		// 한번만 찍을 수 있는 방법은?-> int 형은 데이터 형을 벗어면 오류 ->  boolean Flag

	}// itemStateChanged

}// class
