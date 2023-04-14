package com.tns.lamdaexpression;

public class LamdaWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int x=5;
   Cube c=(int a)->{return a*a*a;};
   System.out.println(c.Calculate(x));
	}

}
