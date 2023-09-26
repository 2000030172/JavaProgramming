/*
The “Nambiar Number” Generator: 
M.Nambiar has devised a mechanism to process any given mobile number and thus 
generate a new resultant number. He calls this mechanism as the “Nambiar Number Generator” 
and the resultant number is referred to as the “Nambiar Number”. 
The mechanism is as follows “In the given mobile number, starting with the first digit, 
keep on adding all subsequent digits till the state (even or odd) of 
the sum of the digits is opposite to the state (odd or even) of the first digit. 
Continue this from the subsequent digit till the last digit of the mobile number is reached. 
Concatenating the sums thus generated results in the Nambiar Number.”
 
The below examples will help to illustrate this.
Please also look at the bottom of this problem description for the expected function prototype.
 
Example 1
If the given mobile number is 9880127431
The first pass should start with the first digit.
First digit is 9 which is odd.
So, we will keep adding subsequent digits till the sum becomes even.
9+8=17 (17 is odd, so continue adding the digits)
9+8+8 = 25 (25 is odd, so continue adding the digits)
9+8+8+0 = 25 (25 is odd, so continue adding the digits)
9+8+8+0+1 = 26 (26 is even, which is opposite to the state of the first digit 9)
So, Stop first pass here and remember that the result at the end of first pass =26
 
Now we enter the second pass.
The second pass should start after the digit where we stopped the first pass.
In the first pass we have added the digits 9,8,8,0 and 1.
So, the first digit for second pass will be 2, which is even.
Now, we will keep adding subsequent digits till the sum becomes odd.
2+7=9 (9 is odd, which is opposite to the state of the first digit 2)
So, Stop second pass here and remember that the result at the end of second pass =9
 
Now we enter the third pass.
In the first pass we have added the digits 9,8,8,0 and 1, and the resultant sum was 26.
In the second pass we have added the digits 2 and 7, and the resultant sum was 9.
The third pass should start after the digit where we stopped the second pass.
So, the first digit for third pass will be 4, which is even.
Now, we will keep adding subsequent digits till the sum becomes odd.
4+3=7 (7 is odd, which is opposite to the state of the first digit 4)
So, Stop third pass here and remember that the result at the end of third pass =7
 
Now we enter the fourth pass.
In the first pass we have added the digits 9,8,8,0 and 1, and the resultant sum was 26.
In the second pass we have added the digits 2 and 7, and the resultant sum was 9.
In the third pass we have added the digits 4 and 3, and the resultant sum was 7.
The fourth pass should start after the digit where we stopped the third pass.
So, the first digit for fourth pass will be 1, which is odd.
Now, we will keep adding subsequent digits till the sum becomes even.
However, we realize that this digit 1 is the last digit of the mobile number 
and there are no further digits. 
So, Stop fourth pass here and remember that the result at the end of fourth pass =1
 
For the mobile number 9880127431, the resultant number (Nambiar Number) 
will be the concatenation of the results of the 4 passes = [26][9][7][1] = 26971
 
Note1: Please note that the number of passes required to process 
the given number may vary depending upon the constitution of the mobile number.
Note2: Also note that, 0 should be considered as an even number
 
Example 2
If the given mobile number is 9860857152
First digit 9 is odd.
First pass results in 9+8+6+0+8+5=36
Second pass results in 7+1=8
Third pass results in 5+2=7
Note that the third pass stops at 7 (even though we do not meet a change of state) 
because we have reached the end of the mobile number.
 
For the mobile number 9860857152, the resultant number (Nambiar Number) 
will be the concatenation of the results of the 3 passes = [36][8][7] = 3687
 
Example 3
If the given mobile number is 8123454210
The resultant number (Nambiar Number) will be 95970
 
Example 4
If the given mobile number is 9900114279
The resultant number (Nambiar Number) will be 181149

*/
package com.klu;
import java.util.*;
public class NambiarNumber 
{
	public static Scanner sr=new Scanner(System.in);
	public static String nambiarString(String str,int i)
	{
		int n=str.length();
		if(i>=n)
		{
			return "";
		}
		int first=str.charAt(i)-'0';
		int digitParity=first%2;
		int sum=0;
		while(i<n)
		{
			sum=sum+str.charAt(i)-'0';
			int sumParity=sum%2;
			if(sumParity!=digitParity)
			{
				break;
			}
			i++;
		}
		return (""+sum+nambiarString(str,i+1));
	}
	public static int nnGenerator(String str)
	{
		return Integer.parseInt(nambiarString(str,0));
	}
	public static void main(String args[])
	{
		String str;
		str=sr.next();
		System.out.println(nnGenerator(str));
	}
}