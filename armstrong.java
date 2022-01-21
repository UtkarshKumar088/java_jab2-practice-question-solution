package com.Utkarsh;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int a,z=0,v,d,s=0,p;
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		v=a;
		int t=a;
		while(v!=0)
		{
			v=v/10;
			z++;                                                          //Utkarsh kumar
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
		System.out.println("Its an Armstrong number");
		else 
		System.out.println("Its not an Armstrong number");
	}

}
