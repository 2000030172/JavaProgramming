package BST;
import java.util.*;
public class BinarySearchTree 
{
	public static BSTnode root=null;
	public static int val;
	public static Scanner sr=new Scanner(System.in);
	public static BSTnode insert(BSTnode root, int ele)
	{
		if(root==null)
		{
			BSTnode newnode=new BSTnode();
			newnode.data=ele;
			newnode.left=null;
			newnode.right=null;
			return (newnode);
		}
		else if(ele<root.data)
			root.left=insert(root.left,ele);
		else if(ele>root.data)
			root.right=insert(root.right,ele);
		return (root);
	}
	public static void inorder(BSTnode root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(" "+root.data);
			inorder(root.right);
		}
	}
	public static void postorder(BSTnode root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(" "+root.data);
		}
	}
	public static void preorder(BSTnode root)
	{
		if(root!=null)
		{
			System.out.println(" "+root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static void minimum(BSTnode root)
	{
		while(root.left!=null)
		{
			root=root.left;
			System.out.println("Minimum = "+root.data);
		}
	}
	public static void maximum(BSTnode root)
	{
		while(root.right!=null)
		{
			root=root.right;
			System.out.println("Maximum = "+root.data);
		}
	}
	public static int search(BSTnode root, int key)
	{
		if(root==null)
			return 0;
		if(key==root.data)
			return 1;
		else if(key<root.data)
			return (search(root.left, key));
		else if(key>root.data)
			return (search(root.right,key));		
		else
			return 0;
	}
	public static BSTnode delete(BSTnode root)
	{
		if(root==null)
			return root;
		else if(val<root.data)
			root.left=(delete(root.left));
		else if(val>root.data)
			root.right=(delete(root.right));
		else
		{
			if(root.left==null)
			{
				return root.left;
			}
			else if(root.right==null)
			{
				return root.right;
			}
		}
		return root;
	}
	public static int height(BSTnode root)
    {
        if (root==null)
            return -1;
        else
        {
            int left_Height=height(root.left);
            int right_Height=height(root.right);
            /*if (left_Height>right_Height)
                return (left_Height+1);
             else
                return (right_Height+1);*/
            return(Math.max(left_Height, right_Height)+1);
        }
    }
	public static void main(String args[])
	{
		while(true)
		{
		System.out.println("*-*-* Main Menu *-*-*");
		System.out.println("1. Creation");
		System.out.println("2. Inorder");
		System.out.println("3. Postorder");
		System.out.println("4. Preorder");
		System.out.println("5. Minimum Value");
		System.out.println("6. Maximum Value");
		System.out.println("7. Searching");
		System.out.println("8. Delection");
		System.out.println("9. Height of the Binary Tree");
		System.out.println("Enter ur choice");
		int cho;
		cho=sr.nextInt();
		switch(cho)
		{
		case 1 : System.out.println("Enter Element");
		int ele;
		    ele=sr.nextInt();
			root=insert(root,ele);
			System.out.println("Inserted/created Successfully");
		break;
		case 2 : System.out.println("***Inorder form***");
		inorder(root);
		System.out.println();
		System.out.println("Inorder form is executed Successfully");
		break;
		case 3 : System.out.println("***PostOrder form***");
		postorder(root);
		System.out.println();
		System.out.println("Postorder form is executed Successfully");
		break;
		case 4 : System.out.println("***Preorder form***");
		preorder(root);
		System.out.println();
		System.out.println("Preorder form is executed Successfully");
		break;
		case 5 : System.out.println("***Minimum Value***");
		minimum(root);
		System.out.println("Minimum Value is finded Successfully");
		break;
		case 6 : System.out.println("***Maximum Value***");
		maximum(root);
		System.out.println("Maximum value is finded Successfully");
		break;
		case 7 : System.out.println("Searching");
		System.out.println("Enter key value");
		int key;
		key=sr.nextInt();
		int flag;
		flag=search(root, key);
		 if(flag==1)
		 {
		    	System.out.println("Found");
		 }
		 else
		 {
		    	System.out.println("Not Found");
		 }
		System.out.println("Searching Successfully");
		break;
		case 8 : int val;
		System.out.println("Enter value to delete");
		val=sr.nextInt();		
			delete(root);
		System.out.println("value removed =" +val);
		System.out.println("Delection operation executed successfully");
		case 9 : 
		System.out.println("Height of tree is : "+height(root));
		break;
		default : System.out.println("Enter proper number from the Main Menu");
		}
		}
	} 
}