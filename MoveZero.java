package AprilTest.org;
import java.util.*;
public class MoveZero
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("\n Before Move Zero");
		for(int i=0;i<size;i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		int left=0;
		for(int i=0;i<size;i++)
		{
			if(a[i]!=0)
			{
				int temp=a[i];
				a[i]=a[left];
				a[left]=temp;
				left++;
			}
		}
		    System.out.println("\n After Move Zero ");
		    for(int i=0;i<size;i++)
			{
				System.out.printf("%d\t",a[i]);
			}
	}
}		
		
