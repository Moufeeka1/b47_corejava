package com.tns.nestedcatch;

public class NestedCatchDemo {
	int arr[]=new int[4];//declare an array
	void nestedCatch() {
		try {
		arr[3]=20/0;//Arithmetic exception
		arr[10]=5;//array out of bound exception
		System.out.println("Try block");
		
	}
		catch(ArithmeticException a){
			System.out.println("A number cannot be divided by zero"+a);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array element outside specifies range"+e);
		}
		catch(Exception p) {
			System.out.println("No exceptions match");
		}
			
		}

}
