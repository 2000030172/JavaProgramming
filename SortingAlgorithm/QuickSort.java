package SotingAlgorithm;
import java.util.*;
public class QuickSort 
{
	public static Scanner sr=new Scanner(System.in);
	public static void swap(int arr[],int a,int b)
	{
		int temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void quickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pivot=low;
			int start=low+1;
			int end=high;
			while(true)
			{
				while(start<=end && arr[start]<=arr[pivot])
				{
					start++;
				}
				while(start<=end && arr[end]>arr[pivot])
				{
					end--;
				}
				if(start<=end)					
				{
					swap(arr,start,end);
				}
				if(start>end)
				{
					break;
				}
			}
			swap(arr,pivot,end);
			quickSort(arr,low,end-1);
			quickSort(arr,end+1,high);
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
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
