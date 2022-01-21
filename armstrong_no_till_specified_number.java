package com.Utkarsh;                   
import java.util.Scanner;

public class armstrong_no_till_specified_number {

	public static void main(String[] args) {
		int a=1,b,z,v,t,d,s,p;
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		while(a<=b)
		{   z=0;
			s=0;
			t=a;                                                     //Utkarsh kumar
			v=a;
		while(v!=0)
		{
			v=v/10;
			z++;
		}
		
		while(a!=0)
		{   
			d=a%10;
			p=1;
			for(int i=0;i<z;i++)
			{
				p=p*d;
			}
			s=s+p;
			a=a/10;
		}
		if(s==t)
		{
			System.out.println(s);
		}
		a=t+1;
		}
	}

}
