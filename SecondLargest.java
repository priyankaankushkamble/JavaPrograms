package AprilTest.org;
import java.util.*;
public class SecondLargest 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		int secondlarge =0;
		int large =0;
		for(int i=0;i<size;i++)
		{
				if(a[i]>large)
				{
					secondlarge=large;
					large=a[i];
				}
				else if(a[i]>secondlarge && a[i]!=large) 
	            {
	                secondlarge=a[i];
	            }
		}
		
				if(secondlarge==Integer.MIN_VALUE)
				{
					System.out.println("No Second Large Number is:");
				}  
		
		        else 
		        {
		            System.out.println("Second largest number is: "+secondlarge);
			    }
	}
}
