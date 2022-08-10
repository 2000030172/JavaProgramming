package Double_LL;

import java.util.Scanner;


public class Double 
{
	public static Scanner sr=new Scanner(System.in);
    public static Node t,p;
    public static Node head;
    public static void create()
    {
    	System.out.println("Enter size of the array");
    	int n;
		n=sr.nextInt();
		System.out.println("Enter array of elements");
		int a[];
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"st element in the array");
			a[i]=sr.nextInt();
		}
    	for(int i=0;i<n;i++)
    	{
    		Node temp=new Node();
    		temp.data=a[i];
    		temp.next=null;
    		temp.prev=null;
    		if(head==null)
    		{
    			head=temp;
    		}
    		else
    		{
    			for(p=head;p.next!=null;p=p.next);
	    		p.next=temp;
	    		temp.prev=p;
    		}
    	}
    	System.out.println("Successfully Created");
    }
    public static void insert_at_first()
    {
    	if(head==null)
    	{
    		System.out.println("Empty Double Linked List");
    	}
    	else
    	{
    		System.out.println("Enter the element to insert at first position");
    		int ele=sr.nextInt();
    		Node temp=new Node();
    		temp.prev=null;
    		temp.data=ele;
    		temp.next=null;
    		Node p=head;
    		head=temp;
    		temp.next=p;
    		System.out.println("Inserted Successfully");
    	}
    }
    public static void insert_at_end()
    {
    	if(head==null)
    	{
    		System.out.println("Empty Double Linked List");
    	}
    	else
    	{
    		System.out.println("Enter the element to insert at first position");
    		int ele=sr.nextInt();
    		Node temp=new Node();
    		temp.prev=null;
    		temp.data=ele;
    		temp.next=null;
    		if(head==null)
    		{
    			head=temp;
    		}
    		else
    		{
    			Node p;
    			for(p=head;p!=null;p=p.next)
    			{
    				p.next=temp;
    			}
    		}
    		System.out.println("Inserted Successfully");
    	}
    }
    public static void display()
    {
    	if(head==null)
    	{
    		System.out.println("Empty Dll");
    	}
    	else
    	{
    		for(p=head;p!=null;p=p.next) 
    		{
    			System.out.print(" -> "+p.data);
    		}
    	}
    }
    public static int choice()
    {
    	int n;
    	n=sr.nextInt();
    	return n;
    }
    public static void sorted_order()
	{
		int val;
	    if(head== null) 
	    {  
	        System.out.println("Linked List is empty"); 
	    }  
	    else 
	    {
	    	Node current;
	    	Node index;
	        for(current=head;current.next!=null;current=current.next) 
	        {
	            for(index=current.next;index!=null; index=index.next) 
	            {  
	                if(current.data > index.data) 
	                {  
	                    val=current.data;  
	                    current.data = index.data;  
	                    index.data=val;  
	                }  
	            }  
	        }
	        for(p=head;p!=null;p=p.next) 
    		{
    			System.out.print(" -> "+p.data);
    		}
	    }
	}
    public static void main(String args[])
    {
    	while(true)
    	{
    		System.out.println();
    		System.out.println("*-_-*-_-* Main Menu for Double Linked List*-_-*-_-*");
			System.out.println("1. Creation");
			System.out.println("2. Insertion at first position");
			System.out.println("3. Insertion at first position");
			System.out.println("4. Display");
			System.out.println("5. Sorted Order");
			System.out.println("-----------------------------");
			System.out.print("Enter your choice : ");
//    		int cho;
//    		cho=sr.nextInt();
    		switch(choice())
    		{
    		case 1 : create();
    			break;
    		case 2 : insert_at_first();
    			break;
    		case 3 : insert_at_end();
    			break;
    		case 4 : display();
    			break;
    		case 5 : sorted_order();
    			break;
    		default : System.out.println("*-*-* Enter proper number from the Main Menu *-*-*");
			break;
    		}
    	}
    }
}