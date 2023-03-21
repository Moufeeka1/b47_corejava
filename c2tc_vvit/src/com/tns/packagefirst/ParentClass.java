package com.tns.packagefirst;

public class ParentClass {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	void methodDefault() {
		System.out.println("Default access ParentClass class");
		System.out.println("Default variable"+varDefault);
	}
	public void methodPublic() {
		System.out.println("Public access ParentClass class");
		System.out.println("Public variable"+varPublic);
	}
	private void methodPrivate() {
		System.out.println("Private access ParentClass class");
		System.out.println("Private variable"+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access ParentClass class");
		System.out.println("Proteted variable"+varProtected);
	}


}


