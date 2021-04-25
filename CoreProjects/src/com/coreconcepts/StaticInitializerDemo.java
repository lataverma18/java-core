package com.coreconcepts;

class A
{
	static
	{
		System.out.println("static block of A");
	}
}
public class StaticInitializerDemo {

	static
	{
		System.out.println("Static Initializer of My Main Class");
	}
	static
	{
		System.out.println("Static Initializer of My Main Class123");
	}
	public static void main(String[] args) {
		System.out.println("MyMain method");
		
		A a1=new A();

	}
	static
	{
		System.out.println("Static Initializer of My Main Class890");
	}

}
