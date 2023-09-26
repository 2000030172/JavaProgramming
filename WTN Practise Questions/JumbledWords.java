package WTN;
import java.util.*;
public class JumbledWords 
{
	public static Scanner sr=new Scanner(System.in);
	public static ArrayList<String> splitString(String str)
	{
		ArrayList<String> al=new ArrayList<>();
		int n=str.length();
		int i=0;
		while(i<n)
		{
			String s="";
			while(i<n && str.charAt(i)!=' ')
			{
				s=s+str.charAt(i);
				i++;
			}
			al.add(s);
			i++;
		}
		return al;
	}
	public static String method1(String str)
	{
		String s="";
		int n=str.length();
		for(int i=0;i<n;i=i+2)
		{
			s=s+str.charAt(i);
		}
		if(n%2!=0)
		{
			for(int i=n-2;i>=0;i=i-2)
			{
				s=s+str.charAt(i);
			}
		}
		else
		{
			for(int i=n-1;i>=0;i=i-2)
			{
				s=s+str.charAt(i);
			}
		}
		return s;
	}
	public static String method2(String str)
	{
		String s="",rev="";
		int n=str.length();
		for(int i=0;i<n;i=i+2)
		{
			s=s+str.charAt(i);
		}
		for(int i=1;i<n;i=i+2)
		{
			s=s+str.charAt(i);
		}
		return s+rev;
	}
	public static void main(String args[])
	{
		String str=sr.nextLine();
		int meth=sr.nextInt();
		ArrayList<String> al=splitString(str);
		int n=al.size();
		if(meth==1)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(method1(al.get(i))+" ");
			}
		}
		else if(meth==2)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(method2(al.get(i))+" ");
			}
		}
	}
}