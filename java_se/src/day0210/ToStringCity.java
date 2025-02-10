package day0210;

import java.util.StringTokenizer;

/**
 *String data="서울시 강남구 역삼동,서울시 서초구 서초동.서울시 동대문구 동대문동``[경기도 수원시 망포동, 제주도 일도 이동,서울특별시 중구";
 *위의 데이터를 일차원 배열에 각 방에 넣어 반환하는 일을 하는 method를 만든다.
 *배열을 받아서 모두 출력하고, '서울'인 동시의 개수를 출력하세요.
 *1번 출력 : 
 *서울시 강남구 역삼동
 *서울시 서초구 서초동
 *서울시 동대문구 동대문동
 *경기도 수원시 망포동
 *제주도 일도 이동
 *서울특별시 중구
 *서울시는 4개입니다. 
 */
public class ToStringCity {
	public ToStringCity() {
		
		String data="서울시 강남구 역삼동,서울시 서초구 서초동.서울시 동대문구 동대문동[경기도 수원시 망포동,제주도 일도 이동,서울특별시 중구";
	
		int i=0;
		StringTokenizer st=new StringTokenizer(data,",.["); //입력받은 data를 ",",".","["로 나눠 Token을 만든다.
		int count=st.countTokens(); //토큰 개수
		int city_count=0; //'서울'이 들어간 수 
		String[] cityArr=new String[count]; //토큰을 저장하기 위한 배열
		
		while(st.hasMoreTokens()) { //토큰이 있다면 계속 반복
			cityArr[i]=st.nextToken(); //토큰을 배열에 순서대로 저장
			System.out.println(cityArr[i]);
			i++;
		}
		
		
		for(int j=0;j<cityArr.length;j++) {
			if(cityArr[j].contains("서울")) {
				city_count++;
			}//end if
		}//end for
		System.out.println();
		System.out.println("서울이 포함된 도시는 "+ city_count+"개 입니다.");
		
	}
	public static void main(String[] args) {
		new ToStringCity();
	}//main

}//class
