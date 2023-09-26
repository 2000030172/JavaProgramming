package WTN;
import java.util.*;
public class SimpleEncodedArray 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		int v[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if(i+1<n)
			{
				v[i]=arr[i+1]-arr[i];
			}
			else
			{
				v[i]=arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(v[i]);
		}
	}
}