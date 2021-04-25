package com.coreconcepts;

import java.util.Scanner;

class Empl
{
	private int eid;
	private String ename;
	public Empl(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Empl [eid=" + eid + ", ename=" + ename + "]";
	}
	void display()
	{
		System.out.println("display method");
	}
}
public class ArrayDemo4 {
	public static void main(String[] args) {
		Empl []arr=new Empl[3];
		Scanner sc;
		for(int i=0;i<3;i++)
		{
			sc=new Scanner(System.in);
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			System.out.println("Enter Name:");
			String name=sc.next();
			
			arr[i]=new Empl(id,name);
		}
		
		for(Empl obj:arr)
				System.out.println(obj);
		//arr[0].display(); //null.display();---->  null.  ---->NullPointerException

	}
}
