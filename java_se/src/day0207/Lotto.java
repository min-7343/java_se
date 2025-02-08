package day0207;

/*
 * 로또번호 만들기<br>
 * 6자리의 숫자 생성, 중복x , 오름차순 정렬<br>
 */
public class Lotto {
	public static final int LOTTO_LENGTH = 6; // 번호 6자리
	int[] num = new int[6];// 로또 번호를 저장하기 위한 6자리 배열

	public void lottoMaker() { // 로또 번호 만드는 메소드
		int temp = 0; // 임시 저장소

		for (int i = 0; i < LOTTO_LENGTH; i++) {
			temp = (int) (Math.random() * 45) + 1; // 1~45까지 랜덤 번호 생성.
			if (i > 0) {// index의 번호가 1이상일때부터
				for (int j = 0; j < i; j++) { // 그 전에 있는 번호들과 비교하여 같은 번호가 있으면 다시 번호를 만든다.
					if (num[j] == temp) {
//						temp = (int) (Math.random() * 45) + 1;
						i--;
						break;
					} // if
					num[i] = temp;
				} // for
			} //if
		} // for

		System.out.println("================= 로또 번호 =================");
		for (int i = 0; i < LOTTO_LENGTH; i++) { // 오름차순 정렬
			for (int j = i + 1; j < LOTTO_LENGTH; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				} // if
			} // for
			System.out.printf("%d\t", num[i]);
		} // for

	}// lottoMaker

	public static void main(String[] args) {
		Lotto lot = new Lotto();
		lot.lottoMaker();

	}// main

}// class
