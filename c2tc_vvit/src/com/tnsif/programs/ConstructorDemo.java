package com.tnsif.programs;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int Id;
		System.out.println("Enter Customer Id");
		Id=sc.nextInt();
		System.out.println("Enter Customer name");
		name=sc.next();
		sc.nextLine();
		System.out.println("Enter Customer city");
		city=sc.next();
		sc.nextLine();
		System.out.println("---------");
		Customer ob=new Customer();
		ob.setCustomerId(Id);
		ob.setCustomerName(name);
		ob.setCustomerCity(city);
		
		

	}

}
