package com.klu;
import java.util.*;
public class Sum_Non_Prime_index 
{
	public static Scanner sr=new Scanner(System.in);
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(!isPrime(i)) 
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
