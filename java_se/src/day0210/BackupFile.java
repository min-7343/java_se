package day0210;

/**
 * 파일명을 매개변수로 받는 method를 만들고, 입력된 파일명에 백업 파일명을 반환하는 일을 하는 method를 작성<br>
 * 만약 입력되는 파일명에 . 이 없다면 파일명의 가장 뒤에 _bak 붙여서 반환할 것.<br>
 */
public class BackupFile {
	/**
	 * 파일명에 "_bak"을 붙이기 위한 메소드
	 * @param fileName 입력받은 파일명
	 */
	public void backupFile(String fileName) {
		//append를 사용하기 위해 StringBuilder 객체 생성
		//수정을 하니깐 StrignBuffer가 아닌 StringBuilder사용.
		StringBuilder bf = new StringBuilder(); 
		
		bf.append(fileName); //아무것도 없는 df 객체에 파일명을 넣어준다.

		int index = 0; //'.'의 index번호 저장소.
		if (fileName.contains(".")) {  //파일명에 '.'이 있으면 
			index = fileName.lastIndexOf(".");
			bf.insert(index, "_bak"); //'.'의 인덱스 위치에 "_bak"을 넣어준다.
			System.out.printf("'.'이 있는 파일 : ");
		}else {
			bf.append("_bak"); //파일명에 '.'이 없으면 맨 끝에 "_bak"을 붙인다.
			System.out.printf("'.'이 없는 파일 : ");
		}
		
		System.out.println(bf);
	}
	
	public static void main(String[] args) {

		String DotFileName = "yellow.txt"; //'.'이 있는 파일명
		String NoDotFileName = "red"; //'.'이 없는 파일명
		
		BackupFile bf = new BackupFile(); //객체생성
		
		bf.backupFile(DotFileName);
		bf.backupFile(NoDotFileName);

		

	}// main

}// class
