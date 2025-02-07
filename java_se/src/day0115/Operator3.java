package day0115;
/**
shift 연산자 (비트밀기연산)
	<< ( left shift ) : 비트를 왼쪽으로 밀고, 밀어서 빈칸을 항상 0으로 채우는 일을 한다.
	>> ( righr shift ) : 비트를 오른쪽으로 밀고, 밀어서 빈칸을 최상위 부호 비트에 따라 양수면 0을 채우고, 음수면 1을 채운다.
	>>> ( unsigned right shift) : 비트를 오른쪽으로 밀고, 밀어서 빈칸을 항상  0으로 채운다.
*/
class Operator3 
{
	public static void main(String[] args) {
		int i =25; //0001 1001 -> 0110 0100 -> 64+32+4=100
		
		System.out.println(i+" << 2 = "+ (i<<2));//시프트은 산술보다 우선순위가 낮다. 괄호 필요.
		
		i=27; //0001 1011 ->0000 0011-> 3
		System.out.println(i + " >> 3 = "+ (i>>3));
		
		i=31; //0001 1111 -> 0000 0001 -> 1
		System.out.println(i + " >>> 4 = "+ (i>>4));
		
		i=1;//4byte (32개)
		System.out.println(i + " << 31  = "+ (i << 31));// ->보호비트까지 가서
		
	//	i=Integer.MAX_VALUE;
		i=-1;//1111 1111 1111 1111 1111 1111 1111 1111
		System.out.println(i + " >> 100  = "+ (i >> 100));// 다 1로 채워져서
		System.out.println(i + " >>> 1  = "+ (i >>> 1));
		//1111 1111 1111 1111 1111 1111 1111 1111 ->
		//0111 1111 1111 1111 1111 1111 1111 1111(1)
		
		
	}//main
}//class
