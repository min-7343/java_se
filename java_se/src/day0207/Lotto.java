package day0207;

public class Lotto {
	
	public static final int LOTTO_LENGTH=6;
	
	int[] num=new int[6];

	public void lottoMaker() {
		
		int temp=0;
		for(int i=0;i<LOTTO_LENGTH;i++) {
			temp=(int)(Math.random()*50);
			num[i]=temp;
			for(int j=i+1;j<LOTTO_LENGTH;j++) {
				if(num[i]==num[j]) {
					temp=temp=(int)(Math.random()*50);
				}//end if
			}//end for
		}//end for
		
		for(int i=0;i<LOTTO_LENGTH;i++) {
			if(num[i]>num[i+1]) {
				temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
			System.out.printf("%d\t"+num[i]);
		}
		
	}//lottoMaker
	
	public static void main(String[] args) {
		Lotto lot=new Lotto();
		lot.lottoMaker();
		
		
	}//main
	
	
	

}//class
