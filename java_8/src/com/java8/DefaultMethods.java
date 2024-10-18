package com.java8;

interface Demo{
	
	void m1();
	
	default void m2() {
		System.out.println("Default method..");
	}
}

public class DefaultMethods {

	public static void main(String[] args) {
		
		Demo d= new Demo(){

			@Override
			public void m1() {
				System.out.println("m1 method");
				
			}
			
	};
	
	d.m1();
	d.m2();
	}

}
