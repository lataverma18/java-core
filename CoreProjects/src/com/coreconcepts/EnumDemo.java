package com.coreconcepts;

public class EnumDemo {
enum CoffeeSize
{
	BIG(8),HUGE(12),OVERWHELMING(20);
	CoffeeSize(int ounces)
	{
		this.ounces=ounces;
	}
	int ounces;
}
	public static void main(String[] args) {
		CoffeeSize cs=CoffeeSize.BIG;
		System.out.println(cs+"Size is: "+cs.ounces);
	}
}
