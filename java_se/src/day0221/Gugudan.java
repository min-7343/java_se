package day0221;

import java.util.Scanner;

public class Gugudan {

	public void printGugudan() throws NumException {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>1 &&num<10) {
			System.out.println(num+"단");
			for(int i=1;i<10;i++) {
				System.out.println(num+" * "+ i+" = "+ num*i );
			} 
		}else {
			throw new NumException();
		}
	}
	
	public void callGugudan() {
		
		try {
			System.out.println("몇단을 하시겠습니까? ");
			printGugudan();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		Gugudan gu=new Gugudan();
		gu.callGugudan();

	}// main

}// class
