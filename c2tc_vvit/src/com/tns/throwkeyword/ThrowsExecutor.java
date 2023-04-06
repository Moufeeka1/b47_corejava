package com.tns.throwkeyword;

public class ThrowsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ThrowsDemo.check();
		}
		catch(ArithmeticException e) {
			System.out.println("Caugth the ex");
		}
			}
	}


