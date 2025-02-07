package day0207;

import java.util.Arrays;

import day0120.ZodiacStr;

public class UseSplit {

	public static void main(String[] args) {
		String result="";
		int birth=2025;
		
//		String[] zodiacArr= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		
//		String data="원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양";
//		String[] zodiacArr=data.split(","); //메소드 반환형 = 값 
//		
//		
//		result=zodiacArr[birth%12];
//		System.out.println(birth+ "년생은 "+"원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",")[birth%12]+"띠입니다.");
	
		result="원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",")[birth%12];
		System.out.println(birth+ "년생은 " + result + "띠입니다.");
		
		String data="자바~오라클~HTML~CSS";  //'~'로 구분된 csv데이터
		System.out.println(Arrays.toString(data.split("~")));
	
	}

}
