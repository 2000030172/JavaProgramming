package WTN;
import java.util.*;
public class PersonsAndTokens_Model_1 
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
		Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<str.length;i++) 
        {
            map.put(arr[i],str[i]);
        }
        Arrays.sort(arr);
        for(int num:arr) 
        {
            System.out.println(num+": " +map.get(num));
        }
        HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" "+map.get(arr[i]));
			int curr=arr[i];
			if(i+1<n && arr[i+1]==curr+1)
			{
				hs.add(arr[i]);
				hs.add(arr[i+1]);
			}
		}
        ArrayList<Integer> sortedList = new ArrayList<>(hs);
        Collections.sort(sortedList, Collections.reverseOrder());
        String s="";
        for(int x:sortedList) 
        {
            s=s+map.get(x)+":";
        }
        System.out.println(s);
	}
}