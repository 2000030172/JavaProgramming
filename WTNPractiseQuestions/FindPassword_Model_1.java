package WTN;
import java.util.*;
public class FindPassword_Model_1 
{
	public static Scanner sr=new Scanner(System.in);
	public static boolean isStable(int n)
	{
		int arr[]=new int[10];
		int x=0;
		while(n!=0)
		{
			int e=n%10;
			arr[e]++;
			x=arr[e];
			n=n/10;
		}
		for(int i=0;i<10;i++)
		{
		    if(arr[i]!=x && arr[i]!=0)
		    {
		        return false;
		    }
		}
		return true;
	}
	public static void main(String args[])
	{
		int a,b,c,d,e;
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		d=sr.nextInt();
		e=sr.nextInt();
		int v[]=new int[5];
		v[0]=a;
		v[1]=b;
		v[2]=c;
		v[3]=d;
		v[4]=e;
		int stable=0;
		int unstable=0;
		for(int i=0;i<5;i++)
		{
			if(isStable(v[i]))
			{
				stable++;
			}
			else
			{
				unstable++;
			}
//			System.out.println(v[i]+" "+isStable(v[i]));
		}
		System.out.println(stable*10+unstable);
	}
}