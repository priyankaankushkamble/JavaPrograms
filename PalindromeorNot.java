package AprilTest.org;
import java.util.*;
public class PalindromeorNot 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Check Palindrome Result:");
		for(int i=0;i<size;i++)
		{
		int rem,rev=0;
		int original=a[i];
		int no=a[i];
		
			while(no!=0)
			{
				rem=no%10;
				no=no/10;
				rev=rev*10+rem;
			}
		   if(original==rev)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("not palindrome");
			}
		}
		}
}

