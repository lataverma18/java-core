package com.coreconcepts;

public class ArrayDemo2 {

	public static void main(String[] args) {
	
	int[][]arr=new int[2][3];  //2D Array Created (Row=2, Col=3)
	int arr1[][]=new int[2][3]; //Valid
	
	int []arr2[]=new int[2][3]; //Valid
	
	int [][]arr3=new int[][]{{10,20,30},{20,30,40},{30,30,50}};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			System.out.print(arr3[i][j]+ " ");
		
		System.out.println();
	}
	
	for(int[] temp: arr3)  //arr3--int[]
	{
		for(int temporary: temp)
			System.out.print(temporary+" ");
		
		System.out.println();
	}
	
	}

}
