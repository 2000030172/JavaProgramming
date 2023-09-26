package com.klu;
import java.util.*;
public class CipherText 
{
	public static Scanner sr=new Scanner(System.in);
	public static ArrayList<String> strbreaker(String str) 
	{
	    ArrayList<String> arr=new ArrayList<String>();
	    int len=str.length();
	    int i=0;
	    try 
	    {
	        while(i<len) 
	        {
	            String s="";
	            while (i<len && str.charAt(i)!=' ') 
	            {
	                s=s+str.charAt(i);
	                i++;
	            }
	            arr.add(s);
	            i++;
	        }
	    }
	    catch (Exception e) 
	    {
	        System.out.println("Error: " + e.getMessage());
	    }   
	    return arr;
	}
	public static String reverseString(String str)
	{
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		return s;
	}
	public static String alphabetIncrease(String str,int n)
	{
		String s="";
		s=s+str.charAt(0);
		for(int i=1;i<str.length()-1;i++)
		{
			int value=(int)str.charAt(i)+(n-1);
			s=s+(char)value;
		}
		s=s+str.charAt(str.length()-1);
		return s;
	}
	public static void main(String args[])
	{
		String str=sr.nextLine();
		ArrayList<String> arr=strbreaker(str);
		System.out.println("Count of words: "+arr.size());
		System.out.print("Reverse of each word: ");
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(reverseString(arr.get(i))+" ");
		}
		System.out.println();
		System.out.print("Length of each word: [");
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i).length()+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("Every alpabet increased by L-1: ");
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(alphabetIncrease(reverseString(arr.get(i)),arr.get(i).length())+" ");
		}
	}
}