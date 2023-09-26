package WTN;
import java.util.*;
public class FindPassword_Model_8 
{
	public static Scanner sr=new Scanner(System.in);
	public boolean isStable(int n)
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
		FindPassword_Model_8 f=new FindPassword_Model_8();
		ArrayList<Integer> stable=new ArrayList<>();
		ArrayList<Integer> unstable=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			if(f.isStable(v[i]))
			{
				stable.add(v[i]);
			}
			else
			{
				unstable.add(v[i]);
			}
		}
		Collections.sort(stable);
		Collections.sort(unstable);
		System.out.println(stable.get(stable.size()-1)+" "+stable.get(0));
	}
}