package day0131;

/**
 * String (문자열)을 저장할 수 있는 데이터형 java.lang.String<br>
 * 기본형 형식으로 사용) - new를 사용하지 않고 java.lang.String을 사용.<br>
 * String str="abc"<br>
 * 참조형 형식으로 사용) - new를 사용하여 java.lang.String을 사용.<br> 
 * String str=new String(abc)<br>
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식의 사용.
		String str = "Abc";
		
		//참조형 형식의 사용.
		String str2=new String("Abc");
		
		System.out.println("기본형 str : "+ str);
		System.out.println("참조형 str2 : "+ str2);
		
		// ==은 참조형 데이터형(class, String, array)에 사용하면 주소가 같니?
		System.out.printf("기본형 %s 와 Abc 는 %b \n", str, str == "Abc");
//		System.out.printf("기본형 %s 와 Abc 는 %b \n", str, str == "Abcd");
		System.out.printf("참조형 %s 와 Abc 는 %b \n", str2, str2 == "Abc");
		//문자열을 비교할때는 equals 함수를 사용하여 비교
		
		//equals method는 기본형 형식이든 참조형 형식이든 동일한 비교를 수행.
		System.out.printf("기본형 equals 비교 %s 와 Abc 는 %b \n", str, str.equals("Abc"));
		System.out.printf("참조형 equals 비교 %s 와 Abc 는 %b \n", str2, str2.equals("Abc"));
		
		str = "AbcdEf";
//		String email = "rurouni5181@hotmail.com"; //강사님 메일 : 23
		String email = new String("rurouni5181@hotmail.com"); //강사님 메일 : 23
		//기본형, 참조형 모두 같다.
		System.out.println(str + " 의 글자 수 : "+ str.length());
		int emailLength=email.length();
		System.out.println(email + " 의 글자 수 : "+ emailLength);
		
	    //모두 대문자로
	    String upperCase=str.toUpperCase();
	    System.out.printf("%s를 모두 대문자로 변환 : %s\n",str,upperCase);
	    System.out.printf("%s를 모두 대문자로 변환 : %s\n",email,email.toUpperCase());
	      
	    //모두 소문자로
	    System.out.printf("%s를 모두 소문자로 변환 : %s\n",str,str.toLowerCase());

		//str ="AbcdEf"
		//      012345
		// 특정인덱스의 문자 얻기
		System.out.printf("%s의 3번째 인덱스에 해당하는 문자 얻기  %c \n",str, str.charAt(3));
		int index=5;
		char tempChar=str.charAt(index);
	
		System.out.printf("%s의 %d번째 인덱스에 해당하는 문자 얻기  %c \n",str,index, tempChar);
		
		//email의 처음부터 끝까지의 문자를 잘라서 한자씩 줄변경하여 출력해 보세요.
		System.out.printf("%s 를 한글자씩 출력\n", email);
		for(int i=0;i<email.length();i++) {
			System.out.println(email.charAt(i));
		}
		
		System.out.printf("%s에서 %s문자열의 시작 인덱스 %d\n", str, "c", str.indexOf("c"));
		System.out.printf("%s에서 %s문자열의 시작 인덱스 %d\n", str, "dEf", str.indexOf("dEf"));
		//존재하지 않는 문자열을 입력하면 -1이 반환된다.
		System.out.printf("%s에서 %s문자열의 시작 인덱스 %d\n", str, "C", str.indexOf("C"));
		System.out.printf("%s에서 %s문자열의 시작 인덱스 %d\n", str, "def", str.indexOf("def"));
		
		//	 0123456789
		str="java는 완벽한 OPP언어a yo!";//(L-> R 방향으로 찾는다. 두번째'a'찾기 )
		System.out.printf("%s에서 처음 나오는 %s문자열의 시작인덱스 %d\n", str, "a", str.indexOf("a",2));
		System.out.printf("%s에서 처음 나오는 %s문자열의 시작인덱스 %d\n", str, "a", str.indexOf("a",str.indexOf("a")+1));
		//처음 시작하는 a의 자리를 넣어서 그 다음 a찾기
		
		//문자열의 뒤에서부터 특정문자열의 인덱스 얻기
		System.out.printf("%s에서 가장 마지막에 나오는 %s문자열의 시작인덱스 %d \n",str, "a", str.lastIndexOf("a"));
		
		str="AbcdEfg";
		//   01234567
		System.out.printf("%s에서 2~4번째 인덱스에 해당하는 하위문자열 %s\n", str,str.substring(2,5));//(2,4)->cd (2,5)->cdE
		System.out.printf("%s에서 3번째 인덱스에서부터 끝까지 해당하는 하위문자열 %s\n", str,str.substring(3, str.length()));
		//dEfg
		System.out.printf("%s에서 3번째 인덱스에서부터 끝까지 해당하는 하위문자열 %s\n", str,str.substring(3));
		//dEfg끝인덱스 안 써도 된다.
		
		//email에서 메일주소, 도메인 주소를 분리해서 출력해보세요.
		//email = "rurouni5181@hotmail.com"
		System.out.printf("도메인 주소 : %s \n메일주소 : %s \n", email.substring(0,11), email.substring(12));
	}//main
}//class
