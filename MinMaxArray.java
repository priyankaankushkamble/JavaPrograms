import java.util.*;
public class MinMaxArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Display the array element");
		for(int i=0;i<size;i++)
			{
				System.out.printf("%d\t",a[i]);
			}
			System.out.println("\n");
			int max=a[0];
			for(int i=0;i<size;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
				
			}
				
				int min=a[0];
				for(int i=0;i<size;i++)
				{
					if(a[i]<min)
					{
						min=a[i];
					}
				}
				System.out.println("Maximum array is:"+max);
				System.out.println("Minimum array is:"+min);
	}
}