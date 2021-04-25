package com.inheritance;

import com.inheritance.Address;

public class Employee {
	private String ename;
	private int eid;
	private int esalary;
	private Address address; //has-a   Employee has an instance of Address as data member
	Employee()
	{
		
	}
	
	public Employee(String ename, int eid, int esalary, Address address) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.esalary = esalary;
		this.address = address;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override   // MetaData & Rules
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esalary=" + esalary + ", address=" + address + "]";
	}
}
