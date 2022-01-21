package com.Utkarsh;

import java.util.Scanner;

public class star_pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{                                                              //Utkarsh kumar
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
