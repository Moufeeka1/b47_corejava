package com.tns.interfaces;
/*
 * Program to demonstrate Interfaces
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Rectangle(2.5f,10.5f);//create a reference
		System.out.println("area"+s.calculateArea());
		System.out.println("perimeter"+s.calculatePerimeter());

	}

}
