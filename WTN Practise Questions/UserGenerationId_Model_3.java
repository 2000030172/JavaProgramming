package WTN;
import java.util.*;
public class UserGenerationId_Model_3 
{
	public static Scanner sr=new Scanner(System.in);
	public static String toggleLowerUpperCase(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(Character.isLowerCase(ch))
			{
				s=s+Character.toUpperCase(ch);
			}
			else if(Character.isUpperCase(ch))
			{
				s=s+Character.toLowerCase(ch);
			}
			else
			{
				s=s+ch;
			}
		}
		return s;
	}
	public static void main(String args[])
	{
		String str1=sr.next();
		String str2=sr.next();
		int pin=sr.nextInt();
		int n=sr.nextInt();
		String ss=String.valueOf(pin);
		String first="",second="";
		int l1=str1.length(),l2=str2.length();
		if(l1>l2)
		{
			first=str1;
			second=str2;
		}
		else if(l2>l1)
		{
			first=str2;
			second=str1;
		}
		else
		{
			if(str1.charAt(0)>str2.charAt(0))
			{
				first=str1;
				second=str2;
			}
			else
			{
				first=str2;
				second=str1;
			}
		}
		String sss=first.charAt(first.length()-1)+second+ss.charAt(n-1)+ss.charAt(ss.length()-n);
		System.out.println(toggleLowerUpperCase(sss));
	}
}