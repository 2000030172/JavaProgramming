package com.klu;
import java.util.*;
public class MaximumStableMinimumStable 
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
		int arr[]=new int[5];
		arr[0]=n1;
		arr[1]=n2;
		arr[2]=n3;
		arr[3]=n4;
		arr[4]=n5;
		ArrayList<Integer> stable=new ArrayList<Integer>();
		ArrayList<Integer> unstable=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			if(isStable(arr[i]))
			{
				stable.add(arr[i]);
			}
			else
			{
				unstable.add(arr[i]);
			}
		}
		int mx=Collections.max(unstable);
		int mn=Collections.min(unstable);
		System.out.println(mx+" "+mn);
		System.out.println(mx+mn);
	}
}