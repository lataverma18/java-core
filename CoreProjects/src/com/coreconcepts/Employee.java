package com.coreconcepts;

public class Employee {
	private String ename;
	private int eid;
	private int esalary;
	private Address address;  //has-a   Employee has an instance of Address as data member
	public Employee(String ename, int eid, int esalary, Address address) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esalary = esalary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + ", address=" + address + "]";
	}
}
