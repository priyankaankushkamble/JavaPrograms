import java.util.*;
public class EvenNumberSum 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number (no)");
		int no,i,sum=0;
		no=xyz.nextInt();
		for(i=1;i<=no;i++)
		{
			if(no%2==0)
			{
				sum+=i;
			}
		}
		System.out.println("sum of natural number is"+sum);
	}
}
