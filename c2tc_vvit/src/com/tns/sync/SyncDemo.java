package com.tns.sync;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSync s= new MethodSync();//my class object
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		t1.setName("first thread");
		t2.setName("second thread");
		t3.setName("third thread");
		t1.start();
		t2.start();
		t3.start();
	}


	}


