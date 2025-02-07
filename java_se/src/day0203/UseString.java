package day0203;

/**
 * java.lang.String 클래스의 사용.
 */
public class UseString {// 다른 패키지라면 같은 이름의 클래스를 만들 수 있다.

	public UseString() {
		String str=""; //empty 초기화
		String str2=null;//null 초기화

		//null비교 : == 연산자 사용.
		System.out.println("str2의 null비교 : "+(str2 == null));//true
		System.out.println("str에 null 비교 : "+(str == null));//false
		
		//null인 값을 가진 문자열 객체는 method를 호출했을 때 error가 발생.
//		if(str2 != null) {
//			str2.isEmpty(); //null인 상태에서는 method 호출하지 않는다.->오류
//		}//end if
		
		System.out.println(str); // empty : 에러는 발생하지 않고, 아무값도 출력되지 않는다.
		//empty 비교
		//JDK1.5까지는 length() 사용
		System.out.println("str empty 비교 : "+ (str.length()==0));//true
		//JDK1.6부터는 isEmpty()사용 : 가독성 유리
		System.out.println("str empty 비교 : "+ str.isEmpty());//true
		
		if(str != null && !str.isEmpty()) {//객체가 생성되어 있고 empty가 아니었을 때 
			//일해!
		}//end if
		
		str ="   A BC   ";
		//문자열의 앞뒤공백 제거
		str2=str.trim();
		System.out.printf("[%s]의 앞 뒤 공백 제거[%s]\n",str,str2);
		
		
		str="자바는 OOP언어!";
		//문자열의 비교
		//문자열에 모든 값을 알아야 비교 : equals() -> 모든것이 똑같아야 한다.
		System.out.println(str.equals("자바는 OOP언어!")); //true
		System.out.println(str.equals("자바는 ooP언어!")); //false
		System.out.println(str.equals("자바는OOP언어!")); //false
		
		//문자열의 일부분의 값만 알아도 비교
		//해당문자열로 시작했는지? : startsWith("시작문자열")
		str="이장훈";
		str2="장재준";
		String str3="서장훈";
		//특정문자열로 시작했는지?
		System.out.println(str+ "은 '이'씨인가? " + str.startsWith("이"));//true
		System.out.println(str+ "은 '이'씨인가? " + (str.indexOf("이")==0));//true
		System.out.println(str2+ "은 '이'씨인가? " + str2.startsWith("이"));//true
		System.out.println(str3+ "은 '이'씨인가? " + str3.startsWith("이"));//false

		//특정문자열로 끝났는지?
		System.out.println(str+ "은 이름이 '장훈'인가? " + str.endsWith("장훈"));//true
		System.out.println(str2+ "은 이름이 '장훈'인가? " + str2.endsWith("장훈"));//false
		System.out.println(str3+ "은 이름이 '장훈'인가? " + str3.endsWith("장훈"));//true
	
		//특정문자열을 포함하고 있는지?
		System.out.println(str+ "은 이름에 '장'이 포함되었는가? " + str.contains("장"));//true
		System.out.println(str+ "은 이름에 '장'이 포함되었는가? " + (str.indexOf("장")!=-1));//true
		System.out.println(str2+ "은 이름이'장'이 포함되었는가? " + str2.contains("장"));//true
		System.out.println(str3+ "은 이름이 '장'이 포함되었는가?" + str3.contains("장"));//true
		
		str = "Java Oracle";
		str2=str.replace("a", "A");
		System.out.println(str2);
		
		str2= str.replaceAll("a","AA");
		System.out.println(str2);
		
		String msg="나 지금 피씨방인데, 넌 어디니 씨 방새야?";
		
//		String filter=msg.replaceAll("씨방", "**");
//		String filter=msg.replace("씨","*");
//		filter=filter.replace("방","*");
		
		
		//method chain사용( method의 반환형이 참조형일때 method를 연결하여 계속 호출하는 것.
		//객체명.method명(), method명().method명()...;
		String filter=msg.replaceAll("씨","*").replaceAll("방","*").replaceAll("ㅆ","*");
		
		System.out.println("원본: "+msg);
		System.out.println("필터: "+filter);
		
		//원하는 형식의 문자열 생성
		int year=2025;
		double height=175.2;
		
		String formatStr=String.format("올해는 %d년 내 키는 %f",year, height);
		
		System.out.println(formatStr);
		
		//정규식 (RegEx)
		msg="hello! 자바 010-1234-5678 내 나이는 25살이고 우리집 번지는 19-1번지";
		
		//숫자 패턴   \\d
		//문자열에서 모든 숫자를 *로 처리(마스킹처리)
		str=msg.replaceAll("\\d{2}", "*");//숫자가 두 개 나온다면 치환
		System.out.println("원본 문자열 : "+ msg);
		System.out.println("치환된 문자열 : "+ str);
		//문자열 안에서 전화번호 형식을 변경
		str=msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})","***-****-****");
		System.out.println("치환된 문자열 : "+str);
		//그룹의 값을 보여줄 때
		str=msg.replaceAll("(\\d{3})-(\\d{4})-(\\d{4})", "$1-****-$3");
		System.out.println("그룹의 값 노출: "+str);
		
		//010-x345-6789
		
		str= msg.replaceAll("(\\d{3})-(\\d{1})(\\d{3}-\\d{4})", "$1-x$3");
		System.out.println(str);
		
		//나이만 **살
		str=msg.replaceAll("(\\d{2})","**");
		System.out.println("그룹의 값 노출: "+str);

		//긍정형 전방 탐색(  (?=값)  )
		str=msg.replaceAll("(\\d{2})(?=살)","**");
		System.out.println("긍정형 전방 탐색: "+str);

		//긍정형 후방 탐색(  (?<=값)  )
		str=msg.replaceAll("(?<=는 )(\\d{2})","**");
		System.out.println("긍정형 후방 탐색: "+str);

		//긍정형 전방후방 탐색(  (?<=값)그룹(?=값)  )
		str=msg.replaceAll("(?<=나이는 )(\\d{2})(?=살)","**");
		System.out.println("긍정형 후방 탐색: "+str);
		
		//문자열
		msg="가나다 Test ~0abc test 자바 z Z1o9!";
		System.out.println(msg.replaceAll("[Test]", ""));//'T','e','s','t' 각각 찾는다. : 범위가 아님.
		System.out.println(msg.replaceAll("[A-Z]", ""));//대문자만 없애기
		System.out.println(msg.replaceAll("[a-z]", ""));//소문자만 없애기
		System.out.println(msg.replaceAll("[0-9]", ""));//숫자만 없애기
		System.out.println(msg.replaceAll("[~!.,@#]", ""));//특수문자 없애기(범위가 없어 각각 써야 한다.
		System.out.println(msg.replaceAll("[ㄱ-힣]", ""));//한글 없애기[ㄱ-힣]
