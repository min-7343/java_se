package firstProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1. 최다사용 키의 이름과 횟수 | java xx회 - ok
 * 2. 브라우저별 접속횟수, 비율
 * 3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수
 */
public class AnalysisMethods {

   
    private String[] logString; // log 한줄씩 읽어서 String배열에 저장
    private Map<String, Integer> wordCountMap; // 단어의 출현 횟수를 저장할 Map
    private Map<String, Integer> browserMap; // 브라우저별 접속 비율 계산할 Map
    private Map<String, Integer> succesMap; // 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수
    
    private List<String> keySet; // hashMap으로 얻은 Value으로 AllayList에 넣은곳 - 실질적인 정보를 뽑을 수 있다.
    
    ///// 1번
    // 먼저 단어 추출
    public void wordCount(String[] logString, int lineCount) {
    	
        wordCountMap = new HashMap<String, Integer>(); // 동일키 덮어쓰기
        for (int i = 0; i < lineCount; i++) {
            String currentLine = logString[i];

            int asIndex = currentLine.indexOf("key="); // "key="의 시작 인덱스 찾기
            if (asIndex != -1) {
                int startIndex = asIndex + 4; // "key=" 이후의 시작 위치
                int endIndex = currentLine.indexOf("&", startIndex); // "&"의 위치 찾기

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
        	String mostUsedKey=null; // 가장많이 사용된 키
        	int maxValue=0;// 가장 큰 Value
        	
            System.out.println("단어 출현 횟수:");
            for (Map.Entry<String, Integer> entry :wordCountMap.entrySet()) {
            	System.out.println(entry.getKey() + ": " + entry.getValue());
            
            	if(entry.getValue()>maxValue) {
            		maxValue=entry.getValue();
            		mostUsedKey=entry.getKey();
            	}
            }//end for 
            System.out.println("1번 제일많이 쓰인 키 : "+ mostUsedKey+ ", 횟수 : "+ maxValue );
        }//end if

        
        
        ///정렬해서 먼저 List에 넣어서 사용하자 안쓰면 지워/////////////////
        //ArrayList<>(wordCount.keySet()); -> 어레이리스트사용
        //나온 값으로 ArrayList 만들어서 사용면 keySet 사용할 수 있다.
        
       keySet=new ArrayList<>(wordCountMap.keySet()); 
        // value 값으로 오름차순 정렬
        keySet.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return wordCountMap.get(o2).compareTo(wordCountMap.get(o1));
			}//compare
        });//keySet.sort
      /*  
        //정렬한 것 출력
        System.out.println("------------\n정렬한 것 출력");
        for(String key : keySet) {
        	System.out.print("Key : "+ key);
        	System.out.println(" , Val : "+ wordCountMap.get(key));
        }
        
        System.out.println("최다사용 키의 이름과 횟수 : ");
        */
    
    } // wordCount
    
    //// 2번 브라우저별 접속횟수, 비율 - 전체 줄수 ( String[] logString, lineCount )
    public void accessCountRate(String[] logString, int lineCount) {
    	browserMap= new HashMap<String, Integer>();
        for (int i = 0; i < lineCount; i++) {
            String currentLine = logString[i];

            int asIndex = currentLine.indexOf("sist]["); // "key="의 시작 인덱스 찾기
            if (asIndex != -1) {
                int startIndex = asIndex + 6; // "key=" 이후의 시작 위치
                int endIndex = currentLine.indexOf("]", startIndex); // "&"의 위치 찾기

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
            for (Map.Entry<String, Integer> entry :browserMap.entrySet()) {
            	System.out.printf("%s : %d , 비율 : %.3f \n",entry.getKey(),entry.getValue(),((entry.getValue())/(double)lineCount)*100 );
            }//end for 
//            System.out.println("2번 제일많이 쓰인 키 : "+ mostUsedKey+ ", 횟수 : "+ maxValue );
        }//end if
    }//accessCountRate
    
    ////////////3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수-> 인덱스
    public void succesfullPerformance(String[] logString, int lineCount) {
    	succesMap= new HashMap<String, Integer>();
        for (int i = 0; i < lineCount; i++) {
            String currentLine = logString[i];

            int asIndex = currentLine.indexOf("["); //시작 인덱스=0
            if (asIndex != -1) {
                int startIndex = asIndex+1; // "key=" 이후의 시작 위치
                int endIndex = currentLine.indexOf("]", startIndex); // "&"의 위치 찾기

                // 챗이 넣어줌. 꼭필요한가???
                if (endIndex == -1) { // "]"가 없으면 줄 끝까지
                    endIndex = currentLine.length();
                }

                // "sist][" 뒤 "]"앞 단어
                String succesKey = currentLine.substring(startIndex, endIndex);

                // 단어의 출현 횟수 카운트
                succesMap.put(succesKey, succesMap.getOrDefault(succesKey, 0) + 1);
            } // end if
        } // end for
        // 출력 - 정 말 알 수 없 다....

        if (!succesMap.isEmpty()) {
            System.out.println("----\n2번 브라우저 별 접속 횟수:");
            for (Map.Entry<String, Integer> entry :succesMap.entrySet()) {
            	System.out.printf("%s : %d , 비율 : %.3f \n",entry.getKey(),entry.getValue(),((entry.getValue())/(double)lineCount)*100 );
            }//end for 
//            System.out.println("2번 제일많이 쓰인 키 : "+ mostUsedKey+ ", 횟수 : "+ maxValue );
        }//end if
    }//accessCountRat

}//class
