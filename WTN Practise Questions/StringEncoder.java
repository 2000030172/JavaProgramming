package com.klu;
import java.util.*;
public class StringEncoder 
{	
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		String str;
		str=sr.next();
		int n=sr.nextInt();
		String s="";
		while(n!=0)
		{
			s=s+str;
			n=n-1;
		}
		System.out.println(s);
	}
}