package com.practice;

import java.util.ArrayList;
import java.util.Scanner;


/*
 Evaluate the series :
 (a+2^0.b) ((a+2^0.b)+(a+2^1.b)) ((a+2^0.b)+(a+2^1.b)+(a+2^2.b))........((a+2^0.b)+(a+2^1.b)+(a+2^2.b)+.....+(a+2^n.b))
 
 Sample input :
 2		  -> no of rows
 0 2 10   ->(a b n)
 5 3 5
 
 Sample Output:
 2 6 14 30 62 126 254 510 1022 2046 
 8 14 26 50 98 
 */
public class FindSumOfSeries {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int q = sc.nextInt();
		ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
		for(int i=0;i<q;i++)
		{
			System.out.printf("Enter row %d : ",i+1);
			ArrayList<Integer> arr2 = new ArrayList<>();
			arr2.add(sc.nextInt());
			arr2.add(sc.nextInt());
			arr2.add(sc.nextInt());
			
			arr1.add(arr2);
		}	
		//System.out.println(arr1);
		
		ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();
	   for(ArrayList i : arr1)
	   {
		   arr2.add(show(i));
	   }
	  
	   for(int i = 0;i<arr2.size();i++)
	   {
		   ArrayList<Integer> arr= arr2.get(i);
		   for(Integer a : arr)
		   {
			   System.out.print(a+" ");
		   }
		   System.out.println();
	   }
	  
		
		
	}
	public static ArrayList show(ArrayList<Integer> arr)
	{
		int a = arr.get(0);
		int b = arr.get(1);
		int c = arr.get(2);
		
		ArrayList<Integer> ar = new ArrayList<>();
		int z = a;
		for(int i=0;i<c;i++)
		{
			int x = (int)((Math.pow(2,i))*b);
			z = (z+x);
			ar.add(z);
		}
		return ar;
		
	}
	
	
}
