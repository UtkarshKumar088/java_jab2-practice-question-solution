package com.Utkarsh;
import java.util.Scanner;
public class first_and_last_digit {

	public static void main(String[] args) {
		int a,c=0,z,e,d;
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		z=a;
		while(z!=0)
		{
			z=z/10;
			c++;
		}
		e=c;                                                      //Utkarsh kumar
		while(a!=0)
		{
			d=a%10;
			if(e==1)
			{
				System.out.println("First digit is : "+d);
			}
			if(e==c)
			{
				System.out.println("last digit is : "+d);
			}
			a=a/10;
			e--;
			
		}
	}

}
