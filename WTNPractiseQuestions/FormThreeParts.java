package WTN;
import java.util.*;
public class FormThreeParts 
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
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
		}
		ArrayList<Integer> al=new ArrayList<>(hm.values());
		Collections.sort(al);
		int highestFrequency=al.get(al.size()-1);
        int secondHighestFrequency=al.get(al.size()-2);
        int leastFrequency=al.get(0);
        int part1=-1,part2=-1,part3=-1;
        for (Map.Entry<Integer,Integer> entry:hm.entrySet()) 
        {
            if(entry.getValue()==highestFrequency && entry.getKey()>part1) 
            {	
                part1=entry.getKey();
            }
            else if(entry.getValue()==secondHighestFrequency && entry.getKey() > part2) 
            {
                part2=entry.getKey();
            }
            else if(entry.getValue()==leastFrequency && (part3==-1 || entry.getKey()<part3)) 
            {
                part3=entry.getKey();
            }
        }

        String password = part2+""+part1;
        System.out.println("Password: " + password);
        int pass=Integer.parseInt(password);
        System.out.println(pass);
	}
}
