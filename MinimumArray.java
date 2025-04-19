package AprilTest.org;
import java.util.*;
public class MinimumArray 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("\nDisplay Element");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\n");
		int min=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Number is:"+min);
	}

}
