package com.inheritance;

final class Student
{
	final int id;
	Student()
	{
		id=0;
	}
	Student(int i)
	{
		id=i;
	}
	final void displY()
	{
		
	}
}
class Derived// extends Student
{
	
}
public class FinalDemo {
	
	
	public static void main(String[] args) {
		
		System.out.println("Starting of the program");
	
		Student s1=new Student(101);
		Student s2=new Student(102);
		Student s3=new Student(103);
		
		
		
		System.out.println("Ending of the program");
	}

}
