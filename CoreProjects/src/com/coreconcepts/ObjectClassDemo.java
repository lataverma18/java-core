package com.coreconcepts;

class Emp
{
	int empId;
	String empName;
	public Emp(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
	public int hashCode()
	{
		return empId;
	}
	public boolean equals(Object obj)
	{
		Emp e=(Emp)obj;
		if(hashCode() == e.hashCode())
		{
		if(empId==e.empId && empName.equals(e.empName))
			return true;
		else
			return false;
		}
		return false;	
	}
}
class A1
{
	int i;
	A1(int i)
	{
		this.i=i;
	}
	 public int hashCode()
	 {
		 return 101;
	 }
	 public String toString()
	 {
		 return "i is "+i;
	 }
}
public class ObjectClassDemo {

	public static void main(String[] args) {
		A1 a1=new A1(10);
		A1 a2=a1;
		Integer i1=new Integer(10);
		
		System.out.println(i1.MAX_VALUE);
		System.out.println(a1.getClass());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	
		System.out.println(a1.equals(a2));
		System.out.println(a2);
		System.out.println(a1==a2);
		
		
		
		System.out.println(a1);
		System.out.println(a1.toString());
		
		
		Emp e1=new Emp(101,"Ronit");
		Emp e2=new Emp(101,"Ronit");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}
