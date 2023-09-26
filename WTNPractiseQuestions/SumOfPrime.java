package com.klu;
import java.util.*;
public class SumOfPrime 
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
		int n;
		n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		ArrayList<Integer> lst=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(isPrime(arr[i]))
			{
				lst.add(arr[i]);
			}
		}
		Collections.sort(lst);
		lst.remove(lst.size()-1);
		int sum=0;
		for(int i=0;i<lst.size();i++)
		{
			sum=sum+lst.get(i);
		}
		System.out.println(sum);
	}
}