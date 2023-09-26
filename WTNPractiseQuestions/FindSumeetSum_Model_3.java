package WTN;
import java.util.*;
public class FindSumeetSum_Model_3
{
	public static Scanner sr=new Scanner(System.in);
	public static int smallNumber(int n)
	{
		ArrayList<Integer> arr=new ArrayList<>();
		while(n!=0)
		{
			arr.add(n%10);
			n=n/10;
		}
		Collections.sort(arr);
		return arr.get(arr.size()-1)*100+arr.get(arr.size()-2)*10+arr.get(arr.size()-3);
	}
	public static void main(String args[])
	{
		int a,b,c,d,e;
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		d=sr.nextInt();
		e=sr.nextInt();
		System.out.println(smallNumber(a)+
		smallNumber(b)+
		smallNumber(c)+
		smallNumber(d)+
		smallNumber(e));
	}
}