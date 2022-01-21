package com.Utkarsh;    //Utkarsh kumar

import java.util.Scanner;

public class pattern_of_number {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a-i;j++)                                    //Utkarsh kumar
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
			
	}

}
