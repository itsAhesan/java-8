package com.java8;

@FunctionalInterface
interface Functional {
	void m1();

}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {

		Functional functional = () -> {
			System.out.println("m1 method..");
		};
		functional.m1();

	}

}
