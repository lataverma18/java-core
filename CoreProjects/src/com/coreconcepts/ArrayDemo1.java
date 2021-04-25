package com.coreconcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
	
	void getArray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int []a=new int[0];
		/*System.out.println(a[0]);   //ArrayIndexOutOfBoundsException
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];  //Arrays class is used internally to create java array
		System.out.println(arr); //Reference
		
		for(int i=0;i<n;i++)    //ArrayIndexOutOfBoundsException
		{
			arr[i]=sc.nextInt(); //arr[0]=12,arr[1]=23,arr[2]=34......
		}
		
		
		for(int temp : arr)//Enhanced For Loop  or For Each  ---Collections
		{
			System.out.println(temp);
		}
		*/
		int []arr1={10,20,30,40,50};
		
		//display({10,20,30,40});   //Invalid
		int []ar=Arrays.copyOf(arr1,3);
		for(int temp:ar)
			System.out.println(temp);
		
		int []arr2=new int[]{10,20,30};
	}
}
