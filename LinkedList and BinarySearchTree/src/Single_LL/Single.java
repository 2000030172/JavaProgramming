package Single_LL;
import java.util.*;

import Double_LL.Node;

public class Single 
{
	public static Scanner sr=new Scanner(System.in);
	public static Node temp;
	Node next;
	public static int n;
	public static Node head=null;
	public static Node p,t;
	public static void create_SLL()
	{
		System.out.println("Enter size of the array");
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
			if(head==null)
			{
				head=temp;
			}
			else
			{
				Node p;
				for(p=head;p.next!=null;p=p.next);
				p.next=temp;
			}
		}
		System.out.println("Successfully Created");
	}
	public static void insert_at_any_position()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			Node p,t;
			System.out.println("Enter position");
			int pos=sr.nextInt();
			System.out.println("Enter element to insert");
			int val=sr.nextInt();
			int i;
			Node temp=new Node();
			temp.data=val;
			for(i=1,p=head;i<pos;i++,p=p.next)
			{
				t=p;
				t.next=temp;
				temp.next=p;
			}
			System.out.println("Inserted Successfully");
		}
	}
	public static void insert_at_end()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			System.out.println("Enter element to be inserted at the end");
			int ele=sr.nextInt();
			Node temp=new Node();
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
	public static void insert_at_first()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			System.out.println("Enter element to be insert at the first");
			int ele=sr.nextInt();
			Node temp=new Node();
			temp.data=ele;
			temp.next=null;
			Node p=head;
			head=temp;
			temp.next=p;
			System.out.println("Inserted Successfully");
		}
	}
	public static void delete_at_any_position()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			System.out.println("Enter position");
			int pos;
			pos=sr.nextInt();
			int i;
			for(i=1,p=head;i<pos;i++,p=p.next)
			{
				t=p;
			}
			t.next=p.next;
			System.out.println("Deleted value -"+p.data);
			System.out.println("Delected Successfully");
		}
	}
	public static void delete_at_first()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			p=head;
			head=p.next;
			System.out.println("Deleted at the first -"+p.data);
			System.out.println("Delected Successfully");
		}
	}
	public static void delete_at_end()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			for(p=head;p!=null;p=p.next)
			{
				t=p;
			}
			t.next=null;
			for(p=head;p!=null;p=p.next);
			System.out.println("Deleted at the end -"+p.data);
			System.out.println("Delected Successfully");
		}
	}
	public static void display_front()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			for(p=head;p!=null;p=p.next)
			{
				System.out.print(p.data+" -> ");
			}
		}
	}
	public static void reverse_display()
	{
		Node current;
    	Node index;
		int val;
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
	        for(current=head;current.next!=null;current=current.next) 
	        {
	            for(index=current.next;index!=null; index=index.next) 
	            {  
	                val=current.data;  
	                current.data = index.data;  
	                index.data=val;  
	            }  
	        }  
			for(p=head;p!=null;p=p.next)
			{
				System.out.print(p.data+" -> ");
			}
		}
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
	            for(index=current.next;index!=null;index=index.next) 
	            {  
	                if(current.data > index.data) 
	                {  
	                    val=current.data;  
	                    current.data = index.data;  
	                    index.data=val;  
	                }  
	            }  
	        }
	        System.out.print("Sorted Order :");
	        for(p=head;p!=null;p=p.next)
			{
				System.out.print(p.data+" -> ");
			}
	    }
	}
	public static int choice()
	{
		int n;
		n=sr.nextInt();
		return n;
	}
	public static void mean()
	{
		int sum=0;
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			for(p=head;p!=null;p=p.next)
			{
				sum=sum+p.data;
			}
			System.out.println("Mean of the List : "+sum/n);
		}
	}
	public static void maximum()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			int max=head.data;
			for(p=head;p!=null;p=p.next)
			{
//				max=p.data;
//				sum=sum+p.data;
				if(max<p.data)
				{
					max=p.data;
				}
			}
			System.out.println(max);
		}
	}
	public static void minimum()
	{
		if(head==null)
		{
			System.out.println("Empty SLL");
		}
		else
		{
			int min=head.data;
			for(p=head;p!=null;p=p.next)
			{
//				max=p.data;
//				sum=sum+p.data;
				if(min>p.data)
				{
					min=p.data;
				}
			}
			System.out.println(min);
		}
	}
	public static void main(String args[])
	{
		while(true)
		{
			System.out.println("\n");
			System.out.println("*-_-*-_-* Main Menu for Single Linked List*-_-*-_-*");
			System.out.println("1.  Creation");
			System.out.println("2.  Insertion at the first");
			System.out.println("3.  Insertion at any of the position");
			System.out.println("4.  Insertion at the end");
			System.out.println("5.  Deletion at the first");
			System.out.println("6.  Deletion at any of the position");
			System.out.println("7.  Deletion at the end");
			System.out.println("8.  Display");
			System.out.println("9.  Reverse order Display");
			System.out.println("10. Sorting the Order");
			System.out.println("11. Mean");
			System.out.println("12. Maximum value in the Linked List");
			System.out.println("13. Minimum value in the Linked List");
			System.out.println("-----------------------------");
//			int cho;
			System.out.println("Enter ur choice from the main menu");
//			cho=sr.nextInt();
			switch(choice())
			{
			case 1 : create_SLL();
				break;
			case 2 : insert_at_first();
				break;
			case 3 : insert_at_any_position();
				break;
			case 4 : insert_at_end();
				break;
			case 5 : delete_at_first();
				break;
			case 6 : delete_at_any_position();
				break;
			case 7 : delete_at_end();
				break;
			case 8 : display_front();
			    break;
			case 9 : reverse_display();
				break;
			case 10 : sorted_order();
				break;
			case 11 : mean();
				break;
			case 12 : maximum();
				break;
			case 13 : minimum();
				break;
			default : System.out.println("*-*-* Enter proper number from the Main Menu *-*-*");
				break;
			}
		}
	}
}
