package string.com;
import java.util.Scanner;

class Convert
{
	public static char[] convertarray(String str)
	{
		char [] c=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			c[i]=str.charAt(i);
			
		}
		
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+ " ");
		}
		System.out.println(" ");
		return c;
	}
}

public class StringtoCharArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(Convert.convertarray(str));
		

	}


}
