package WTN;
import java.util.*;
public class IdentifyPossibleWords 
{
	public static Scanner sr=new Scanner(System.in);
	public static String toogleLowerUpperCase(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				s=s+Character.toUpperCase(ch);
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
	public static boolean compareStrings(String s1,String s2)
	{
		for(int i=0;i<s1.length();i++)
		{
			Character ch1=s1.charAt(i);
			Character ch2=s2.charAt(i);
			if(ch1!=ch2 && ch1!='_')
			{
				return false;
			}
		}
		return true;
	}
	public static String specifyTheWords(String str1, String str2) 
	{ 
		ArrayList<String> arr=new ArrayList<>();
		int n=str2.length();
		int i=0;
		while(i<n)
		{
			String str="";
			while(i<n && str2.charAt(i)!=':')
			{
				str=str+str2.charAt(i);
				i++;
			}
			arr.add(str);
			i++;
		}
		str1=toogleLowerUpperCase(str1);
		String s="";
		for(int j=0;j<arr.size();j++)
		{
			if(arr.get(j).length()==str1.length())
			{
				if(compareStrings(str1,toogleLowerUpperCase(arr.get(j))))
				{
					s=s+toogleLowerUpperCase(arr.get(j))+":";
				}
			}
		}
		return s;
	}
	public static void main(String args[])
	{
		String str1;
		str1=sr.next();
		String str2;
		str2=sr.next();
		System.out.println(str2.length());
		System.out.println( specifyTheWords(str1,str2));
	}
}
