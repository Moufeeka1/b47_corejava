package com.tns.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vector<String> v=new Vector<String>();
    System.out.println(v);
    v.add("Bike");
    v.add("Car");
    v.add("Auto");
    v.add("Bus");
    System.out.println(v);
    v.remove(0);
    System.out.println(v);
    v.addElement("Aeroplane");
    System.out.println(v);
    v.capacity();
    System.out.println(v);
    Collections.sort(v);
    System.out.println(v);
    v.clear();
    System.out.println(v);
	}

}
