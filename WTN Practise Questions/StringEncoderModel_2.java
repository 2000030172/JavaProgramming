/*
ENCODED THREE STRINGS (Model-2) 
Anand was assigned the task of coming up with an encoding mechanism for any given three 
strings. He has come up with the following plan. 
Step ONE: Given any three strings, break each string into 3 parts each. 
For example- if the three strings are below: 
Input 1: “John” 
Input 2: “Johny” 
Input 3: “Janardhan” 
“John” should be split into “J”, “oh”, “n,” as the FRONT, MIDDLE and END part, respectively. 
“Johny” should be split into “Jo”, “h”, “ny” as the FRONT, MIDDLE and END, respectively. 
“Janardhan” should be split into “Jan”, “ard”, “han” as the FRONT, MIDDLE and END part, 
respectively. 
i.e. 
1) If the no. of characters in the string are in multiples of 3, then each split –part will 
contain equal no of characters, as seen in the example of “Janadhan”. 
2) If the no. of characters in the string are NOT in multiples of 3 ,and if there is one 
character more than multiple of 3, then the middle part will get the extra character ,as 
seen in the example of “John”. 
3) If the no. of characters in the string are Not in multiples of 3 and if there are two 
characters more than multiple of 3, then the FRONT and END parts will get one extra 
character each, as seen in the example of “Johny”. 
Step TWO: Concatenate (join) the FRONT, MIDDLE and END parts of the string as per the 
below specified concatenation – rule to from three Output strings. 
Output1: FRONT part of input 1 + MIDDLE part of input 2 + END part of input 3 
Output2: MIDDLE part of input1 + END part of input2 + FRONT part of input3 
Output3: END part of the input1 + FRONT part of input2 + MIDDLE part of input3 
For example, for the above example input strings: 
Output1 = “J” + “h” + “han” = “Jhhan” 
Output2 = “oh” + “ny” + “Jan” = “ohnyJan” 
Output3= “n” + “Jo” + “ard” += “nJoard” 
Step THREE: 
Process the resulting output strings based on the output-processing rule. After the above two 
steps, we will now have three output strings. Further processing is required only for the third 
output string as per below rule- 
“Toggle the case of each character in the string”, i.e., in the third output string, all lower-case 
characters should be made upper-case and vice versa. 
For example, for the above example strings, output3 is “nJoard”, so after applying the toggle 
rule. Output3 should become “NjOARD”. 
Final Result – The three output strings after applying the above three steps i.e. for the above 
example. 
Output1 = “Jnhan” 
Output2= “ohnyJan’ 
Output3 = “NjOARD” 
Help Anand to write a program that would do the above.
*/
package com.klu;

import java.util.Scanner;

public class StringEncoderModel_2 
{
	public static Scanner sr=new Scanner(System.in);
	private static String[] splitString(String str) 
	{
		int n=str.length();
		int part;
		
		String front;
		String middle;
		String last;
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
		String s[]=new String[3];
	    s[0]=front;
	    s[1]=middle;
	    s[2]=last;
		return s;
	}
	public static String concatString(String str[])
	{
		String s="";
		for(String x:str)
		{
			s=s+x+" ";
		}
		return s;
	}
	public static String toToggle(String str)
	{
		String result="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				result=result+Character.toLowerCase(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i))) 
			{
				result=result+Character.toUpperCase(str.charAt(i));
			}
			else
			{
				result=result+str.charAt(i);
			}
		}
		return result;
	}
	private static String[] concatDividedStrings(String[] s1, String[] s2, String[] s3) 
	{
		String fml[]=new String[3];
		fml[0]=s1[0]+s2[1]+s3[2];
		fml[1]=s1[1]+s2[2]+s3[0];
		fml[2]=toToggle(s1[2]+s2[0]+s3[1]);
		return fml;
	}
	public static void main(String args[])
	{
		String str1,str2,str3;
		str1=sr.nextLine();
		str2=sr.nextLine();
		str3=sr.nextLine();
		
		String s1[]=splitString(str1);
		String s2[]=splitString(str2);
		String s3[]=splitString(str3);
		
		String fml[]=concatDividedStrings(s1,s2,s3);
		String lmf=concatString(fml);
		System.out.println(lmf);
	}
}
