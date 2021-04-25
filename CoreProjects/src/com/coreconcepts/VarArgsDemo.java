package com.coreconcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Jdk 5, Enhanced ForLoop, VarArgs, enum
public class VarArgsDemo {

	static int sum(int a,int b,int ... vargs)
	{
		int s=a+b;
		for(int i=0;i<vargs.length;i++)
			s=s+vargs[i];
		return s;
	}
	public static void main(String... args) {
		System.out.println(sum(10,20,30,40,50,70,80,90));
		// String to be scanned to find the pattern.
				}
}
