package firstProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 1. 최다사용 키의 이름과 횟수 | java xx회 - ok 2. 브라우저별 접속횟수, 비율 - ok 3. 서비스를 성공적으로
 * 수행한(200)횟수,실패(404) 횟수- ok 4.﻿ 요청이 가장 많은 시간 [10시] 5. 비정상적인 요청(403)이 발생한 횟수 비율
 * 구하기 - ok 6. ﻿books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율 구하기 7. ﻿입력되는 라인에 해당하는 정보출력
 * ( 라인에 해당하는 정보출력 - ﻿1000~1500번째 라인에 해당하는 정보 중 최다사용 키의 이름과 횟수 | java/ xx회)-입력은
 * 시스템입력이나 InputDialog를 사용할 것
 */
public class AnalysisMethods {

	private String currentLine; // 현재 읽는 라인
	private int asIndex; // 찾는 인덱스 찾기
	private int startIndex; // 시작 인덱스
	private int endIndex; // 마지막 인덱스
	private Map<String, Integer> wordCountMap; // 1번 > 단어의 출현 횟수를 저장할 Map
	private Map<String, Integer> browserMap; // 2번 > 브라우저별 접속 비율 계산할 Map
	private Map<String, Integer> codeMap; // 3번,5번 >서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수
	private Map<String, Integer> booksMap; // 6번 > ﻿books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율 구하기

	private List<String> keySet; // hashMap으로 얻은 Value으로 AllayList에 넣은곳 - 실질적인 정보를 뽑을 수 있다.

