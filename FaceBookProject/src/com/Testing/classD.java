package com.Testing;

public class classD {

	public static void main(String[] args) {
		
		ClassC c= new ClassC(100,"TV");
		System.out.println(c.price);
		System.out.println(c.ProductName);
		
		c.add();
		
		ClassC d= new ClassC(200,"CAR");
	}

}
