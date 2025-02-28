package firstProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 1. 최다사용 키의 이름과 횟수 | java xx회 - ok 2. 브라우저별 접속횟수, 비율
 */
public class AnalysisMonitor extends JDialog {
	private String line; // 읽어들일 때 쓰이는 문자열 ( 널 값이면 반복문 끝 )
	private String[] logString; // log 한줄씩 읽어서 String배열에 저장
	private int lineCount; // 파일 줄의 수 + String[] logString의 인덱스

	public AnalysisMonitor(PjLoginForm pj) {
		super(pj, "AnalysisMonitor", true);

		AnalysisMethods am = new AnalysisMethods();

		// 파일불러오기 (FileChooser은 기능 구현 후 만들기)
		File file = new File("C:/Users/user/Desktop/07.조별과제/sist_input_1.log");

		if (!file.exists()) {
			JOptionPane.showMessageDialog(null, file + " 이 존재하지 않습니다. 경로를 확인하세요.", "파일 오류", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// log - 출력할 곳
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false); // 편집불가
		textArea.setLineWrap(true); // 줄바꿈 (false는 영역을 넘어간다.)

		// JTextArea - 글 읽어오기
		lineCount = 0; // 전체 line 세기 //문자열의 인덱스로 쓰자 => 문자열의 수는 +1
		line = "";

		logString = new String[2000];
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        ////StringBuilder	
           StringBuilder sbR = new StringBuilder();
            //배열 초기화
            //파일을 읽어와서 라인 수를 미리 계산하여, 그 값을 배열의 용량으로 정해야 하는데. 
            logString = new String[2000];//ㅋㅋㅋㅋㅋ1987줄이래...그러니깐 계속 에러났지...하

            while ((line = reader.readLine()) != null) {
                sbR.append(line).append("\n"); //줄단위로 출력
                logString[lineCount] = line;
                lineCount++; // 라인수 count
            } // end while
            textArea.setText(sbR.toString());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "파일을 읽는 중 오류가 발생했습니다.", "파일 읽기 오류", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} // end catch

		// 1.단어 카운트
		am.wordCount(logString, lineCount);
		// 2.브라우저별
		am.accessCountRate(logString, lineCount);
		// 3.세션별 
		am.succesfullPerformance(logString, lineCount);
		
		// 4.시간
		// 5. 403번 횟수, 비율
		am.unusualRequest(logString, lineCount);
		// 6. books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율 구하기
		am.requestBooks(logString, lineCount);
		
		
//      System.out.println(lineCount); //줄 1987...
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setBounds(50, 100, 510, 400);

		setLayout(null);
		add(jsp);

		//////////////////////////////////
		setBounds(100, 100, 1200, 600);
		setResizable(false); // 크기조절 불가
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	} // AnalysisMonitor

} // class
