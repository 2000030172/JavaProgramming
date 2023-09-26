package WTN;
import java.util.*;
public class TwoDigitReducedSubstractedForm 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		String str=String.valueOf(n);
		String s="";
		for(int i=0;i<str.length()-1;i++)
		{
			int num1=str.charAt(i)-'0';
			int num2=str.charAt(i+1)-'0';
			System.out.println(num1+"-"+num2+"="+Math.abs(num1-num2));
			s=s+Math.abs(num1-num2);
		}
		System.out.println(s);
	}
}