package firstProject;

import javax.swing.JFileChooser;

public class AnalysisMonitor {
	
	private  PjLoginForm pj;
	
	public AnalysisMonitor(PjLoginForm pj) {
		
		JFileChooser jfcOpen=new JFileChooser(); //파일 창 띄우기
		jfcOpen.showOpenDialog(null);
		
		System.out.println("파일 분석");
		
		
		//창에
		//파일 불러와서 
		//파일 선택하기 창
		//분석 시작하기 버튼
		
		
	}//AnalysisMonitor

}//class
