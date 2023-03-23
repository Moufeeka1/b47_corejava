package com.tns.staticprog;

public class EmployeeDemo {
	public static void main(String[] args) {
		System.out.println(Employee.CompanyName);
		Employee ob=new Employee("John",10);
		System.out.println(ob);
		ob=new Employee("Sufia",20);
		System.out.println(ob);
		System.out.println(Employee.count);
		
		
		
	}

}
