package com.klu;
import java.util.*;
public class T_Manager 
{
	public static Scanner sr=new Scanner(System.in);
	public static boolean isEven(int n)
	{
		return n%2==0;
	}
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int sumOfPrime(int n)
	{
		int sum=0;
		int count=0;
		int number=2;
		while(count<n)
		{
			if(isPrime(number))
			{
				count++;
				sum=sum+number;
			}
			number++;
		}
		return sum;
	}
	public static int find_tvalue(int input1,int input2,int input3)
	{
		int t=0;
		if(isPrime(input2))
		{
			if(isEven(input2))
			{
				t=input1*input1*sumOfPrime(input2);
			}
			else
			{
				t=input2*input2*sumOfPrime(input3);
			}
		}
		else
		{
			if(isEven(input2))
			{
				t=input3*input3*sumOfPrime(input3+input2);
			}
			else
			{
				t=sumOfPrime(input1+input2+input3);
			}
		}
		if(isPrime(t))
		{
			return t+input3;
		}
		else
		{
			return t-input3;
		}
	}
	public static void main(String args[])
	{
		int input1=sr.nextInt();
		int input2=sr.nextInt();
		int input3=sr.nextInt();
		int value=find_tvalue(input1, input2, input3);
		System.out.println(value);
	}
}