import java.util.*;
public class MatrixApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the array element");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=xyz.nextInt();
			}
		}
		System.out.println("Display array element");
		for(int i=0;i<length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.printf("%d\t",a[i][j]);
				}
			}
				System.out.println("Array Matrix is:");
				for(int i=0;i<length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.printf("%d\t",a[i][j]);
					}
				}
			System.out.println("\n");
	}
}
