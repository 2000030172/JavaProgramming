package Linear;
import java.util.*;
public class Linear_Probing 
{
	public static int size=10;
	public static final int index=0;
	public static final int key=1;
	static Scanner sr=new Scanner(System.in);
	public static int HT[][]=new int[size][2];
	public static void Intialisation()
	{
		for(int i=0;i<size;i++)
		{
			HT[i][key]=-1;
			HT[i][index]=i;
		}
	}
	public static void insert()
	{
		System.out.println("Enter value to insert");
		int ele=sr.nextInt();
		int hi=ele % size;
		if(HT[hi][key]==-1)
		{
			HT[hi][key]=ele;
		}
		else
		{//int c1=1;//int c2=3;
			for(int i=hi+1;i<size;i++)
			{
				if(HT[i][key]==-1)
				{
					HT[i][key]=ele;
					break;
				}
			}
		}
		System.out.println(" Inserted Successfully ");
	}
	public static void display()
	{
		System.out.println("Display");
		System.out.println("index\t\tkeys");
		for(int i=0;i<size;i++)
		{
			System.out.println("HT["+HT[i][index]+"]="+HT[i][key]);
		}
	}
	public static void find()
	{
		int flag=0;
		int ele;
		System.out.println("Enter element to find");
		ele=sr.nextInt();
		for(int i=0;i<size;i++)
		{
			if(HT[i][key]==ele)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
	public static void main(String args[])
	{
		while(true)
		{
			System.out.println("*-_-*-_-* Main Menu *-_-*-_-*");
			System.out.println("Implementation of Linear Probing");
			System.out.println("1. Insertion");
			System.out.println("2. Find");
			System.out.println("3. Display");
			int cho;
			System.out.println("Enter ur choice from the Main Menu");
			cho=sr.nextInt();
			switch(cho)
			{
			case 1 : insert();
			break;
			case 2 : find();
			break;
			case 3 : display();
			break;
			default : System.out.println("*-*-* Enter Proper number from the Main Menu *-*-*");
			break;
			}
		}
	}
}