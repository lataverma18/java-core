package com.inheritance;

class A  //Employee
{
	private int i;    //eid,enamre,esal
	void setI(int i)  //getters / setters
	{
		this.i=i;
	}
	void display()		//toString
	{
	System.out.println("i is "+i);	
	}
}

class B extends A			//B-->Manger
{
	/*void setI(int i)
	{
		this.i=i;
	}
	void display()
	{
	System.out.println("i is "+i);	
	}*/
	int j;				//dept
	void setJ(int j)
	{
		this.j=j;
	}
	int getJ()
	{
		return j;
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		B b1=new B();
		b1.setI(10);
		b1.setJ(20);

		b1.display();
	}
}
