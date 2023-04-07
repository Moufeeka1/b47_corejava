package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> vvit=new ArrayList<Integer>();
    System.out.println(vvit);
    vvit.add(50);
    vvit.add(10);
    vvit.add(30);
    System.out.println(vvit);
    vvit.remove(1);
    System.out.println(vvit);
    for(Integer ele:vvit) {
    	System.out.println(vvit);
    	
    }
    System.out.println("Total element:"+vvit.size());
    Collections.sort(vvit);
    System.out.println(vvit);
    Collections.reverse(vvit);
    System.out.println(vvit);
    vvit.clear();
    System.out.println(vvit);
	}
    

}
