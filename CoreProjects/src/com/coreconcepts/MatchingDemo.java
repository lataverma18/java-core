package com.coreconcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingDemo {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("hop");  //p is in precompiled form //d.*)
	String str="hopping,chopping,moping,bhoping";
	Matcher m=p.matcher(str);
	while(m.find())
		System.out.println(m.group()+"\t"+m.start()+"\t"+m.end());
		boolean b=Pattern.matches("hop","hopping,chopping,moping,bhoping");
		System.out.println(b);
	
	
	  /* String input = "Ex1Ao1"; 
			   //Checks for string that start with upper case alphabet and end with digit. 
			      Pattern p = Pattern.compile("^[A-Z][a-z[A-Z][0-9]]*\\d$");
			      Matcher m = p.matcher(input); 
			      if (!m.find()) {
			         System.err.println("Enter  code which  start with upper case alphabet and end with a digit");
	}*/
}
}
