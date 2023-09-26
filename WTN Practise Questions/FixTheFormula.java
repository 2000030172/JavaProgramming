package WTN;
import java.util.*;
public class FixTheFormula 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		String str=sr.next();
		System.out.println("String: "+str);
		String op="";
		String num="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			Character ch=str.charAt(i);
			if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
			{
				op=op+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				num=num+ch;
			}
		}
		String s="";
		for(int i=0;i<num.length();i++)
		{
			if(i<op.length())
			{
				s=s+num.charAt(i)+op.charAt(i);
			}
		}
		s=s+num.charAt(num.length()-1);
		System.out.println(s);
		
		int nn=s.length();
		int sum=s.charAt(0)-'0';
		for(int i=1;i<nn;i=i+2)
		{
			Character operation=s.charAt(i);
			int number=s.charAt(i+1)-'0';
			if(operation=='+')
			{
				sum=sum+number;
			}
			else if(operation=='-')
			{
				sum=sum-number;
			}
			else if(operation=='*')
			{
				sum=sum*number;
			}
			else if(operation=='/')
			{
				sum=sum/number;
			}
		}
		System.out.println(sum);
	}
}
