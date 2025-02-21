package day0221;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Exam0221 {

	public int multiplicationInput() {
		int input=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("구구단 입력");
		input=scan.nextInt();
		scan.close();
		return input;
	}//multiplicationInput
	
	public void printmultiplicationTable(int input) throws MultiplicationException {
		if(!(input >1 && input<10)) {
			throw new MultiplicationException();
		}//end if
		
		System.out.println(input + "단");
		for(int i=1;i<10;i++) {
			System.out.println(input+"*"+i+"="+input*i);
		}
	}

	public static void main(String[] args) {
		Exam0221 e=new Exam0221();
		String msg="구구단 출력 완료";
		
		try {
			e.printmultiplicationTable(e.multiplicationInput());
			
		} catch (MultiplicationException me) {
//			JOptionPane.showConfirmDialog(null, me.getMessage());
			msg=me.getMessage();
			me.printStackTrace();
		}finally {
//			JOptionPane.showMessageDialog(null, msg); //지금 충돌남
		}//end finally

	}//main

}//class
