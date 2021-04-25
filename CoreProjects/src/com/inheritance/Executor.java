package com.inheritance;

public class Executor {

	public static void main(String[] args) {
		Manager m1=new Manager("Rahul",101,80000,new Address("e-12","Delhi","Delhi",110001),"Production");
		/*Manager m2=new Manager("Ramika",102,75000,new Address("B-12","Delhi","Delhi",110001),"Sales");
		Manager m3=new Manager("Raj",103,65000,new Address("F-15","Delhi","Delhi",110001),"IT");
		
		System.out.println(m1+" Dept="+m1.getDept());
		System.out.println(m2+" Dept="+m2.getDept());
		System.out.println(m3+" Dept="+m3.getDept());
		
		//instanceof   operator
		//  <object> instanceof <className>-->Returns boolean value
		
		System.out.println(m1 instanceof Manager);*/
		
		
		Animal a=new Cow();  //Not according to the type but according to the content(Object) method is called
		a.type(); //Dynamic Method Dispatching  or Dynamic Linking
		
		
		//All Overriding methods possesses Dynamic Linking
		a.myStaticMethod(); //Not taking part in Dynamic Linking
		
	}	
}
