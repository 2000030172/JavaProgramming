package pack1;
public class Employee
{
	static Node1 head;
	
	public void search()
	{
	Node1 p;
	int key;
	key=30123;
	int flag=0;
	for(p=head;p!=null;p=p.next)
	{
		if(key==p.id)
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
		System.out.println("Not Found");
	}
	}
	public void find()
	{
		Node1 p;
		for(p=head;p!=null;p=p.next)
		{
			System.out.println("ID ="+p.id);
			System.out.println("Name ="+p.name);
			System.out.println("Weight ="+p.weight);
			System.out.println("Height ="+p.height);
			
		}
	}
}