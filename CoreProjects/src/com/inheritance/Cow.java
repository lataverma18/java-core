package com.inheritance;

public class Cow extends Animal{
	int i=20;
	@Override
	public void type()
 {
	 System.out.println("It is Herbivorous"+i);
 }
	void oldDef()
	{
		System.out.println("Older Definition"+super.i);
		super.type();
	}
	static void myStaticMethod()  //Method Hiding
	{
		System.out.println("Cow: My Static Method");
	}
}
