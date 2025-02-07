package day0117;

/**
 * 단일 if 사용<br>
 * if (조건식){<br>
 * 	조건식 맞을 대 수행할 문장들..<br>
 *  }<br>
 *  
 *  절대값을 구하는 코드를 작성.
 */
public class Test_If {

	public static void main(String[] args) {
		int tempNum=-17;
		int abs = 0;//   2의 보수 -> - 붙이기
		
		if (tempNum <0) { //음수임
			abs = -tempNum;
		}
		
		System.out.println(tempNum+"의 절대값은 "+ abs+" 입니다.");	
	}
}
