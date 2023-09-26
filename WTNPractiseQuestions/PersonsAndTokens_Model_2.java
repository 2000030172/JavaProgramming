package WTN;
import java.util.*;
public class PersonsAndTokens_Model_2 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		String str[]=new String[n];
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sr.next();
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		Map<Integer,String> mp=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			mp.put(arr[i],str[i]);
		}
		Arrays.sort(arr);
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" "+mp.get(arr[i]));
			int curr=arr[i];
			if(i+1<n && arr[i+1]==curr+1)
			{
				hs.add(arr[i]);
				hs.add(arr[i+1]);
			}
		}
		ArrayList<Integer> al=new ArrayList<>(hs);
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i)+" :: "+mp.get(al.get(i)));
		}
	}
}