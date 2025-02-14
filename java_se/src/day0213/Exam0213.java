package day0213;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Inpitdialog에 입력된 값을 넣어 업무를 처리하는 프로그램을 작성하세요. 1.입력 데이터가 csv형태라면 ScoreVo객체를
 * 생성하여 입력값을 할당하고 ScoreVO객체를 java.util.List에 추가하는 작업을 수행. 그 후 사용자에게 다시
 * InputDialog를 제공한다.
 * 
 * 2. csv형태가 아니고 "출력"이 입력되면 java.util.List에 추가된 모든 ScoreVO객체의 값을 Console에 아래와 같이
 * 출력한다. 예) 번호 이름 자바 오라클점수 총점 평균 1 강태일 95 97 xxx xx.xx 2 김영하 45 90 xxx xx.xx
 * 
 * 번호는 출력시 사용하는 번호, 의미x
 * 
 * csv 형태가 아니고 "종료"가 입력되면 종료.
 */
public class Exam0213 {

	private List<ScoreVO> scoreList;

	public int cnt = 0;

	private String name = "";
	private String java = "";
	private String oracle = "";

	public Exam0213() {
		scoreList = new ArrayList<ScoreVO>();
		inputMenu();
	}// Exam0213

	public void inputMenu() {

//      inputMsg.append("\"이름,자바점수,오라클점수\"를 입력해주세요.\n")
//      .append("\"출력\"을 입력하면 현재까지 입력된 값이 console에 출력됩니다.\n")
//      .append("\"종료\"을 입력하면 프로그램이 종료됩니다.");
		String inputDialog = JOptionPane.showInputDialog("\"이름,자바점수,오라클점수\"를 입력해주세요.\n");

		while (true) {
			
			if (inputDialog.contains(",")) {
				String[] score = inputDialog.split(",");
				addScoreData(score);
				inputMenu();
			}else if (inputDialog.equals("종료") || inputDialog == null) {
				printData();
				exitProg();
			}else if(inputDialog.length()<0) {
				System.out.println("형식에 맞지 않습니다.");
			}
		}
	}

//
	public void addScoreData(String[] score) {

		ScoreVO sv = new ScoreVO();
		String name = "";
		int javaInt = 0;
		int oracleInt = 0;

		sv.setName(score[0]);
		name = sv.getName();
		javaInt = Integer.parseInt(score[1]);
		sv.setJava(javaInt);
		oracleInt = Integer.parseInt(score[2]);
		sv.setOracle(oracleInt);

		scoreList.add(sv);
//		scoreList.add(new ScoreVO(sv.getName(),sv.getJava(),sv.getOracle()));
	}

	public void printData() {

		int sum = 0;
		double arg = 0;

		for (int i = 0; i < scoreList.size(); i++) {
			sum = +scoreList.get(i).getJava() + scoreList.get(i).getOracle();
			arg = sum / 2;
			System.out.println((i + 1)+"\t" + scoreList.get(i).getName() + "\t" + scoreList.get(i).getJava() + "\t"
					+ scoreList.get(i).getOracle() + "\t" + sum + "\t" + arg);
		}

	}

//
	public void exitProg() {
		System.exit(0);
		toString();
		printData();
	}
//      String name = JOptionPane.showInputDialog(inputMsg,"강태일,98,90");

}// class
