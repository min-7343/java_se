package day0217;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 글꼴 변경
 */
@SuppressWarnings("serial")
public class UseFont extends JFrame {
	public UseFont() {
		super("Font의 사용");
		
		//Non-Visual component
		Font font = new Font("궁서체", Font.BOLD,20);
		//Non-Visual component-색만들기, 특이한 색을 여러곳에 쓰기
		Color color =new Color(0x184252); //#지우고 0x붙이기
		Color color2=new Color(0xFED700);
		
		//컴포넌트 생성
		JLabel jlbl=new JLabel("라벨");
		JTextField jtf=new JTextField(10);
		JButton jbtn =new JButton("버튼");
		//폰트를 적용
		jlbl.setFont(font);//객체가 들어가면 has a 관계
		jtf.setFont(font);
		jbtn.setFont(font);
		//전경색(글자색)Forground
		//Constant 사용
		jlbl.setForeground(Color.blue);
		jtf.setForeground(Color.MAGENTA);
		jbtn.setForeground(Color.CYAN);
		
		//바닥색 변경Background
		jlbl.setBackground(Color.green);//라벨의 배경이 투명하여 바닥색이 보이지 않는다.
		jlbl.setOpaque(true);//불투명도를 true로 설정하면 바닥색이 보여진다.
		jtf.setBackground(Color.green);
		jbtn.setBackground(Color.green);//바닥색이 보이는 이유는 불투명도가 설정되었기 때문에
		jbtn.setContentAreaFilled(false);
		
		
		
		JTextArea jta=new JTextArea(5,30);
		jta.setFont(new Font("휴먼편지체", Font.BOLD|Font.ITALIC,25));
		jta.setForeground(color);
		//객체사용
		jta.setForeground(color);
		jta.setBackground(color2);
		JScrollPane jsp=new JScrollPane(jta);
		
		//배치관리자 설정
		setLayout(new FlowLayout());
		//컴포넌트 배치
		add(jlbl);
		add(jtf);
		add(jbtn);
		add(jsp);
		
		//윈도우 크기 설정
		setBounds(100,100,500,300);
		//사용자에게 보여주기
		setVisible(true);
		//윈도운 종료 처리
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//UseFont
	public static void main(String[] args) {
		new UseFont();
		
	}//main
}//class
