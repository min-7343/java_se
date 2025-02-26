package firstProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AnalysisMonitor extends JDialog {

    private int lineCount; // 파일 줄의 수 + String[] logString의 인덱스
    private String line; // 읽어들일 때 쓰이는 문자열 ( 널 값이면 반복문 끝 )
    private String[] logString; // log 한줄씩 읽어서 String배열에 저장
    private Map<String, Integer> wordCount; // 단어의 출현 횟수를 저장할 Map

    public AnalysisMonitor(PjLoginForm pj) {
        super(pj, "AnalysisMonitor", true);

        // 파일불러오기 (FileChooser은 기능 구현 후 만들기)
        File file = new File("C:/Users/USER/Desktop/프로젝트/sist_input_1.log");

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

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            StringBuilder sbR = new StringBuilder();
            //배열 초기화 하자....널 널 널하자니하어아러ㅓㅏㅣㅇ라 널 이셉션 아주 ㅋㅋㅋㅋㅋㅋ
            logString = new String[2000];//ㅋㅋㅋㅋㅋ1987줄이래...그러니깐 계속 에러났지...하

            while ((line = reader.readLine()) != null) {
                sbR.append(line).append("\n");
                logString[lineCount] = line;
                lineCount++; // 라인수 count
            } // end while
            textArea.setText(sbR.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일을 읽는 중 오류가 발생했습니다.", "파일 읽기 오류", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } // end catch

        //단어 카운트
        wordCount();

//        System.out.println(lineCount); //줄 1987...
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

   // 먼저 단어 추출
    public void wordCount() {
        wordCount = new HashMap<String, Integer>(); // 동일키 덮어쓰기
        for (int i = 0; i < lineCount; i++) {
            String currentLine = logString[i]; //챗이 넣어줌

            int asIndex = currentLine.indexOf("key="); // "key="의 시작 인덱스 찾기
            if (asIndex != -1) {
                int startIndex = asIndex + 4; // "key=" 이후의 시작 위치
                int endIndex = currentLine.indexOf("&", startIndex); // "&"의 위치 찾기

                //챗이 넣어줌. 꼭필요한가???
                if (endIndex == -1) { // "&"가 없으면 줄 끝까지
                    endIndex = currentLine.length();
                }

                // "key=" 뒤 "&"앞 단어
                String wordKey = currentLine.substring(startIndex, endIndex);

                // 단어의 출현 횟수 카운트
                wordCount.put(wordKey, wordCount.getOrDefault(wordKey, 0) + 1);
            } // end if

        } // end for

        // 출력 - 정 말 알 수 없 다....
        if (!wordCount.isEmpty()) {
            System.out.println("단어 출현 횟수:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            	System.out.println(entry.getKey() + ": " + entry.getValue() + "\n");
            }//end for //이제 for문 없어도 되는디... 이거 정렬해서 key값 출력하자...
        }//end if
        
    } // wordCount

} // class
