package com.klu;
import java.util.*;
public class Stable 
{
	public static Scanner sr=new Scanner(System.in);
	public static int arr[]=new int[10];
	public static boolean isStable(int n)
	{
	    int x=0;
	    while(n!=0)
	    {
	    	int r=n%10;
	    	arr[r]++;
	    	x=arr[r];
	    	n=n/10;
	    }
	    for(int i=0;i<10;i++)
	    {
	    	if(arr[i]!=x && arr[i]!=0)
	    	{
	    		return false;
	    	}
	    }
	    return true;
	}
	public static void StringFrequency(int n)
	{
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		while(n!=0)
		{
			int rem=n%10;
			if(tm.containsKey(rem))
			{
				tm.put(rem,tm.get(rem)+1);
			}
			else
			{
				tm.put(rem,1);
			}
			n=n/10;
		}
		for(Map.Entry<Integer,Integer> entry:tm.entrySet())
		{
			ts.add(entry.getValue());
		}
		if(ts.size()==1)
		{
			System.out.println("Stable");
		}
		else
		{
			System.out.println("Unstable");
		}
		for(Map.Entry<Integer,Integer> entry:tm.entrySet())
		{
			System.out.println("Frequency of "+entry.getKey()+" is "+entry.getValue());
		}
	}
	public static void main(String[] args) 
	{
		int n=sr.nextInt();
//		if(isStable(n))
//		{
//			System.out.println("Stable");
//		}
//		else
//		{
//			System.out.println("unstable");
//		}
//		for(int i=0;i<10;i++)
//		{
//			if(arr[i]!=0)
//			{
//				System.out.println("Frequency of "+i+" is "+arr[i]);
//			}
//		}
		StringFrequency(n);
	}
}