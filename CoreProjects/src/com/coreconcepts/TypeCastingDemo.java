package com.coreconcepts;

import java.util.Arrays;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Backward Type casting
		Object obj=new String("Hello");  //Upcasting
		System.out.println(obj instanceof String);
		String str=(String)obj;  //DownCasting  --->
		System.out.println(str);
		
		byte b2=(byte)128;
		byte b=10;
		int i=b; //Implicit Type casting
		System.out.println(b2);
		
		int i1=65;
		byte b1=(byte)i1; //Explicit Type casting
		System.out.println(b1);
		
			
		float f=65.66f;
		char bool=(char)f;
		System.out.println(bool);
		//char is compatible with Number(int,short,byte,long anf float ,Double)
	}

}
