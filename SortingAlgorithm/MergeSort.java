package SotingAlgorithm;
import java.util.*;
public class MergeSort 
{
	public static Scanner sr=new Scanner(System.in);
	public static void merge(int arr[],int low,int mid,int high)
	{
		int temp[]=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		while(i<=mid && j<=high)
		{
			if(arr[i]<=arr[j])
			{
				temp[k++]=arr[i++];
			}
			else
			{
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		while(j<=high)
		{
			temp[k++]=arr[j++];
		}
		for(i=low,k=0;i<=high;i++,k++)
		{
			arr[i]=temp[k];
		}
	}
	public static void mergeSortFun(int arr[],int low,int high,int k)
	{
		if(low>=high)
		{
			return;
		}
		int mid=low+(high-low)/2;
		k++;
		mergeSortFun(arr,low,mid,k);
		mergeSortFun(arr,mid+1,high,k);
		merge(arr,low,mid,high);
	}
	public static void mergeSort(int arr[])
	{
		mergeSortFun(arr,0,arr.length-1,1);
	}
	public static void main(String args[])
	{
		int n;
		n=sr.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		mergeSort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
