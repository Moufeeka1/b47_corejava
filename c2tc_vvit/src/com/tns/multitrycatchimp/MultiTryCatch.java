package com.tns.multitrycatchimp;

public class MultiTryCatch {
	int nestedtry(int x,int y) {
		String str="hello";
		str=null;
		int[] arr= {1,2,3};
		int z=0;
		try {
			z=x/y;
			try {
				System.out.println(arr[y]);
				try {
					int slength=str.length();
					System.out.println("string lenght"+slength);
				}
				catch(NullPointerException np) {
					System.out.println("null pointer exception"+np);
				}
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("array index out of bound"+a);
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("division by 0 error"+e);
		}
		/*
		 * finally { System.out.println("finally block"); }
		 */
		return z;
	}

}


