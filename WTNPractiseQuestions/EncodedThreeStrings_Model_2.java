package WTN;
import java.util.*;
public class EncodedThreeStrings_Model_2 
{
	public static Scanner sr=new Scanner(System.in);
	public static String[] splitString(String str)
	{
		String ss[]=new String[3];
		int len=str.length();
		int part=len/3;
		String front="",middle="",last="";
		if(len%3==0)
		{
			front=str.substring(0,part);
			middle=str.substring(part,2*part);
			last=str.substring(2*part);
		}
		else if((len+1)%3==0)
		{
			front=str.substring(0,part+1);
			middle=str.substring(part+1,2*part+1);
			last=str.substring(2*part+1);
		}
		else
		{
			front=str.substring(0,part);
			middle=str.substring(part,2*part+1);
			last=str.substring(2*part+1);
		}
		ss[0]=front;
		ss[1]=middle;
		ss[2]=last;
		return ss;
	}
	public static void main(String args[])
	{
		String s1,s2,s3;
		s1=sr.next();
		s2=sr.next();
		s3=sr.next();
		String[] ss1=splitString(s1);
		String[] ss2=splitString(s2);
		String[] ss3=splitString(s3);
		System.out.println(ss1[0]+ss2[1]+ss3[2]);
		System.out.println(ss1[1]+ss2[2]+ss3[0]);
		System.out.println(ss1[2]+ss2[0]+ss3[1]);
	}
}