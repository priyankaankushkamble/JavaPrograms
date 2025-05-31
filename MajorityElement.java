package AprilTest.org;
import java.util.*;
public class MajorityElement 
{
	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Element");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>(a.length/2))
			{
				System.out.println("Majority of Element is:"+a[i]);
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Not Found");
		}
	}

}