	///// 1번
	// 먼저 단어 추출
	public void wordCount(String[] logString, int lineCount) {

		wordCountMap = new HashMap<String, Integer>(); // 동일키 덮어쓰기
		for (int i = 0; i < lineCount; i++) {
			currentLine = logString[i];

			asIndex = currentLine.indexOf("key="); // "key="의 시작 인덱스 찾기
			if (asIndex != -1) {
				startIndex = asIndex + 4; // "key=" 이후의 시작 위치
				endIndex = currentLine.indexOf("&", startIndex); // "&"의 위치 찾기

				// 챗이 넣어줌. 꼭필요한가???
				if (endIndex == -1) { // "&"가 없으면 줄 끝까지
					endIndex = currentLine.length();
				}

				// "key=" 뒤 "&"앞 단어
				String wordKey = currentLine.substring(startIndex, endIndex);

				// 단어의 출현 횟수 카운트
				wordCountMap.put(wordKey, wordCountMap.getOrDefault(wordKey, 0) + 1);
			} // end if
		} // end for
			// 출력 - 정 말 알 수 없 다....
		if (!wordCountMap.isEmpty()) {
			String mostUsedKey = null; // 가장많이 사용된 키
			int maxValue = 0;// 가장 큰 Value

			System.out.println("단어 출현 횟수:");
			for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());

				if (entry.getValue() > maxValue) {
					maxValue = entry.getValue();
					mostUsedKey = entry.getKey();
				}
			} // end for
			System.out.println("1번 제일많이 쓰인 키 : " + mostUsedKey + ", 횟수 : " + maxValue);
		} // end if

		/*
		 * ///정렬해서 먼저 List에 넣어서 사용하자 안쓰면 지워/////////////////
		 * //ArrayList<>(wordCount.keySet()); -> 어레이리스트사용 //나온 값으로 ArrayList 만들어서 사용면
		 * keySet 사용할 수 있다.
		 * 
		 * keySet=new ArrayList<>(wordCountMap.keySet()); // value 값으로 오름차순 정렬
		 * keySet.sort(new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) {
		 * 
		 * return wordCountMap.get(o2).compareTo(wordCountMap.get(o1)); }//compare
		 * });//keySet.sort
		 * 
		 * //정렬한 것 출력 System.out.println("------------\n정렬한 것 출력"); for(String key :
		 * keySet) { System.out.print("Key : "+ key); System.out.println(" , Val : "+
		 * wordCountMap.get(key)); }
		 * 
		 * System.out.println("최다사용 키의 이름과 횟수 : ");
		 */

	} // wordCount

	//// 2번 브라우저별 접속횟수, 비율 - 전체 줄수 ( String[] logString, lineCount )
	public void accessCountRate(String[] logString, int lineCount) {
		browserMap = new HashMap<String, Integer>();
		for (int i = 0; i < lineCount; i++) {
			currentLine = logString[i];

			asIndex = currentLine.indexOf("sist]["); // "key="의 시작 인덱스 찾기
			if (asIndex != -1) {
				startIndex = asIndex + 6; // "key=" 이후의 시작 위치
				endIndex = currentLine.indexOf("]", startIndex); // "&"의 위치 찾기

				// 챗이 넣어줌. 꼭필요한가???
				if (endIndex == -1) { // "]"가 없으면 줄 끝까지
					endIndex = currentLine.length();
				}

				// "sist][" 뒤 "]"앞 단어
				String browserKey = currentLine.substring(startIndex, endIndex);

				// 단어의 출현 횟수 카운트
				browserMap.put(browserKey, browserMap.getOrDefault(browserKey, 0) + 1);
			} // end if
		} // end for
			// 출력 - 정 말 알 수 없 다....

		if (!browserMap.isEmpty()) {
			System.out.println("----\n2번 브라우저 별 접속 횟수:");
			for (Map.Entry<String, Integer> entry : browserMap.entrySet()) {
				System.out.printf("%s : %d , 비율 : %.3f \n", entry.getKey(), entry.getValue(),
						((entry.getValue()) / (double) lineCount) * 100);
			} // end for
//            System.out.println("2번 제일많이 쓰인 키 : "+ mostUsedKey+ ", 횟수 : "+ maxValue );
		} // end if
	}// accessCountRate

	//// 3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수-> 인덱스
	public void succesfullPerformance(String[] logString, int lineCount) {
		codeMap = new HashMap<String, Integer>();
		asIndex = currentLine.indexOf("["); // "["의 시작 인덱스 찾기
		for (int i = 0; i < lineCount; i++) {
			currentLine = logString[i];
			if (asIndex != -1) {
				startIndex = asIndex + 1; // 이후의 시작 위치
				endIndex = currentLine.indexOf("]", startIndex); // "]"의 위치 찾기

				// 챗이 넣어줌. 꼭필요한가???
				if (endIndex == -1) { // 없으면 줄 끝까지
					endIndex = currentLine.length();
				}

				// "[" 뒤 "]"앞 단어
				String sessionKey = currentLine.substring(startIndex, endIndex);

				// 코드출현 횟수 카운트
				codeMap.put(sessionKey, codeMap.getOrDefault(sessionKey, 0) + 1);
			} // end if
		} // end for
			// 출력 - 정 말 알 수 없 다....
		if (!codeMap.isEmpty()) {
			Integer successKey = codeMap.get("200");
			Integer failKey = codeMap.get("404");
			System.out.println("----\n3번 성공 실패 횟수:");
			for (Map.Entry<String, Integer> entry : codeMap.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			} // end for
			System.out.println("[200] : " + successKey);
			System.out.println("[404] : " + failKey);
		} // end if
	}// accessCountRat

	//// 4. 요청이 가장 많은 시간 [10시]
	// 이건 패턴만들자...어어어 언제 배웠더라...ㅎㅎㅎㅎㅎㅎ
	Pattern pattern = Pattern.compile("");

	//// 5. 비정상적인 요청(403)이 발생한 횟수 비율 구하기
	public void unusualRequest(String[] logString, int lineCount) {
		int unusualCount = codeMap.get("403");
		double unusualRatio = 0;
		if (!codeMap.isEmpty()) {
			Integer unusualKey = codeMap.get("403");
			System.out.println("----\n5번 403 발생한 횟수:");
			for (Map.Entry<String, Integer> entry : codeMap.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			} // end for
			unusualRatio = ((double) unusualCount / lineCount) * 100;
			System.out.printf("[403] : %d , 비율 : %.3f\n", unusualKey, unusualRatio);
		} // end if
	}// unusualRequest

	//// 6. books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율 구하기
	public void requestBooks(String[] logString, int lineCount) {
		booksMap = new HashMap<String, Integer>();
		int booksCount = 0; // books 요청 횟수
		int errorBooks = 0;

		for (int i = 0; i < lineCount; i++) {
			currentLine = logString[i];
			if (currentLine.contains("books")) {
				booksCount++;
			} // end if
		} // end for
		
		String[] booksArray = new String[booksCount];
		for (int i = 0; i < lineCount; i++) {
			currentLine = logString[i];
			if (currentLine.contains("books")) {
				booksArray[i] = currentLine;//ArrayIndexOutOfBoundsException
				if (booksArray[i].contains("500")) {
					errorBooks++;
				} // end if
			} // end if
		} // end for
		double errorRatio = 0;
		System.out.println("----6번 books에 대한 요청 URL중 에러(500)가 발생한 횟수, 비율 ");
		if (errorBooks != 0) {
			errorRatio = (double)errorBooks / lineCount;
			System.out.printf("books [500] : %d ,비율 : %.3f", errorBooks, errorRatio);
		}else {
			errorRatio=0;
			System.out.printf("books [500] : %d ,비율 : %.3f", errorBooks, errorRatio);
		}
		
		
	}// requestBooks

}// class
