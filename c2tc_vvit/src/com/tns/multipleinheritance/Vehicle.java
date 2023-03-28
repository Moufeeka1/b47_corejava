package com.tns.multipleinheritance;

public class Vehicle implements Vehicleone,Vehicletwo {

	@Override
	public void distance() {
		// TODO Auto-generated method stub
		int speed=distance/100;
		System.out.println("speed"+speed);
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		int distance=speed*100;
		System.out.println("distancetravelled"+distance);
		
	}
	

	

}
