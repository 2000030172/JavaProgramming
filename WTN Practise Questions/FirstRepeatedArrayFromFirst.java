package WTN;
import java.util.*;
public class FirstRepeatedArrayFromFirst 
{
	public static Scanner sr=new Scanner(System.in);
	public static HashMap<Integer,Integer> hm=new HashMap<>();
	public static int findFirstRepeatedFromFirst(int[] arr) 
	{
		int n=arr.length;
		int count=0;
	    for(int i=0;i<n;i++)
	    {
	    	if(arr[i]>0)
	    	{
		    	if(hm.containsKey(arr[i]))
		    	{
		    		return arr[i];
		    	}
		    	else
		    	{
		    		hm.put(arr[i],1);
		    	}
	    	}
	    	if(arr[i]==0 && arr[i]<0)
	    	{
	    		count++;
	    	}
	    }
	    if(count==n)
	    {
	    	return 0;
	    }
	    return arr[0];
	}
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		int val=findFirstRepeatedFromFirst(arr);
		System.out.print(val);
	}
}