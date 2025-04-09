package OOP;
import java.util.*;
public class ReverseApp
{
	public static void main(String[] args)
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the number");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("\nDisplay Array");
		for(int i=0;i<size;i++)
		{
			System.out.println(" "+a[i]);
		}
		System.out.println("\nAfter reverse array");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
	}

}