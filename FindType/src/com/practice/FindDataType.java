package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDataType {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<T;i++)
        {
            String s = sc.next();
            arr.add(s);
        }
		//System.out.println(arr);
		for(String i : arr)
		{
			try
			{
				Long l = Long.parseLong(i);
				System.out.println(l+" can be fitted in:");
				if(l>=-128 && l<=127)
				{
					System.out.println("* byte");
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}
				else if(l>=-32768 && l<=32767)
				{
					System.out.println("* short");
					System.out.println("* int");
					System.out.println("* long");
				}
				else if(l>=-2147483648 && l<=2147483647)
				{
					System.out.println("* int");
					System.out.println("* long");
				}
				else
				{
					System.out.println("* long");
				}
			}
			catch(Exception e)
			{
				System.out.println(i+" can't be fitted anywhere.");
			}
		}
	}

}
