package com.tns.pacakageone;

public class BaseExxecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		b.varDefault=21;
		b.methodDefault();
		b.varPublic=45;
		b.methodPublic();
		b.varProtected=98;
		b.methodProtected();
		System.out.println(b instanceof Base);

	}

}
