package com.klu;
import java.util.*;
public class MergeStrings 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		String str1,str2;
		str1=sr.nextLine();
		str2=sr.nextLine();
		int n1=str1.length();
		int n2=str2.length();
		String s="";
		int i=0,j=0;
		while(i<n1 && j<n2)
		{
			s=s+str1.charAt(i++);
			s=s+str2.charAt(j++);
		}
		while(i<n1)
		{
			s=s+str1.charAt(i++);
		}
		while(j<n2)
		{
			s=s+str2.charAt(j++);
		}
		System.out.println(s);
	}
}
