package com.tns.exceptions;

public class NullPointerException {
	public static void main(String[] args) {
		String str=null;
		try {
			str.equals("Hello");
			System.out.println("Bye");
		}
		catch(Exception e) { 
			System.out.println("Null Pointer Exeption");
			
		}
		System.out.println("Hii");
		
	}

}
