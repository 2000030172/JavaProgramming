package com.klu;
import java.util.*;
public class StableSum 
{
	public static Scanner sr=new Scanner(System.in);
	public static boolean isStable(int n)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		while(n!=0)
		{
			int rem=n%10;
			if(hm.containsKey(rem))
			{
				hm.put(rem,hm.get(rem)+1);
			}
			else
			{
				hm.put(rem,1);
			}
			n=n/10;
		}
		for(Map.Entry<Integer,Integer> entry:hm.entrySet())
		{
			hs.add(entry.getValue());
		}
		return hs.size()==1;
	}
	public static void main(String args[])
	{
		int n1,n2,n3,n4,n5;
		n1=sr.nextInt();
		n2=sr.nextInt();
		n3=sr.nextInt();
		n4=sr.nextInt();
		n5=sr.nextInt();
		int sum=0;
		if(isStable(n1))
		{
			sum=sum+n1;
		}
		if(isStable(n2))
		{
			sum=sum+n2;
		}
		if(isStable(n3))
		{
			sum=sum+n3;
		}
		if(isStable(n4))
		{
			sum=sum+n4;
		}
		if(isStable(n5))
		{
			sum=sum+n5;
		}
		System.out.println(sum);
	}
}