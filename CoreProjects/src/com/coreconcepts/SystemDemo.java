package com.coreconcepts;

import java.util.Date;

class ABC
{
	protected void finalize() //Method in Object class  (Destructor)
	{
		System.out.println("Perform these operations before Destroying Object");
	}
}
public class SystemDemo {

	public static void main(String[] args) {
System.out.println(System.currentTimeMillis());
		Date d=new Date(System.currentTimeMillis());
		System.out.println(d);
		//System.exit(0);  //Not Suggested
		// 0- fine Termination
		//Non-Zero - Termination with problem
		
		ABC a=new ABC();
		a=null;
		System.gc(); //Invoke gc
		System.out.println("End of the program");
	}
}
