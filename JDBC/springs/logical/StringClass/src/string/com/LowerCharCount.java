package string.com;
import java.util.Scanner;

class CountLower
{
	public static int count(String str)
	{
		int count=0;
		String c=str;
		
		for(int i=0;i<c.length();i++)
		{
//			if(c.charAt(i)>='a'&& c.charAt(i)<='z')
//			{
//				count++;
//				System.out.print(c.charAt(i)+" ");
//			}
			// numbers 0-9 ==48 - 57
			// A-Z 65-90
			// a-z=97-122
			if(c.charAt(i)>=97&& c.charAt(i)<=122)
			{
				count++;
				System.out.print(c.charAt(i)+" ");
			}
			
			
		}
		System.out.println(" ");
		return count;
	}
}

public class LowerCharCount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println("Total number of lower case in String is ::  "+CountLower.count(str));
	}

}

