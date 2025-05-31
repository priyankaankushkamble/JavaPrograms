package AprilTest.org;
import java.util.*;
public class RotateArray 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Array Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("\nDisplay Element");
		for(int i=0;i<size;i++)
				{
				System.out.print(" "+a[i]);
				}
		int first=a[0];
		for(int i=0;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		a[size-1]=first;
		System.out.println("\n Array After Rotate");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}
	}

}
