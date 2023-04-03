package com.tns.multithreading;

public class ThreadDemo2 {
	public static void main(String[] args) {
		CreatingThread2 t1=new CreatingThread2();
		Thread t=new Thread(t1);
		t.run();
		
		
		
	}

}
