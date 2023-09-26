package com.klu;
import java.util.*;
public class Last_First_Name_UserIDGeneration 
{
	public static Scanner sr=new Scanner(System.in);
	public static int leftToright(int pin,int n)
	{
		String str=String.valueOf(pin);
		return str.charAt(n-1)-'0';
	}
	public static int rightToleft(int pin,int n)
	{
		String str=String.valueOf(pin);
		int length=str.length();
		return str.charAt(length-n)-'0';
	}
	public static void main(String args[])
	{
		String first=sr.nextLine();
		String second=sr.nextLine();
		int pin=sr.nextInt();
		int n=sr.nextInt();
		int len1=first.length();
		int len2=second.length();
		
		String small = null,large = null;
		
		if(len1>len2)
		{
			small=second;
			large=first;
		}
		else if(len2>len1)
		{
			large=second;
			small=first;
		}
		else
		{
			String st[]= {first,second};
			Arrays.sort(st);
			small=st[0];
			large=st[1];
		}
		String ans=large.charAt(0)+small+leftToright(pin, n)+rightToleft(pin, n);
		String result="";
		for(int i=0;i<ans.length();i++)
		{
			if(Character.isUpperCase(ans.charAt(i)))
			{
				result=result+Character.toLowerCase(ans.charAt(i));
			}
			else if(Character.isLowerCase(ans.charAt(i))) 
			{
				result=result+Character.toUpperCase(ans.charAt(i));
			}
			else
			{
				result=result+ans.charAt(i);
			}
		}
		System.out.println(result);
	}
}