package WTN;
import java.util.*;
public class AlternateAddSum 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=sr.nextInt();
		int p=sr.nextInt();
		int temp=n;
		int sum=0;
		if(p==1)
		{
			for(int i=n;i>=1;i--)
			{
				if(i%2==0)
				{
					sum=sum+i;
				}
				else
				{
					sum=sum-i;
				}
			}
		}
		else
		{
			for(int i=n;i>=1;i--)
			{
				if(i%2==0)
				{
					sum=sum-i;
				}
				else
				{
					sum=sum+i;
				}
			}
			sum=sum+temp+temp;
		}
		System.out.println(sum);
//		System.out.println(sum+" "+add);
	}
}