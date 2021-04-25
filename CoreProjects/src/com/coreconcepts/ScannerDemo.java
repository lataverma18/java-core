package com.coreconcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ScannerDemo {

	public static void main(String[] args) {
		
		File f=new File("A.txt");  //A.txt-- 1,23,34
		Scanner sc=null;
		try {
			sc = new Scanner(f); //Space-Default Delimiter
			sc.useDelimiter(",");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=sc.nextInt();
		System.out.println(i);
		i=sc.nextInt();
		System.out.println(i);
		i=sc.nextInt();
		System.out.println(i);
		sc.close();
		/*
		//78enter
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt(); //78(Press enter) 
		System.out.println(i);
		
		Scanner sc2=new Scanner(System.in);
		String name=sc2.nextLine(); //enter   //Helloo!! How are you?
		System.out.println(name);
		
		System.out.println("Enter Dept:");
		Scanner sc1=new Scanner(System.in);
		String dept=sc1.nextLine(); 
		System.out.println(dept);
		
		sc.close();
		sc1.close();
		sc2.close();*/
	}

}
