package string.com;
import java.util.Scanner;

class ToSTring
{
	public static String tostr(int arr[])
	{
		String result="";
		
		for(int i=0;i<arr.length;i++)
		{
			result=result+arr[i];
		}
		
		System.out.println(parseint(result));
		
		return result;
	}
}

public class ArraytoString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(ToSTring.tostr(arr));
	

	}

}
