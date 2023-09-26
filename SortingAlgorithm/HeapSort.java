package SotingAlgorithm;
import java.util.*;
public class HeapSort 
{
	public static Scanner sr=new Scanner(System.in);
	public static void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void heap(int arr[],int root,int l)
	{
		int large=root;
		int left=2*root+1;
		int right=2*root+2;
		if(left<l && arr[left]>arr[large])
		{
			large=left;
		}
		if(right<l && arr[right]>arr[large])
		{
			large=right;
		}
		if(large!=root)
		{
			swap(arr,large,root);
			heap(arr,large,l);
		}
	}
	public static void heapSort(int arr[],int n)
	{
		for(int p=n/2-1;p>=0;p--)
		{
			heap(arr,p,n);
		}
		for(int i=n-1;i>=0;i--)
		{
			swap(arr,0,i);
            heap(arr,0,i);
		}
	}
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		heapSort(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
