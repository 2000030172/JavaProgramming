package WTN;
import java.util.*;
public class FindKey_Model_2 
{
	public static Scanner sr=new Scanner(System.in);
	public static ArrayList<Integer> thous=new ArrayList<>();
	public static ArrayList<Integer> hun=new ArrayList<>();
	public static ArrayList<Integer> tens=new ArrayList<>();
	public static ArrayList<Integer> unit=new ArrayList<>();
						
	public static int thousandValue(int n)
	{
		return n/1000;
	}
	public static int hundredValue(int n)
	{
		return (n%1000)/100;
	}
	public static int tensValue(int n)
	{
		return (n%100)/10;
	}
	public static int oncesValue(int n)
	{
		return n%10;
	}
	public static int findKey(int a,int b,int c)
	{
		thous.add(thousandValue(a));
		thous.add(thousandValue(c));
		thous.add(thousandValue(b));
		
		hun.add(hundredValue(b));
		hun.add(hundredValue(a));
		hun.add(hundredValue(c));
		
		tens.add(tensValue(c));
		tens.add(tensValue(b));
		tens.add(tensValue(a));
		
		unit.add(oncesValue(c));
		unit.add(oncesValue(a));
		unit.add(oncesValue(b));
		
		int mn=Collections.max(thous);
		int mx=Collections.min(hun);
		int mnn=Collections.max(tens);
		int mxx=Collections.min(unit);
		
		return mn*1000+mx*100+mnn*10+mxx;
	}
	public static void main(String args[])
	{
		int a,b,c;
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		System.out.println(findKey(a, b, c));
	}
}