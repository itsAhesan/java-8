package com.java8;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("Jony","Rahat","JK");
		
		System.out.println("======Using Lambda Expression=====");
		list.forEach(l->System.out.println(l));
		
		System.out.println("======Using Method Reference======");
		list.forEach(System.out::println);

	}

}
