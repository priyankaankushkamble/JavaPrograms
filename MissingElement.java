package AprilTest.org;
import java.util.*;
public class MissingElement 
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		int i,j;
		System.out.println("Enter Array element");
		for(i=0;i<size;i++)
		
			a[i]=xyz.nextInt();
			for(i=0;i<size;i++)
			{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			}
						System.out.println("\n Sorted Array is");
						for(i=0;i<size;i++)
						{
							System.out.print(" "+a[i]);
						}
						System.out.println("\nmissing element are");
						for(i=0;i<size-1;i++)
						{
							for(j=a[i]+1;j<a[i+1];j++)
							{
								System.out.printf("\t %d",j);
							}
						}
					}
}

