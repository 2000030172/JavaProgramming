package WTN;
import java.util.*;
public class FindPin 
{
	public static Scanner sr=new Scanner(System.in);
	public static ArrayList<Integer> all=new ArrayList<>();
	public static HashMap<Integer,Integer> hm=new HashMap<>();
	public static void calDigit(int a)
	{
		while(a!=0)
		{
			int e=a%10;
			all.add(a%10);
			if(hm.containsKey(e))
			{
				hm.put(e,hm.get(e)+1);
			}
			else
			{
				hm.put(e,1);
			}
			a=a/10;
		}
	}
	public static int maxFreq()
	{
		int maxFrequency = 0;
        int minFrequency = Integer.MAX_VALUE;
        ArrayList<Integer> maxFrequencyNumbers = new ArrayList<>();
        ArrayList<Integer> minFrequencyNumbers = new ArrayList<>();
        for (int num:hm.keySet()) 
        {
            int frequency=hm.get(num);

            if (frequency>maxFrequency) 
            {
                maxFrequency=frequency;
                maxFrequencyNumbers.clear();
                maxFrequencyNumbers.add(num);
            }
            else if (frequency==maxFrequency) 
            {
                maxFrequencyNumbers.add(num);
            }
            if (frequency<minFrequency) 
            {
                minFrequency=frequency;
                minFrequencyNumbers.clear();
                minFrequencyNumbers.add(num);
            }
            else if (frequency==minFrequency) 
            {
                minFrequencyNumbers.add(num);
            }
        }
        return Collections.max(maxFrequencyNumbers)*10+Collections.min(minFrequencyNumbers);
	}
	public static void allDigits(int a,int b,int c)
	{
		calDigit(a);
		calDigit(b);
		calDigit(c);
	}
	public static int findKey(int a,int b,int c)
	{		
		allDigits(a,b,c);
		
		int mn=Collections.max(all);
		int mx=Collections.min(all);
		int mnn=maxFreq();
		return mn*1000+mx*100+mnn;
	}
	public static void main(String args[])
	{
		int a,b,c;
		a=sr.nextInt();
		b=sr.nextInt();
		c=sr.nextInt();
		System.out.println(findKey(a, b, c));
	}
}