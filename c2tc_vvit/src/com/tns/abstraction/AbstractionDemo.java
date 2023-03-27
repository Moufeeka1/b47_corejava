package com.tns.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		Rectangle r=new Rectangle();
		s.calArea();
		s.show();
		r.calArea();
		r.show();
		Shape sh=new Square(3.0f);
        s.calArea();
        s.show();
	}

}