//		
//		String id="!Test123~+";
//		if(!"".equals(id.replaceAll("[A-Za-z0-9~+]",""))) {
//			System.out.println("아이디에 허용하지 않는 문자가 포함되었습니다.");
//			return ;
//		}//end if
		
		msg="hello! 내 이메일은 test@test.com 입니다.";
		str= msg.replaceAll("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b", 
				"xxx@xxx.xxx");//회원가입할 때 다 쳐내야 한다.
		System.out.println("원본 메시지 : "+ msg);
		System.out.println("정규식으로 치환 : "+ str);
		
		int i=3;
//		str=i; // error
		str = String.valueOf(i);
		System.out.printf("str=%s, i=%s\n",str,i);
		
		boolean b= false;
//		str=b; //error
		str=String.valueOf(i);
		System.out.printf("str=%s, b=%b\n", str,b);
		
		
		
	}//UseString

	public static void main(String[] args) {
		
//		UseString us=new UseString();
		//us라는 객체명으로 변수나 method를 호출하지 않는다. 
		//변수를 사용하면 메모리를 사용하게 된다. 변수(객체)르 사용하지 않는다. 경고 발생.
		//=> 해결 : 객체명을 선언하지 않는 객체화 : new 생성자();
		new UseString();

	}// main

}// class
