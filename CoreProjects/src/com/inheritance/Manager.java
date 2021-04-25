package com.inheritance;



public class Manager extends Employee{
	private String dept;
	
	public String getDept() {
		return dept;
	}
	Manager()
	{
		System.out.println("Constructing Manager...");
	}

	public Manager(String ename, int eid, int esalary, Address address, String dept) {
		super(ename, eid, esalary, address);  //WE cannot have this() and super() both in a constructor
		this.dept = dept;
	}
}


