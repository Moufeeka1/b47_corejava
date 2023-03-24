package com.tns.staticmethod;

public class Myclass {
	private int section;
	private static int srNo;
	static {
	 System.out.println("Inside static block");
	 srNo=100;
	}
	Myclass()
	{
		System.out.println("Default Constructor");
		srNo++;
		section++;
	}
	static void display() {
		System.out.println("srNo"+srNo);
	}

}
