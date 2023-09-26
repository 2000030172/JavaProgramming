package com.klu;
import java.util.*;
public class LastRepeatedElement 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		HashSet<Integer> hs=new HashSet<Integer>();
		int val=0;
		int count=0;
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]>0)
			{
				if(hs.contains(arr[i]))
				{
					val=arr[i];
					break;
				}
				else
				{
					hs.add(arr[i]);
				}
			}
			else
			{
				count++;
			}
		}
		if(count==n)
		{
			val=0;
		}
		System.out.println(val);
	}
}