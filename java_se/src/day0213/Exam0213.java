package day0213;

import javax.swing.JOptionPane;

/**
 * Inpitdialog에 입력된 값을 넣어 업무를 처리하는 프로그램을 작성하세요.
 * 1.입력 데이터가 csv형태라면 ScoreVo객체를 생성하여 입력값을 할당하고
 * ScoreVO객체를 java.util.List에 추가하는 작업을 수행.
 * 그 후 사용자에게 다시 InputDialog를 제공한다.
 * 
 * 2. csv형태가 아니고 "출력"이 입력되면 java.util.List에 추가된 모든 ScoreVO객체의 값을 
 * Console에 아래와 같이 출력한다.
 * 예) 
 * 번호	 이름		자바	오라클점수	총점		평균
 * 1	강태일	95	97		xxx		xx.xx
 * 2	김영하	45	90		xxx		xx.xx
 * 
 * 번호는 출력시 사용하는 번호, 의미x
 * 
 * csv 형태가 아니고 "종료"가 입력되면 종료.
 */
public class Exam0213 {

	public static void main(String[] args) {
		StringBuilder inputMsg=new StringBuilder();
		inputMsg.append("\"이름,자바점수,오라클점수\"를 입력해주세요.\n")
		.append("\"출력\"을 입력하면 현재까지 입력된 값이 console에 출력됩니다.\n")
		.append("\"종료\"을 입력하면 프로그램이 종료됩니다.");
		
		String name = JOptionPane.showInputDialog(inputMsg,"강태일,98,90");
		// InputDialog-> 메시지를 받을 수 있다.
		
		
		
		
	}// main

}// class
