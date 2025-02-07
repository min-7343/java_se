package day0206;

public class UseKeyboard {

	public static void main(String[] args) {
		
		MembraneKeyboard memb=new MembraneKeyboard();
		
		ContactlessKeyboard conl=new ContactlessKeyboard();
		
		memb.setName("멤브레인");
		memb.rubberDome();
		memb.wherePrefer();
		memb.maxInputCount(3);
		memb.maxInputCount(4);
		System.out.println("-----------------------------------------");
		
		conl.setName("무접점");
		conl.rubberDome();
		conl.wherePrefer();
		conl.capacitance(40);
		conl.capacitance(90);
		conl.capacitance(120);
		
		System.out.println("-----------------------------------------");
		
	}//main

}//class
