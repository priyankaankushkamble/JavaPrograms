package AprilTest.org;
import java.util.*;
public class MaximumArrayEle 
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
		System.out.println("\nDisplay Array");
		for(int i=0;i<size;i++)
		{
			System.out.println(" "+a[i]);
		}
		int max=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum no is:"+max);
	}

}
