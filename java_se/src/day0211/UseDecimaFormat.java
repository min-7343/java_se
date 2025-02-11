package day0211;

import java.text.DecimalFormat;

/**
 * 숫자형식의 사용.
 */
public class UseDecimaFormat {
	public UseDecimaFormat() {
		
		int temp= 2_500_000;  //java는 ,을 못 쓰는 대신 _를 사용한다. 출력해도 안나온다.
		//개발자가 코딩시 숫자에 대한 가독성을 향상시키기 위해 _를 사용.
		System.out.println(temp);//구분자로 사용된 _는 출력되지 않는다.
		
		DecimalFormat df=new DecimalFormat("0,000,000,000");
		System.out.println(df.format(temp)); //데이터가 없으면 0이 채워져서 출력
		
		DecimalFormat df2=new DecimalFormat("#,###,###,###");
		System.out.println(df2.format(temp)); //데이터가 있는 부분만 출력
		
		long l=8789457812354861321L;
		DecimalFormat df3=new DecimalFormat("#,###");
		System.out.println(df3.format(l)); //데이터가 있는 부분만 출력
		
		double d=2025.0211;
		DecimalFormat df4=new DecimalFormat("#,##0.00");  //letter은 혼합하여 사용가능
		System.out.println(df4.format(d)); //데이터가 있는 부분만 출력
		
		
	}//UseDecimaFormat

	public static void main(String[] args) {
		new UseDecimaFormat();

	}//main

}//class
