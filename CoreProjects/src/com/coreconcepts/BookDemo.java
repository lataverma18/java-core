package com.coreconcepts;

import java.util.Scanner;

class Book
{
	private String title;
	private int price;
	
	Book(String title,int price)
	{
		String t=title;   //getField("title");
		if(title.length()>4)
			this.title=title;
		else
			System.err.println("Error:Title is not of valid length");
		
		if(price>1 && price<4000)
			this.price=price;
		else
			System.out.println("Error:Price is not Valid");
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}
	
}
public class BookDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		/*String t;
		int p;
		String choice;
		Book b[]=new Book[100];
		int index=0;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Price for Book:");
		p=sc.nextInt();
		System.out.println("Enter Title for Book:");
		t=sc.next();
		b[index]=new Book(t,p);
		System.out.println("Want to enter more Books?(Y/N)");
		choice=sc.next();
		index++;
		}while(choice.equals("Y"));*/
		

	}

}
