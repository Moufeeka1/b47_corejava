package com.tnsif.programs;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car ob=new Car();
ob.backward();
ob.forward();
ob.stop();
Scanner sc=new Scanner(System.in);
System.out.println("Enter");
int reg=sc.nextInt();
System.out.println("reg is"+"  "+ob.amount);
System.out.println("reg is"+reg);
	}

}
