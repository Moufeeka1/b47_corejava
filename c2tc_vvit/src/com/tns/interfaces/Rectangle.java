package com.tns.interfaces;

public class Rectangle implements Shape {
	private float length;
	private float breadth;
	public Rectangle(float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		float area=length*breadth;
		return area;
	}

	@Override
	public float calculatePerimeter() {
		// TODO Auto-generated method stub
		float perimeter=2*(length+breadth);
		return perimeter;
	}

}
