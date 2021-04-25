package com.coreconcepts;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int [][]arr=new int[2][];
		
		arr[0]=new int[2];
		arr[1]=new int[3];
		
		for(int i=0;i<2;i++)
		{
			int len=arr[i].length;
			for(int j=0;j<len;j++)
				System.out.print(arr[i][j]+ " ");
			
			System.out.println();
		}
		
		
	
		for(int [] temp:arr)
		{
			for(int t:temp)
			System.out.print(t+ " ");
			
			System.out.println();
		}

	}

}
