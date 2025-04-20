package AprilTest.org;
import java.util.*;
public class RemoveDuplicate
{
	private static final String Sorted = null;

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
			Arrays.sort(a);
				System.out.println("Sorted Array is without duplicate:");
				for(int i=1;i<size;i++)
				{
					if(a[i]!=a[i-1])
					{
						System.out.print(a[i]+" ");
					}
				}
	}

}
