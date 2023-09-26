package com.klu;
import java.util.*;
public class PlaceAlphabets 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sr.nextInt();
		int arr[]=new int[n];
		int v[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
			v[i]=arr[i];
		}
		Arrays.sort(v);
		char ch[]=new char[n];
		char c='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(v[i]==arr[j])
				{
					ch[j]=c;
					c++;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ch[i]);
		}
	}
}