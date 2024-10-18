package com.java8;

interface Lambda {
	int add(int i, int j);
}

public class LambdaExpression {
	public static void main(String[] args) {

		Lambda lambda = (i,j) -> {
			System.out.println("add method..");
			return (i+j);
		};

		int addition = lambda.add(10,20);
		System.out.println(addition);

	}

}
