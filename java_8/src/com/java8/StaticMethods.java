package com.java8;

interface StaticDemo{
	void m1();
	
	static void m2() {
		System.out.println("Static method..");
	}
}

public class StaticMethods {

	public static void main(String[] args) {
		StaticDemo sd= new StaticDemo() {
			
			@Override
			public void m1() {
				System.out.println("M1 method..");
				
			}
		};
		
		
		sd.m1();
		StaticDemo.m2();

	}

}
