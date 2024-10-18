package com.java8;

interface B{
	int m1(int i, int j);
	
	
}
class My{
	int getM1(int i, int j) {
		System.out.println("get m1 Method..");
		return (i+j);
	}
}

public class MethodReference {
	public static void main(String[] args) {
		
		B b=new My()::getM1;
		
		int res = b.m1(10,20);
		System.out.println(res);

	}

}
