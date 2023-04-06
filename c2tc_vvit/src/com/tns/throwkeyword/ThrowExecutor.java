package com.tns.throwkeyword;

public class ThrowExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			ThrowDemo.avg();
		}
		catch(ArithmeticException e) {
			 System.out.println("caugth"+e);
	}
	}

	}


