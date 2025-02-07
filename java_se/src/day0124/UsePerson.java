package day0124;

public class UsePerson {

	public static void main(String[] args) {
		//객체 생성 -> 클래스의  instance 변수가 초기화
		Person ogong=new Person();//사람이 태어남
		
//		ogong.setEye(2);
//		ogong.setNose(1);
//		ogong.setMouth(1);
		ogong.setName("손오공");
		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n",
				ogong.getName(), ogong.getEye(),
				ogong.getNose(),ogong.getMouth());
		
		Person krillin = new Person(2,0,1);
		
//		krillin.setEye(2);
//		krillin.setNose(0);
//		krillin.setMouth(1);
		krillin.setName("크리닝");
		
		System.out.printf("%s의 눈 %d개, 코 %d개, 입 %d개\n",
				krillin.getName(), krillin.getEye(),
				krillin.getNose(),krillin.getMouth());
	
		//기능을 사용
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("김밥",5000));
		
		System.out.println(krillin.eat());
		System.out.println(krillin.eat("돈가츠",10000));
		
		//자신의 객체를 생성하고, 기능을 사용해 보자
		
		Person min=new Person();
		
		min.setEye(2);
		min.setNose(1);
		min.setMouth(1);
		min.setName("김민경");
		
		System.out.println(min.eat());
		System.out.println(min.eat("보쌈", 7500));
	}//main

}//class
