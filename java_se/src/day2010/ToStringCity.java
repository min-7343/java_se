package day2010;

import java.util.StringTokenizer;

/**
 *String data="서울시 강남구 역삼동,서울시 서초구 서초동.서울시 동대문구 동대문동``[경기도 수원시 망포동, 제주도 일도 이동,서울특별시 중구";
 *위의 데이터를 일차원 배열에 각 방에 넣어 반환하는 일을 하는 method를 만든다.
 *배열을 받아서 모두 출력하고, '서울'인 동시의 개수를 출력하세요.
 *1번 출력 : 

서울시 강남구 역삼동
서울시 서초구 서초동
서울시 동대문구 동대문동
경기도 수원시 망포동
제주도 일도 이동
서울특별시 중구

서울시는 4개입니다. 
 */
public class ToStringCity {
	public ToStringCity() {
		
		String data="서울시 강남구 역삼동,서울시 서초구 서초동.서울시 동대문구 동대문동[경기도 수원시 망포동,제주도 일도 이동,서울특별시 중구";
	
		int i=0;
		StringTokenizer st=new StringTokenizer(data,",.[");
		int count=st.countTokens();
		int city_count=0;
		String[] city=new String[count];
		
//		System.out.println(st);
		
		while(st.hasMoreTokens()) {
			city[i]=st.nextToken();
			System.out.println(city[i]);
			i++;
		}
		
		
		for(int j=0;j<city.length;j++) {
			if(city[j].contains("서울")) {
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
