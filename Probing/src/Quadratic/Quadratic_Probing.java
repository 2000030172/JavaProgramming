package Quadratic;
import java.util.*;
public class Quadratic_Probing {
static Scanner sr=new Scanner(System.in);
public static int size=10;
public static Htable ht[] =new Htable[size];
public static void Intialisation()
{
	for(int i=0;i<size;i++)
	{
		ht[i]=null;
	}
}
public static void insert()
{
	int ele=sr.nextInt();
	int hi=ele % size;
	Htable newnode=new Htable();
	newnode.key=ele;
	newnode.next=null;
	if(ht[hi]==null)
	{
		ht[hi]=newnode;
	}
	else
	{
		Htable p;
		for(p=ht[hi];p.next!=null;p=p.next);
		p.next=newnode;
	}
}
public static void find()
{
	int n=sr.nextInt();
	Htable p;
	int flag=0;
	for(p=ht[n % size];p!=null;p=p.next)
	{
		if(p.key==n)
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
public static void display()
{
	for(int i=0;i<size;i++)
	{
		if(ht[i]==null)
		{
			System.out.println("\nHash Table["+i+"] = null");
		}
		else
		{
			System.out.println("\n");
			System.out.print("Hash Table["+i+"] = ");
			Htable p;
			for(p=ht[i];p!=null;p=p.next)
			{
				System.out.print("->"+p.key);
			}
		}
	}
}
public static void main(String args[])
{
	Intialisation();
	while(true)
	{
		System.out.println("*-_-*-_-* Main Menu *-_-*-_-*");
		System.out.println("Implementation of Separarable chaining Probing");
		System.out.println("1. Insertion");
		System.out.println("2. Find");
		System.out.println("3. Display");
		System.out.println("4. Exit");
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
		case 4 : System.exit(0);
		default : System.out.println("*-*-* Enter Proper number from the Main Menu *-*-*");
		break;
		}
	}
}
}