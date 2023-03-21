package com.tns.superkeyword;
class TestParent{
	void test() {
		System.out.println("This is a parent class");
	}
}

public class TestChild extends TestParent {
	void test() {
		System.out.println("This is a child class");
	}
void display() {
	super.test();
}

}
