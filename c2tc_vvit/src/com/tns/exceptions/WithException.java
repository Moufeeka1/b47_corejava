package com.tns.exceptions;

public class WithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,a;
		try {
			a=22/d;
			System.out.println("This will not be printed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
			
		}
       System.out.println("This will be printed");
	}

}
