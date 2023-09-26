package WTN;
import java.util.*;
public class UserGenerationId_Model_1 
{
	public static Scanner sr=new Scanner(System.in);
	public static String toggleString(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				s=s+Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch))
			{
				s=s+Character.toUpperCase(ch);
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
		int l1=str1.length();
		int l2=str2.length();
		String first="",second="";
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
				first=str2;
				second=str1;
			}
			else
			{
				first=str1;
				second=str2;
			}
		}
		String s=String.valueOf(pin);
		String ss=second.charAt(second.length()-1)+first+s.charAt(n-1)+s.charAt(s.length()-n);
		System.out.println(toggleString(ss));
	}
}