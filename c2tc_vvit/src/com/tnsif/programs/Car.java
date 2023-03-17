package com.tnsif.programs;

public class Car {
	int model;
	String color;
	int reg;
	int amount=900000;
	void forward() {
		System.out.println("Car is moving forward");
	}
    void backward() {
    	System.out.println("Car is moving backward");
    }
    void stop() {
    	System.out.println("Car has stopped");
    }
}
