package firstProject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Path를 사용하여 파일 읽어들이기. <br> - 전체를 불러올 수 있다.
 * Path path =Paths.get(selectedFile.getAbsolutePath());
 */
public class UseNioFile {

	public UseNioFile() throws IOException {
		//파일불러오기
		JFileChooser jfc=new JFileChooser();
		jfc.showOpenDialog(null);
		File selectedFile =jfc.getSelectedFile();
		
		if(selectedFile == null) {
			return ;
		}//end if
		//N I/O를 사용한 파일 내용 읽기
		
		//1. Path 얻기
		Path path =Paths.get(selectedFile.getAbsolutePath());
		
		//2. 파일의 모든 내용을 읽어들임
		List<String> allLines=Files.readAllLines(path);
		
		//JTextArea
		StringBuilder output=new StringBuilder();
		//읽어들인 파일의 내용을 출력하기 위해 StringBuilder에 저장
		for(String line: allLines) {
			output.append(line).append("\n");
		}//end for
		
		
		//비동기에 쓰면 안된다.
		JTextArea jta =new JTextArea(output.toString(),40,80);
		JScrollPane jsp=new JScrollPane(jta);
		JOptionPane.showMessageDialog(null, jsp);
		
		
	}//UseNioFile
	
	public static void main(String[] args) {
		try {
			new UseNioFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}//main

}//class
