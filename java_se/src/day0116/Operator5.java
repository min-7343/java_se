package day0116;

/**
 * 논리 연산자<br>
 * 일반논리 : 여러 개의 관계연산자를 붙여서(묶어서) 비교해야 할 때 사용.
 * &&(AND): 전항과 후항이 모두 참일 때 true반환.
 * ||(OR) : 전항과 후항이 모두 false일때에만 false 반환.
 * 
 * 비트논리 : 비트를 연산할 때 사용 
 * & (AND) : 상위 비트와 하위비트 모두 1인 경우 1내림.
 * | (OR) : 상위 비트와 하위비트 모두 0인 경우 0내림.
 * ^ (XOR) : 상위 비트와 하위비트 둘중 하나만 1인 경우 1내림.
 */
public class Operator5 {

	public static void main(String[] args) {
		
	//	int i=1, j=16, k=1, l=16;
	//	System.out.println(i+" < "+j+"&& "+k+"<"+l+ "=" +(i<j && k<l));
		
		boolean flag=true, flag2=false, flag3=true, flag4=false;
		
		System.out.println("일반논리연산자");
		System.out.println(flag+" && "+flag3+" = "+(flag&&flag3));//true
		System.out.println(flag+" && "+flag2+" = "+(flag&&flag2));//false
		System.out.println(flag2+" && "+flag+" = "+(flag2&&flag));//true
		System.out.println(flag2+" && "+flag4+" = "+(flag2&&flag4));//false
		
		System.out.println(flag+" || "+flag3+" = "+(flag||flag3));//true
		System.out.println(flag+" || "+flag2+" = "+(flag||flag2));//false
		System.out.println(flag2+" || "+flag+" = "+(flag2||flag));//true
		System.out.println(flag2+" || "+flag4+" = "+(flag2&&flag4));//false
		
		flag=false;
		flag2=false;
		flag3=false;
		//후항을 연산하지 않는 예제 코드
		flag3 = (flag=(3>4)) && (flag2=(5<6));
		System.out.println(flag+ " && "+ flag2+" = "+ flag3);
		
	
		System.out.println("============= 비트논리연산자 =========");
		int i = 25;
		int j = 25;
		System.out.println(i+" & "+j+" = "+ (i&j));
		
		i=33;
		j=17;
		System.out.println(i+" | "+j+" = "+ (i|j));
		
		i=7;
		j=17;
		System.out.println(i+" ^ "+j+" = "+ (i^j));

		
		
	}//main

}//class
