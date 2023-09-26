/*
Alex works at a clothing store. There is a large pile of socks that must be paired by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

For example, there are n=7 socks with colors ar = {1,2,1,2,1,3,2}. There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

Function Description
Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
sockMerchant has the following parameter(s):
             n: the number of socks in the pile
             ar: the colors of each sock

Input Format
            The first line contains an integer n, the number of socks represented in ar.
            The second line contains n space-separated integers describing the colors ar[i] of the socks in the pile.

Constraints
             1 <= n <= 100
             1 <= ar[i] <= 100 & 0 <= i < n

Output Format
             Return the total number of matching pairs of socks that Alex can sell.

Sample Input
             9
             10 20 20 10 10 30 50 10 20
Sample Output
             3

Explanation
             Alex can match 3 pairs of socks i.e 10-10, 10-10, 20-20
             while the left out socks are 50, 60, 20 
*/
package com.klu;
import java.util.*;
public class CountDuplicates 
{
	public static Scanner sr=new Scanner(System.in);
	public static void main(String args[])
	{
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
			if(tm.containsKey(arr[i]))
			{
				tm.put(arr[i],tm.get(arr[i])+1);
			}
			else
			{
				tm.put(arr[i],1);
			}
		}
//		int count=0;
		for(Map.Entry<Integer,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
//			count=count+entry.getValue()%2;
		}
		System.out.println();
		for(Map.Entry<Integer,Integer> entry:tm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
//		System.out.println(count);
	}
}