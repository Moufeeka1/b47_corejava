package com.tns.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> numbers=new ArrayList<Integer>();
     numbers.add(10);
     numbers.add(5);
     numbers.add(15);
     System.out.println(numbers);
     Stream<Integer>st=numbers.stream();
     Set<Integer>set=st.collect(Collectors.toSet());
     System.out.println("Set values are"+set);
	}

}
