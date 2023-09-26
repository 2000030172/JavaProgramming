package WTN;
import java.util.*;
public class FindKey_Model_1 
{
	public static Scanner sr=new Scanner(System.in);
	public static int largestNumber(int n,int k)
	{
		ArrayList<Integer> arr=new ArrayList<>();
		while(n!=0)
		{
			arr.add(n%10);
			n=n/10;
		}
		Collections.sort(arr);
		if(k==1)
		{
			return arr.get(arr.size()-1);
		}
		return arr.get(arr.size()-2);
	}
	public static void main(String args[])
	{
		int a,b,c;
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		System.out.println(
				largestNumber(a,1)+
				largestNumber(b,1)+
				largestNumber(c,1)+
				largestNumber(c,2)+
				largestNumber(b,2)+
				largestNumber(a,2)
				);
	}
}