package WTN;
import java.util.*;
public class MatchingWord 
{
	public static Scanner sr=new Scanner(System.in);
	public static String sortString(String str)
	{
		char temp[]=str.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	public static void main(String args[])
	{
		int n=sr.nextInt();
		String s1[]=new String[n];
		String s2[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s1[i]=sr.next();
			s1[i]=sortString(s1[i]);
		}
		for(int i=0;i<n;i++)
		{
			s2[i]=sr.next();
			s2[i]=sortString(s2[i]);
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(s1[i]+" ");
//		}
//		System.out.println();
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(s2[i]+" ");
//		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(s1[i].equals(s2[j]))
				{
					System.out.print(j+"");
				}
			}
		}
	}
}