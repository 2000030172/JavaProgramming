/*
You are provided with TWO words. You are expected to split each word into THREE parts each,
and create a password using the below rule –
Password = Second part of word1+ Third part of word 2 + First part of word1 + First part of word 2
For splitting a given word into three parts the below approach should be used
If word= "ABC" then part1=A, part2=B and part3=C
if word= "ABCD" then part1=A, part2=BC and part3=D
if word= "ABCDE" then part1=AB, part2=C and part3=DE
if word= "ABCDEF" then part1=AB, part2=CD and part3=EF
if word= "ABCDEFG" then part1=AB, part2=CDE and part3=FG
if word = "ABCDEFGH" then part1=ABC, part2=DE and part3=FGH
and so on
i.e., 
1) If the length of the given word can be equally divided into three parts, 
then each part gets the same number letters (as seen in above examples of "ABC" and "ABCDEF") 
2) If after dividing the length of the given word into three parts, 
there is one extra character left, then the extra Character goes to the middle part i.e., part2. 
(as seen in above examples of "ABCD" and "ABCDEFG")
3) If after dividing the length of the given word into three parts, 
there are two extra characters left, then part1 and part3 get the extra characters 
(as seen in above examples of "ABCDE" and "ABCDEFGH")

Let us now look at the below examples

Example 1: input1="WIPRO" input 2="TECHNOLOGIES"
Output should be "PGIESWITECH"
Explanation -
The three parts of WIPRO will be "WI", "P" and "RO"
The three parts of TECHNOLOGIES will be "TECH", "NOLO" and "GIES"
So, 
Password = Second part of word1+ Third part of word 2 + First part of word1 + First part of word 2
=P + GIES + WI + TECH  
= PGIESWITECH

Example 2: input="MACHINE" input 2="LEARNING"
Output should be "CHIINGMALEA"
Explanation -
The three parts of MACHINE will be "MA", "CHI" and "NE"
The three parts of LEARNING will be "LEA", "RN", and "ING"
So, 
Password = Second part of word1+ Third part of word 2 + First part of word1 + First part of word 2
= CHI + ING + MA + LEA
= CHIINGMALEA
*/
package com.klu;
import java.util.*;
public class EncodedTwoStringsModel_3 
{
	public static Scanner sr=new Scanner(System.in);
	public static String[] splitString(String str)
	{
		int n=str.length();
		int part=n/3;
		String front,middle,last;
//		front=str.substring(0,part);
//		middle=str.substring(part,2*part);
//		last=str.substring(2*part);
		if(n%3==0)
		{
			part=n/3;
			front=str.substring(0,part);
			middle=str.substring(part,2*part);
			last=str.substring(2*part);
		}
		else if((n+1)%3==0)
		{
			part=n/3;
			front=str.substring(0,part+1);
			middle=str.substring(part+1,2*part+1);
			last=str.substring(2*part+1);
		}
		else
		{
			part=n/3;
			front=str.substring(0,part);
			middle=str.substring(part,2*part+1);
			last=str.substring(2*part+1);
		}
		String fml[]=new String[3];
		fml[0]=front;
		fml[1]=middle;
		fml[2]=last;
		return fml;
	}
	public static String[] concatDividedStrings(String str1[],String str2[])
	{
		String str[]=new String[4];
		str[0]=str1[1];
		str[1]=str2[2];
		str[2]=str1[0];
		str[3]=str2[0];
		return str;
	}
	public static String concatString(String[] str)
	{
		String s="";
		for(String x:str)
		{
			s=s+x+" ";
		}
		return s;
	}
	public static void main(String args[])
	{
		String str1="ABCDE"; 
		str1=sr.nextLine();
		String str2="ABCDEFG"; 
		str2=sr.nextLine();
		
		String s1[]=splitString(str1);
		String s2[]=splitString(str2);
		
		String s3[]=concatDividedStrings(s1, s2);
		System.out.println(concatString(s1));
		System.out.println(concatString(s2));
		System.out.println(concatString(s3));
	}
}
