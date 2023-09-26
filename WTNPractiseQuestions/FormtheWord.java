package WTN;
import java.util.*;
public class FormtheWord 
{
	public static Scanner sr=new Scanner(System.in);
	public static ArrayList<String> splitString(String str)
	{
		ArrayList<String> arr=new ArrayList<>();
		int n=str.length();
		int i=0;
		while(i<n)
		{
			String s="";
			while(i<n && str.charAt(i)!=':')
			{
				s=s+str.charAt(i);
				i++;
			}
			arr.add(s);
			i++;
		}
		return arr;
	}
	public static boolean isValid(String str)
	{
		Map<Character,Integer> mp=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(mp.containsKey(str.charAt(i)))
			{
				return true;
			}
			else
			{
				mp.put(str.charAt(i),1);
			}
		}
		return false;
	}
	public static String toggleCase(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				s=s+Character.toUpperCase(str.charAt(i));
			}
			else
			{
				s=s+str.charAt(i);
			}
		}
		return s;
	}
	public static void main(String args[])
	{
		String str=sr.next();
		str=toggleCase(str);
		ArrayList<String> arr=splitString(str);
		String s="";
		for(int i=0;i<arr.size();i++)
		{
			if(isValid(arr.get(i)))
			{
				s=s+(arr.get(i).charAt(0));
			}
			else
			{
				int num=(arr.get(i).charAt(0)-'A')-(arr.get(i).charAt(1)-'A');
				s=s+(char)(num+'A'-1);
			}
		}
		System.out.println(s);
	}
}