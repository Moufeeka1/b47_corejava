package com.tns.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThread1 t=new CreatingThread1();//new state
		t.start();//implicitly call run method
		t.run();//explicitly call run method
	}

}
