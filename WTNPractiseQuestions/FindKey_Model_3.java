package WTN;
import java.util.*;
public class FindKey_Model_3 
{
	public static Scanner sr=new Scanner(System.in);
	public static ArrayList<Integer> thous=new ArrayList<>();
	public static ArrayList<Integer> hun=new ArrayList<>();
	public static ArrayList<Integer> tens=new ArrayList<>();
	public static ArrayList<Integer> onces=new ArrayList<>();
	public static int thousValue(int n)
	{
		return n/1000;
	}
	public static int hunValue(int n)
	{
		return (n/100)%10;
	}
	public static int tensValue(int n)
	{
		return (n/10)%10;
	}
	public static int unitsValue(int n)
	{
		return n%10;
	}
	public static int findKey(int a,int b,int c)
	{
		thous.add(thousValue(c));
		thous.add(thousValue(b));
		thous.add(thousValue(a));
		
		hun.add(hunValue(c));
		hun.add(hunValue(b));
		hun.add(hunValue(a));
		
		tens.add(tensValue(c));
		tens.add(tensValue(b));
		tens.add(tensValue(a));
		
		onces.add(unitsValue(c));
		onces.add(unitsValue(b));
		onces.add(unitsValue(a));
		
		int mx=Collections.max(thous);
		int mn=Collections.min(hun);
		int mxx=Collections.max(tens);
		int mnn=Collections.min(onces);
		
		return mx*1000+mn*100+mxx*10+mnn;
	}
	public static void main(String args[])
	{
		int a,b,c;
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		System.out.println(findKey(a,b,c));
	}
}