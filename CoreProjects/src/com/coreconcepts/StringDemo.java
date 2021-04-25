package com.coreconcepts;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		String str3=new String("Hello");
		String str4=new String("Hello");
		System.out.println(str1 +" World"); //str1=Hello
		System.out.println(str1==str2);
		System.out.println(str3.concat(" World"));
		System.out.println(str3);
		
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.append(" World"));
		System.out.println(sb);
		
		char []myCharArray={'A','R','U','N','V','E','R','M','A'};
		String str=new String(myCharArray);
		System.out.println(str.substring(2,5));
		String s="20/12/2020";
		String []arr=s.split("/");
		int len=arr.length;
		for(int i=0;i<len;i++)
			System.out.println(arr[i]);
		
		StringTokenizer st=new StringTokenizer("Hello!!! How are you?");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
