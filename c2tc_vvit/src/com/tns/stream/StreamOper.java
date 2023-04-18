package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String>gseven=Arrays.asList("INDIA","USA","JAPAN","FRANCE");
    Stream<String>gsevencountries=gseven.stream();//Stream creation
    Stream<String>hi=gsevencountries.map(x->x.toLowerCase());//Intermediate operation
    String terminal=hi.collect(Collectors.joining(","));
    System.out.println(terminal);
	}

}
