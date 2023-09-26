package com.klu;
import java.util.*;
public class StrongNumber 
{
	public static Scanner sr=new Scanner(System.in);
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static int digitSumFact(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+factorial(n%10);
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		if(n==digitSumFact(n))
		{
			System.out.println("Yes, it is a Strong number");
		}
		else
		{
			System.out.println("No it is not a strong number");
		}
	}
}