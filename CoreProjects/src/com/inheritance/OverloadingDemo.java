package com.inheritance;

public class OverloadingDemo {
	public static void main(String[] args) {
		Shape s=new Shape();
		System.out.println("Area of square "+s.area(20));
		System.out.println("Area of Rectangle "+s.area(10,20));

	}

}
