package com.Utkarsh;
import java.util.Scanner;
public class fibonaciiseries {

	public static void main(String[] args) {
		int a=0,b=1,c=0,d;
		System.out.println("Enter the number till you want fibonacci series : ");
		Scanner sc=new Scanner(System.in);
		d=sc.nextInt();
		while(c<=d)
		{
			System.out.println(c);
			a=b;
			b=c;                                                     //Utkarsh kumar
			c=a+b;
			
			
		}

	}

}
