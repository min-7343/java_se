package day0203;

public class EmailUsefulness {
	public static final int MUST_LENGTH = 6;
	private String email;

	/**
	 * EmailUsefulness의 기본 생성자
	 */
	public EmailUsefulness() {

	}


	/**
	 * EmailUsefulness의 배개 변수를 받은 생성자
	 * 오버라이딩
	 * @param email 입력받은 이메일주소
	 */
	public EmailUsefulness(String email) {
		this.email = email;
	}

	/**
	 * 이메일의 유효성을 검사하는 method
	 * @param email 입력받은 이메일주소
	 */
	public void emailLengthAndId(String email) {

		int atIndex = email.indexOf("@");// @ 위치
		int dotIndex = email.indexOf("."); // . 위치

		System.out.println("----------------------------------------------------");
		System.out.println("검사할 email : "+ this.email);
		if (atIndex!=-1 && dotIndex != -1 && atIndex < dotIndex) {
			String userId = email.substring(0, atIndex);// @앞 부분
			String domain1 = email.substring(atIndex + 1, dotIndex);// @ 부터 . 까지
			String domain2 = email.substring(dotIndex + 1);// .이후
			if (userId.length() >= MUST_LENGTH) {
				if (email.contains("@")) {
					if (email.contains(".")) {
						if (!"".equals(userId.replaceAll("[A-Za-z0-9._%+-]+", ""))) {
							System.out.println("아이디 부분에 허용하지 않는 문자가 포함되었습니다.");	
							System.out.println("----------------------------------------------------");
							return;
						} // end else uerId
						if (!"".equals(domain1.replaceAll("[A-Za-z0-9.-]+", ""))) {
							System.out.println("@뒤에 허용하지 않는 문자가 포함되었습니다.");
							System.out.println("----------------------------------------------------");
							return;
						} // end else domain1
						if (!"".equals(domain2.replaceAll("[A-Za-z]{2,}", ""))) {
							System.out.println(".뒤에 허용하지 않는 문자가 포함되었습니다.");
							System.out.println("----------------------------------------------------");
							return;
						}else {
							System.out.println(this.email+" 은 유효한 아이디 입니다.");
						}//모든 검사를 하고 확인된 이메일 주소 출력(정상)
					} else {
						System.out.println(".이 없습니다.");
					} // end else.
				} else {
					System.out.println("@가 없습니다.");
					
				} // end else @
			} else {
				System.out.println("이메일의 길이가 유효하지 않습니다.");
				System.out.println("----------------------------------------------------");
			} // end else Length
		} else{
			System.out.println("유효한 이메일 주소가 아닙니다.");
		}
		System.out.println("----------------------------------------------------");
	}

	public static void main(String[] args) {
		String id1 = "test341@naver.com";
		String id2 = "redpen_7@ckd%.kf";
		String id3 = "bLuePen12ckda.kr";

		EmailUsefulness eu = new EmailUsefulness(id1);
		eu.emailLengthAndId(id1);
		
		EmailUsefulness eu2 = new EmailUsefulness(id2);
		eu2.emailLengthAndId(id2);
		
		EmailUsefulness eu3 = new EmailUsefulness(id3);
		eu3.emailLengthAndId(id3);
		
	}// main

}// class
