package AprilTest.org;
import java.util.*;
public class ArrayPairSum
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
		System.out.println("Enter Target Value");
		int t=xyz.nextInt();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]+a[j]==t)
				{
				System.out.println(a[i]+","+a[j]);
				}
			}
		}
		

	}

}
